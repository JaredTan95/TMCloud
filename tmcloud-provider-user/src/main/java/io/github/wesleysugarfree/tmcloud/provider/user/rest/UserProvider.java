/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.user.rest;

import io.github.wesleysugarfree.tmcloud.provider.user.dao.domain.User;
import io.github.wesleysugarfree.tmcloud.provider.user.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class UserProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProvider.class);

    @Resource
    private UserService userService;

    /**
     * 根据用户Id获取用户基本信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<User> get(@PathVariable int id) throws Exception {
        return userService.readOneById(id);
    }

    /**
     * 通过Post方式创建一个用户
     *
     * @param user
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<User> post(User user) throws Exception {
        return userService.register(user);
    }

    /**
     * 通过PUT请求更新一个用户信息
     *
     * @param user
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<User> put(User user) throws Exception {
        return userService.updateOne(user);
    }

    /**
     * 默认不允许获取所有用户
     *
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<User> getUsers() throws Exception {
        return null;
    }

    /**
     * 默认不允许删除某个用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<User> delete(@PathVariable int id) throws Exception {
        return null;
    }
}
