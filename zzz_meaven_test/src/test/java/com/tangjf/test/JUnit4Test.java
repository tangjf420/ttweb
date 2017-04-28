package com.tangjf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tangjf.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring/*.xml")
public class JUnit4Test extends AbstractJUnit4SpringContextTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void test() {
		try {

			System.out.println(userMapper.get(1).getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}