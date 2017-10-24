/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.dao.test;

import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapper;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapperExt userMapperExt;


    /**
     * 测试通过主键进行查询
     * @throws Exception
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Assert.assertNotNull(userMapper.selectByPrimaryKey(1));
    }

    /**
     * 测试插入一条记录并将此记录删除
     */
    @Test
    public void insertAndDeleteTest() {
        User user = new User();
        user.setsUserid(1000);
        user.setsUaccount("tanjian1002");
        user.setsUpwd("tj1002");
        user.setsUpwdsalt("tanjian");
        user.setsUnickname("无糖v");
        user.setsUemail("tanjian2015010101001010101@163.com");

        Assert.assertEquals(1, userMapper.insert(user));

        Assert.assertEquals(1, userMapper.deleteByPrimaryKey(user.getsUserid()));
    }

    /**
     * 测试可选择的查询,结果可能是一个集合
     */
    @Test
    public void selectSelectiveTest() {
        User user = new User();
        //user.setsUaccount("tanjian");
        //user.setsUpwd("Tanjian1002");
        user.setsUpwdsalt("tj");
        //user.setsUnickname("无糖");
        //user.setsUemail("tanjian20150101@163.com");
        Assert.assertEquals(2,userMapperExt.selectSelective(user).size());
    }

    /**
     * 测试根据主键更新，并还原结果
     */
    @Transactional
    @Test
    public void updateAndResetTest(){
        User user=new User();
        user.setsUserid(1);
        user.setsUaccount("ceshi");
        user.setsUpwd("ceshi");
        user.setsUpwdsalt("ceshi");
        user.setsUnickname("ceshi");
        user.setsUemail("ceshi");

        Assert.assertEquals(1,userMapper.updateByPrimaryKey(user));

        User user1=new User();
        user1.setsUserid(1);
        user1.setsUaccount("tanjian");
        user1.setsUpwd("Tanjian1002");
        user1.setsUpwdsalt("tj");
        user1.setsUnickname("无糖");
        user1.setsUemail("tanjian20150101@163.com");

        Assert.assertEquals(1,userMapper.updateByPrimaryKeySelective(user1));

    }
}