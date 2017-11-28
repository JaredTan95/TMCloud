/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao.rest;

import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.service.AlbumService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/album")
public class AlbumProvider {
    @Resource
    private AlbumService albumService;

    /**
     * 通过专辑ID获取歌曲信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<Album> get(@PathVariable int id) throws Exception {
        return albumService.readOneById(id);
    }

    /**
     * 新增一个专辑
     *
     * @param Album
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<Album> post(Album Album) throws Exception {
        return albumService.addOne(Album);
    }

    /**
     * 更新一个专辑信息
     *
     * @param Album
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<Album> put(Album Album) throws Exception {
        return albumService.updateOne(Album);
    }

    /**
     * 通过组合条件搜索专辑列表
     *
     * @param Album
     * @return ListResult
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<Album> getSongs(Album Album) throws Exception {
        return albumService.search(Album);
    }

    /**
     * 删除一个专辑信息，原则上只能修改歌手状态
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Album> delete(@PathVariable int id) throws Exception {
        return null;
    }
}
