package com.tangjf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tangjf.member.service.IMemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring/applicationContext.xml")
public class JUnit4Test extends AbstractJUnit4SpringContextTests {

    @Autowired(required = false)
    IMemberService memberService;

    @Test
    public void test() {
        System.out.println(memberService.login("123", "123"));
    }
}