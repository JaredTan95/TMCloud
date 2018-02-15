package io.github.wesleysugarfree.tmcloud.provider.song.entity.po;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "song")
@SQLDelete(sql = "Update song set IsDeleted = 1 where Id = ?")
@Where(clause = "IsDeleted = 0")
public class Song {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "singer_id", nullable = false)
    private Long singerId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "visited_total")
    private int visitedTotal;

    @Column(name = "fav_num")
    private int favNum;

    @Column(name = "dloaded")
    private int dloaded;

    @Column(name = "cover", nullable = false)
    private String cover;

    @Column(name = "mv_url")
    private String mvUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "is_deleted")
    private int isDeleted;

    @Column(name = "update_time")
    private java.sql.Timestamp updateTime;

    public Long getId() {
        return id;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSingerId() {
        return singerId;
    }

    public void setSingerId(Long singerId) {
        this.singerId = singerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVisitedTotal() {
        return visitedTotal;
    }

    public void setVisitedTotal(int visitedTotal) {
        this.visitedTotal = visitedTotal;
    }

    public int getFavNum() {
        return favNum;
    }

    public void setFavNum(int favNum) {
        this.favNum = favNum;
    }

    public int getDloaded() {
        return dloaded;
    }

    public void setDloaded(int dloaded) {
        this.dloaded = dloaded;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getMvUrl() {
        return mvUrl;
    }

    public void setMvUrl(String mvUrl) {
        this.mvUrl = mvUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp timestamp) {
        this.updateTime = timestamp;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", singerId=" + singerId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", visitedTotal=" + visitedTotal +
                ", favNum=" + favNum +
                ", dloaded=" + dloaded +
                ", cover='" + cover + '\'' +
                ", mvUrl='" + mvUrl + '\'' +
                ", description='" + description + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
