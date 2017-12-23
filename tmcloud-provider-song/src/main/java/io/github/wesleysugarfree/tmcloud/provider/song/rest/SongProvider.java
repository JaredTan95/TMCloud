/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.rest;


import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.song.service.SongService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public BaseResult<Song> get(@PathVariable int id) {
        return songService.readOneById(id);
    }

    /**
     * 新增一首歌曲
     *
     * @param song
     * @return BaseResult
     * @throws Exception
     */
    @PostMapping("/")
    public BaseResult<Song> post(Song song) {
        return songService.addOne(song);
    }

    /**
     * 更新一首歌曲信息
     *
     * @param song，前端传参需将"Content-Type"设置为"application/x-www-form-urlencoded"
     * @return BaseResult
     * @throws Exception
     */
    @PutMapping("/")
    public BaseResult<Song> put(Song song) throws Exception {
        return songService.updateOne(song);
    }

    /**
     * 通过组合条件(未实现)搜索歌曲列表，
     * 目前支持通过歌曲标题和歌曲描述关键词搜索。//TODO:***实现组合搜索***
     * @param q
     * @return ListResult
     * @throws Exception
     */
    @GetMapping("/search")
    public BaseResult<Song> search(@RequestParam String q) {
        return songService.search(q,q);
    }

    /**
     * 删除一首歌曲信息，原则上只能修改歌曲上下架状态,即逻辑删除.
     *
     * @param id
     * @return BaseResult
     * @throws Exception
     */
    @DeleteMapping("/{id}")
    public BaseResult<Object> delete(@PathVariable long id) throws Exception {
        return songService.deleteOne(id);
    }
}
