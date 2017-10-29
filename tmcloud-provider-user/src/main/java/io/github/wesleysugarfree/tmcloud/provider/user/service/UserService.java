/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.service;

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

    public User login(User user) {
        try {
            List<User> uLists = userMapperExt.selectSelective(user);
            if (uLists.size() > 0) {
                return uLists.get(0);//该用户存在，返回用户信息
            }
            return null;
        } catch (Exception e) {
            logger.info("", e.getMessage());
            return null;
        }
    }

    public User register(User user) {
        try {
            List<User> uLists = userMapperExt.selectSelective(user);
            if (uLists.size() > 0) {
                return null;//该用户已存在，不能注册
            } else {
                return userMapper.insertSelective(user) > 0 ? user : null;
            }
        } catch (Exception e) {
            logger.info("", e.getMessage());
            return null;
        }
    }
}
