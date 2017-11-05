/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.service;


import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapper;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserMapperExt userMapperExt;

    @Test
    public void loginServiceTest(){
        User u=new User();
        u.setsUaccount("tanjian");
        u.setsUpwd("Tanjian1002");
        Assert.assertEquals("tanjian",userService.login(u).getContent().getsUaccount());
    }

    @Test
    public void registerServiceTest(){
        User user=new User();
        user.setsUserid(1003);
        user.setsUaccount("testAccount");
        user.setsUpwd("testAccount");
        user.setsUpwdsalt("test");

        Assert.assertNotNull(userService.register(user).getContent());

        int insertedId=userMapperExt.selectSelective(user).get(0).getsUserid();

        /*消除记录*/
        Assert.assertEquals(1,userMapper.deleteByPrimaryKey(insertedId));
    }
}
