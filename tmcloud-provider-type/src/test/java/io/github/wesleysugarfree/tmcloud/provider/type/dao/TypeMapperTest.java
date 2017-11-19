/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.type.dao;

import io.github.wesleysugarfree.tmcloud.provider.type.dao.domain.Type;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapper;
import io.github.wesleysugarfree.tmcloud.provider.type.dao.mapper.TypeMapperExt;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeMapperTest {
    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private TypeMapperExt typeMapperExt;


    /**
     * 测试通过主键进行查询
     *
     * @throws Exception
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Assert.assertNotNull(typeMapper.selectByPrimaryKey(1));
    }

    /**
     * 测试插入一条记录并将此记录删除
     */
    @Test
    public void insertAndDeleteTest() {
        Type type = new Type();
        type.setsStid(1000);
        type.setsSttitle("test type");
        Assert.assertEquals(1, typeMapper.insertSelective(type));

        /*清除测试数据*/
        Assert.assertEquals(1, typeMapper.deleteByPrimaryKey(type.getsStid()));
    }

    /**
     * 测试可选择的查询,结果可能是一个集合
     */
    @Test
    public void selectSelectiveTest() {
        Type type = new Type();
        type.setsStid(1);
        type.setsSttitle("test");
        Assert.assertEquals(1, typeMapperExt.selectSelective(type).size());
    }

    /**
     * 测试根据主键更新，并还原结果
     */
    @Transactional
    @Test
    public void updateAndResetTest() {
        Type type = new Type();
        type.setsStid(1);
        type.setsSttitle("test update");

        Assert.assertEquals(1, typeMapper.updateByPrimaryKey(type));

        type.setsSttitle("test");

        Assert.assertEquals(1, typeMapper.updateByPrimaryKey(type));
    }
}