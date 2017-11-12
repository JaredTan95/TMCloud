/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.service;


import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.service.AlbumService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlbumServiceTest.class)
public class AlbumServiceTest {
    @Autowired
    private AlbumService albumService;

    @Test
    public void searchServiceTest() throws Exception {
        Album album = new Album();
        album.setsAtitle("test");
        Assert.assertEquals(1, albumService.search(album).getContentLists().size());
    }
}
