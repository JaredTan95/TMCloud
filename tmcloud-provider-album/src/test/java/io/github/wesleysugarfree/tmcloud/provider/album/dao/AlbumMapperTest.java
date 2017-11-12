/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao;

import io.github.wesleysugarfree.tmcloud.provider.album.dao.domain.Album;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper.AlbumMapper;
import io.github.wesleysugarfree.tmcloud.provider.album.dao.mapper.AlbumMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumMapperTest {
    @Autowired
    private AlbumMapper albumMapper;

    @Autowired
    private AlbumMapperExt albumMapperExt;

    /**
     * 测试通过主键进行查询
     *
     * @throws Exception
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Assert.assertNotNull(albumMapper.selectByPrimaryKey(1));
    }

  /**
     * 测试插入一条记录并将此记录删除
     */
    @Test
    @Transactional
    public void insertAndDeleteTest()  {
        Album album=new Album();
        album.setsAid(1000);
        album.setsSingerid(1);
        album.setsAtitle("test");
        java.sql.Date time= new java.sql.Date(new Date().getTime());
        album.setsApubtime(time);
        album.setsAdescp("test");

        Assert.assertEquals(1, albumMapper.insertSelective(album));

        /*清除测试数据*/
        Assert.assertEquals(1, albumMapper.deleteByPrimaryKey(album.getsAid()));
    }

/**
     * 测试可选择的查询,结果可能是一个集合
     */
    @Test
    public void selectSelectiveTest() {
        Album album = new Album();
        album.setsAtitle("test");
        Assert.assertEquals(1, albumMapperExt.selectSelective(album).size());
    }

    /**
     * 测试根据主键更新，并还原结果
     */
    @Transactional
    @Test
    public void updateAndResetTest() {

        Album album=new Album();
        album.setsAid(1);
        album.setsSingerid(1);
        java.sql.Date time= new java.sql.Date(new Date().getTime());
        album.setsApubtime(time);
        album.setsAtitle("test test");

        Assert.assertEquals(1, albumMapper.updateByPrimaryKey(album));

        album.setsAtitle("test");
        Assert.assertEquals(1, albumMapper.updateByPrimaryKeySelective(album));
    }
}