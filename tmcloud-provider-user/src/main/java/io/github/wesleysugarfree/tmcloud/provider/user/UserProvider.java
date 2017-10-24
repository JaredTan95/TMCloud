/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user;

import io.github.wesleysugarfree.tmcloud.provider.user.dao.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProvider.class);

    @Resource
    private UserMapper userMapper;


}
