package com.jacarrichan.research.sm.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jacarrichan.research.sm.model.User;
import com.jacarrichan.research.sm.service.UserServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
// = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:springMybatis.xml" })
public class TestMybatis {

    private static final Logger logger = Logger.getLogger(TestMybatis.class);

    private UserServiceI muserService;


    public UserServiceI getMuserService() {
        return muserService;
    }


    @Autowired
    public void setMuserService(UserServiceI muserService) {
        this.muserService = muserService;
    }


    @Test
    public void testGetALL() {

        List<User> list = muserService.getAll();
        logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
    }


    @Test
    public void testInsert() {

        User muser = new User();
        muser.setId("0000");
        muser.setName("aaaa");
        muser.setAge(1234);
        muser.setAddress("ABCD");
        int i = muserService.insert(muser);
        logger.info(JSON.toJSONStringWithDateFormat("add " + i, "yyyy-MM-dd HH:mm:ss"));
    }


    @Test
    public void testUpdate() {

        User muser = new User();
        muser.setId("0000");
        muser.setName("bbbb");
        muser.setAge(1234);
        muser.setAddress("ABCD");
        int i = muserService.update(muser);
        logger.info(JSON.toJSONStringWithDateFormat("update " + i, "yyyy-MM-dd HH:mm:ss"));
    }


    @Test
    public void testDelete() {

        User muser = new User();
        muser.setId("0000");
        muser.setName("bbbb");
        muser.setAge(1234);
        muser.setAddress("ABCD");
        int i = muserService.delete("0000");
        logger.info(JSON.toJSONStringWithDateFormat("delete " + i, "yyyy-MM-dd HH:mm:ss"));
    }

}
