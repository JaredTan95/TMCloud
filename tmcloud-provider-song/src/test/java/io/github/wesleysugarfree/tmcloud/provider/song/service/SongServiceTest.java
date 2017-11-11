/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.service;


import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapper;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongServiceTest {
    @Autowired
    private SongService songService;

    @Resource
    private SongMapper songMapper;

    @Resource
    private SongMapperExt songMapperExt;

    @Test
    public void searchServiceTest() throws Exception {
        Song song=new Song();
        song.setsTitle("test");
        Assert.assertEquals(1,songService.search(song).getContentLists().size());
    }

}
