/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum;

import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicAlbum;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity.MusicType;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.repository.MusicAlbumRepository;
import io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.repository.MusicTypeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= AggregateMusicAlbumProviderApplication.class)
public class ApplicationTests {

    @Autowired
    private MusicAlbumRepository musicAlbumRepository;

    @Autowired
    private MusicTypeRepository musicTypeRepository;

    @Test
    public void testSave() throws Exception {

        // 创建记录
        MusicAlbum musicAlbum=new MusicAlbum();
        musicAlbum.setAlbumId(100);
        musicAlbum.setSongId(100);
        musicAlbumRepository.saveAndFlush(musicAlbum);

        Assert.assertEquals(1,musicAlbumRepository.findAll().size());
    }

    @Test
    public void  count(){
        List<MusicAlbum> musicAlbum=musicAlbumRepository.findAll();
        for(MusicAlbum item:musicAlbum){
            System.out.println(item.getAlbumId()+" "+item.getSongId());
        }
        Assert.assertEquals(1,musicAlbum.size());
    }

    @Test
    public void getAllMusicType(){
        List<MusicType> tylists=musicTypeRepository.findAll();
        for (MusicType item:tylists){
            System.out.println("========="+item.getTypetitle());
        }
        Assert.assertEquals(1,tylists.size());
    }
}