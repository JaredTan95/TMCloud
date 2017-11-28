/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.rest;

import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain.UserComment;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.service.UserCommentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userComments")
public class UserCommentProvider {
    @Resource
    private UserCommentService userCommentService;

    /**
     * 通过歌曲ID获取歌曲评论信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<UserComment> get(@PathVariable int id) throws Exception {
        return userCommentService.readBySongId(id);
    }

    /**
     * 新增一首歌曲的评论信息
     *
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<UserComment> post(UserComment userComment) throws Exception {
        return userCommentService.addOne(userComment);
    }

    /**
     * 更新一首歌曲评论信息
     *
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<UserComment> put(UserComment userComment) throws Exception {
        return null;
    }

    /**
     * 删除一首歌曲评论信息
     *
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<UserComment> delete(UserComment userComment) throws Exception {
        return userCommentService.deleteOne(userComment);
    }
}
