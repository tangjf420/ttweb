package com.tangjf.test;

import java.io.InputStream;
import java.util.Objects;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tangjf.dto.UserDto;

public class Test {

	public static void main(String[] args) {
		SqlSession session = null;
		try {
			String resource = "cfg.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession(true);
			UserDto userDto = (UserDto) session.selectOne("com.tangjf.dao.UserMapper.getUser", 1);
			System.out.println(userDto.getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}
	}
}
