/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(MusicAlbumMapPK.class)
//@EnableTransactionManagement
@Table(name = "S_MusicAblumRelationship", schema = "tmcloud_mysql")
public class MusicAlbum implements Serializable {
    @Id
    @Column(name = "s_aid", nullable = false)
    private int albumId;

    @Id
    @Column(name = "s_songid", nullable = false)
    private int songId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    public MusicAlbum() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public MusicAlbum(int albumId, int songId) {
        this.albumId = albumId;
        this.songId = songId;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
