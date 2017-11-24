/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.rest;


import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.song.service.SongService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/songs")
public class SongProvider {
    @Resource
    private SongService songService;

    /**
     * 通过歌曲ID获取歌曲信息
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseResult<Song> get(@PathVariable int id) throws Exception {
        return songService.readOneById(id);
    }

    /**
     * 新增一首歌曲
     *
     * @param song
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseResult<Song> post(Song song) throws Exception {
        return songService.addOne(song);
    }

    /**
     * 更新一首歌曲信息
     *
     * @param song
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    public BaseResult<Song> put(Song song) throws Exception {
        return songService.updateOne(song);
    }

    /**
     * 通过组合条件搜索歌曲列表
     *
     * @param song
     * @return ListResult
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public BaseResult<Song> getSongs(Song song) throws Exception {
        return songService.search(song);
    }

    /**
     * 删除一首歌曲信息，原则上只能修改歌曲上下架状态
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseResult<Song> delete(@PathVariable int id) throws Exception {
        return null;
    }
}
