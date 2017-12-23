/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "S_type",schema = "tmcloud_mysql")
public class MusicType {
    @Id
    @GeneratedValue
    @Column(name = "s_stid",nullable = false)
    private int typeId;

    @Column(name = "s_sttitle",nullable = false)
    private String typetitle;

    @Column(name = "update_time")
    private Date updateTime;

    public MusicType(int typeId, String typetitle) {
        this.typeId = typeId;
        this.typetitle = typetitle;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypetitle() {
        return typetitle;
    }

    public void setTypetitle(String typetitle) {
        this.typetitle = typetitle;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
