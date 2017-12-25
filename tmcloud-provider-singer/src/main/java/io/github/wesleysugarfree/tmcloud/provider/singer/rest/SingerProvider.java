/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.rest;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;
import io.github.wesleysugarfree.tmcloud.provider.singer.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.singer.service.SingerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/singer")
public class SingerProvider {
    @Resource
    private SingerService singerService;
    
    /**
     * 通过歌手ID获取歌曲信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<Singer> get(@PathVariable int id) {
        return singerService.readOneById(id);
    }

    /**
     * 新增一个歌手
     *
     * @param singer
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<Singer> post(Singer singer) {
        return singerService.addOne(singer);
    }

    /**
     * 更新一个歌手信息
     *
     * @param singer
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<Singer> put(Singer singer) throws Exception {
        return singerService.updateOne(singer);
    }

    /**
     * //TODO:通过组合条件搜索歌手列表
     *
     * @param a
     * @return ListResult
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<Singer> getSongs(String q) {
        return singerService.search(q);
    }

    /**
     * 删除一个歌手信息，原则上只能修改歌手状态
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Singer> delete(@PathVariable int id) throws Exception {
        return null;
    }
}
