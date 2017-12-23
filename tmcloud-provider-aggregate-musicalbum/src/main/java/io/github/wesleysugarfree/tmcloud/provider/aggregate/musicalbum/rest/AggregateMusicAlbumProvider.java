/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.rest;

import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicAlbum;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.service.AggregateMusicAlbumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/musicalbum")
public class AggregateMusicAlbumProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(AggregateMusicAlbumProvider.class);

    @Resource
    private AggregateMusicAlbumService musicAlbumService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<Long> test() throws Exception {
        return musicAlbumService.getCount();
    }

    /**
     * 根据专辑Id获取专辑列表基本信息
     *
     * @param albumId
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/album/{albumId}", method = RequestMethod.GET)
    public BaseResult<MusicAlbum> get(@PathVariable int albumId) throws Exception {
        return musicAlbumService.getSongByAlbumId(albumId);
    }

    /**
     * 通过Post方式创建一个用户
     *
     * @param user
     * @return BaseResult
     * @throws Exception
     */
   /* @RequestMapping(method = RequestMethod.POST)
    public BaseResult<User> post(User user) throws Exception {
        return userService.register(user);
    }*/

    /**
     * 通过PUT请求更新一个用户信息
     *
     * @param user
     * @throws Exception
     */
    /*@RequestMapping(method = RequestMethod.PUT)
    public BaseResult<User> put(User user) throws Exception {
        return userService.updateOne(user);
    }*/

    /**
     * 默认不允许获取所有用户
     *
     * @return BaseResult
     * @throws Exception
     */
   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<User> getUsers() throws Exception {
        return null;
    }*/

    /**
     * 默认不允许删除某个用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
   /* @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<User> delete(@PathVariable int id) throws Exception {
        return null;
    }*/


}
