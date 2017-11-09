/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song.dao;

import io.github.wesleysugarfree.tmcloud.provider.song.dao.domain.Song;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapper;
import io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper.SongMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongMapperTest {
    @Autowired
    private SongMapper songMapper;

    @Autowired
    private SongMapperExt songMapperExt;


    /**
     * 测试通过主键进行查询
     *
     * @throws Exception
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Assert.assertNotNull(songMapper.selectByPrimaryKey(1));
    }

    /**
     * 测试插入一条记录并将此记录删除
     */
    @Test
    public void insertAndDeleteTest() {
        Song song = new Song();
        song.setsSongid(1000);
        song.setsSingerid(1000);
        song.setsTitle("Never Back Down");
        song.setsSurl("http://dfsfsa.cn/dfasdf.mp3");
        song.setsScover("http://dfsfsa.cn/dfasdf.jpg");
        song.setsSongdescp("Never Back Down Never Back DownNever Back DownNever Back Down.");
        Assert.assertEquals(1, songMapper.insertSelective(song));

        /*清除测试数据*/
        Assert.assertEquals(1, songMapper.deleteByPrimaryKey(song.getsSongid()));
    }

    /**
     * 测试可选择的查询,结果可能是一个集合
     */
    @Test
    public void selectSelectiveTest() {
        Song song = new Song();
        song.setsSingerid(1);
        Assert.assertEquals(1, songMapperExt.selectSelective(song).size());
    }

    /**
     * 测试根据主键更新，并还原结果
     */
    @Transactional
    @Test
    public void updateAndResetTest() {
        Song song = new Song();
        song.setsSongid(1);
        song.setsSingerid(1000);
        song.setsTitle("Never Back Down");
        song.setsSurl("http://dfsfsa.cn/dfasdf.mp3");
        song.setsScover("http://dfsfsa.cn/dfasdf.jpg");
        song.setsSongdescp("Never Back Down Never Back DownNever Back DownNever Back Down.");

        Assert.assertEquals(1, songMapper.updateByPrimaryKey(song));

        Song song1 = new Song();
        song1.setsSongid(1);
        song1.setsSingerid(1);
        song1.setsTitle("test");
        song1.setsSurl("test");
        song1.setsScover("test");
        song1.setsSongdescp("test test.");

        Assert.assertEquals(1, songMapper.updateByPrimaryKeySelective(song1));
    }
}