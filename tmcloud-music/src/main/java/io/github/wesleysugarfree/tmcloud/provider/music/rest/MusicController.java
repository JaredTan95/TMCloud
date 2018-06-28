package io.github.wesleysugarfree.tmcloud.provider.music.rest;


import io.github.wesleysugarfree.tmcloud.provider.music.domain.MusicEntity;
import io.github.wesleysugarfree.tmcloud.provider.music.domain.dto.BaseResult;
import io.github.wesleysugarfree.tmcloud.provider.music.service.MusicService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/songs")
public class MusicController {
    @Resource
    private MusicService musicService;

    /**
     * 通过歌曲ID获取歌曲信息
     */
    @GetMapping("/{id}")
    public BaseResult<MusicEntity> get(@PathVariable int id) {
        return musicService.readOneById(id);
    }

    /**
     * 新增一首歌曲
     */
    @PostMapping("/")
    public BaseResult<MusicEntity> post(@RequestBody MusicEntity music) {
        return musicService.addOne(music);
    }

    /**
     * 更新一首歌曲信息
     */
    @PutMapping("/")
    public BaseResult<MusicEntity> put(@RequestBody MusicEntity music) throws Exception {
        return musicService.updateOne(music);
    }

    /**
     * 通过组合条件(未实现)搜索歌曲列表，
     * 目前支持通过歌曲标题和歌曲描述关键词搜索。//TODO:***实现组合搜索***
     */
    @GetMapping("/search")
    public BaseResult<MusicEntity> search(@RequestParam String q, Pageable pageable) {
        return musicService.search(q, q, pageable);
    }

    /**
     * 删除一首歌曲信息，原则上只能修改歌曲上下架状态,即逻辑删除.
     */
    @DeleteMapping("/{id}")
    public BaseResult<Object> delete(@PathVariable long id) throws Exception {
        return musicService.deleteOne(id);
    }
}
