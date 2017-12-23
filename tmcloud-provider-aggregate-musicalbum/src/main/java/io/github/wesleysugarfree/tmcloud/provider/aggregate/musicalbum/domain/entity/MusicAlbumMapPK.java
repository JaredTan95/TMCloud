/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum.domain.entity;

import java.io.Serializable;
import java.util.Objects;

public class MusicAlbumMapPK implements Serializable {
    private Integer albumId;
    private Integer songId;

    public MusicAlbumMapPK() {
    }


    //  ***重写hashCode与equals方法***  划重点！
    /*
    * hashCode方法返回当前对象的哈希码;
    * */
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((albumId == null) ? 0 : albumId.hashCode());
        result = PRIME * result + ((songId == null) ? 0 : songId.hashCode());
        return result;
    }

    /*
    equals方法用于判断两个对象是否相同
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final MusicAlbumMapPK other = (MusicAlbumMapPK) obj;

        if (!Objects.equals(this.albumId, other.albumId)) {
            return false;
        }
        if (!Objects.equals(this.songId, other.songId)) {
            return false;
        }
        return true;
    }

    public MusicAlbumMapPK(int albumId, int songId) {
        this.albumId = albumId;
        this.songId = songId;
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
}
