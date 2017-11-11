/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.dao;

import io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain.Singer;
import io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper.SingerMapper;
import io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper.SingerMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingerMapperTest {
    @Autowired
    private SingerMapper singerMapper;

    @Autowired
    private SingerMapperExt singerMapperExt;

    /**
     * 测试通过主键进行查询
     *
     * @throws Exception
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Assert.assertNotNull(singerMapper.selectByPrimaryKey(1));
    }

    /**
     * 测试插入一条记录并将此记录删除
     */
    @Test
    @Transactional
    public void insertAndDeleteTest() {
        Singer singer = new Singer();
        singer.setsSingerid(1000);
        singer.setsSname("tanjian");
        singer.setsSgender(1);
        singer.setsSingerdescp("tanjian tanjian");
        singer.setsSvisi(11);
        singer.setsSpic("url://");

        Assert.assertEquals(1, singerMapper.insertSelective(singer));

        /*清除测试数据*/
        Assert.assertEquals(1, singerMapper.deleteByPrimaryKey(singer.getsSingerid()));
    }

    /**
     * 测试可选择的查询,结果可能是一个集合
     */
    @Test
    public void selectSelectiveTest() {
        Singer singer = new Singer();
        singer.setsSingerid(1);
        singer.setsSname("test");
        Assert.assertEquals(1, singerMapperExt.selectSelective(singer).size());
    }

     /**
     * 测试根据主键更新，并还原结果
     */
    @Transactional
    @Test
    public void updateAndResetTest() {

        //Assert.assertEquals(1, songMapper.updateByPrimaryKey(song));


       // Assert.assertEquals(1, songMapper.updateByPrimaryKeySelective(song1));
    }
}