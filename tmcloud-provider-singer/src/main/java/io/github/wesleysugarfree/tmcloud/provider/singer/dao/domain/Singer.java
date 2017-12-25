/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Singer")
public class Singer {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "singer_name")
    private String singerName;

    @Column(name = "gender")
    private int gender;

    @Column(name = "description")
    private String description;

    @Column(name = "visited_total")
    private int visitedTotal;

    @Column(name = "picture")
    private String picture;

    @Column(name = "update_time")
    private java.sql.Timestamp updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVisitedTotal() {
        return visitedTotal;
    }

    public void setVisitedTotal(int visitedTotal) {
        this.visitedTotal = visitedTotal;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", singerName='" + singerName + '\'' +
                ", gender=" + gender +
                ", description='" + description + '\'' +
                ", visitedTotal=" + visitedTotal +
                ", picture='" + picture + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}