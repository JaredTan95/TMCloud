/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.service;

import io.github.wesleysugarfree.tmcloud.common.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapper;
import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserMapperExt userMapperExt;

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    public BaseResult<User> login(User user) {
        BaseResult<User> br = new BaseResult<>();
        List<User> uLists = userMapperExt.selectSelective(user);
        if (uLists.size() > 0) {
            User u = uLists.get(0);
            //该用户存在，返回用户信息
            logger.info("用户「{}」登录成功. ", u.getsUaccount());
            return br.setContent(u).setMessage("Confirm successful.");
        } else {
            //该用户不存在，返回空信息
            return br.setContent(null).setMessage("Confirmed failure.");
        }
    }

    public BaseResult<User> register(User user) {
        BaseResult<User> br = new BaseResult<>();
        List<User> uLists = userMapperExt.selectSelective(user);
        if (uLists.size() > 0) {
            //该用户已存在，不能注册
            return br.setCode("200").setMessage("The user already exists.");
        } else if (userMapper.insertSelective(user) > 0) {
            logger.info("用户「{}」注册成功. ", user.getsUaccount());
            User u = userMapperExt.selectSelective(user).get(0);
            return br.setContent(u).setMessage("Registered successfully.");
        } else {
            return br.setContent(null).setMessage("Registered failure.");
        }
    }

    public BaseResult<User> readOneById(int id) {
        return new BaseResult<User>().setContent(userMapper.selectByPrimaryKey(id));
    }

    public BaseResult<User> updateOne(User user) throws Exception {
        try {
            if (userMapper.updateByPrimaryKeySelective(user) > 0) {
                logger.info("用户「{}」更新成功. ", user.getsUaccount());
                return new BaseResult<User>().setContent(user).setMessage("Updated successfully.");
            } else {
                return new BaseResult<User>().setContent(user).setMessage("Updated failure.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
