package com.tangjf.test;

import java.io.InputStream;
import java.util.Objects;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tangjf.dto.User;

public class Test {

    public static void main(String[] args) {
        SqlSession session = null;
        try {
            String resource = "cfg.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession(true);
            User user =
                (User) session.selectOne("com.tangjf.dao.UserMapper.get", 1);
            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(session)) {
                session.close();
            }
        }
    }
}
