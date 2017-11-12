/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.album.dao.domain;

import java.util.Date;

public class Album {
    private Integer sAid;

    private Integer sSingerid;

    private String sAtitle;

    private Date sApubtime;

    private String sAdescp;

    private Integer sAvisrec;

    private String sAcoverurl;

    private Date updateTime;

    public Integer getsAid() {
        return sAid;
    }

    public void setsAid(Integer sAid) {
        this.sAid = sAid;
    }

    public Integer getsSingerid() {
        return sSingerid;
    }

    public void setsSingerid(Integer sSingerid) {
        this.sSingerid = sSingerid;
    }

    public String getsAtitle() {
        return sAtitle;
    }

    public void setsAtitle(String sAtitle) {
        this.sAtitle = sAtitle == null ? null : sAtitle.trim();
    }

    public Date getsApubtime() {
        return sApubtime;
    }

    public void setsApubtime(Date sApubtime) {
        this.sApubtime = sApubtime;
    }

    public String getsAdescp() {
        return sAdescp;
    }

    public void setsAdescp(String sAdescp) {
        this.sAdescp = sAdescp == null ? null : sAdescp.trim();
    }

    public Integer getsAvisrec() {
        return sAvisrec;
    }

    public void setsAvisrec(Integer sAvisrec) {
        this.sAvisrec = sAvisrec;
    }

    public String getsAcoverurl() {
        return sAcoverurl;
    }

    public void setsAcoverurl(String sAcoverurl) {
        this.sAcoverurl = sAcoverurl == null ? null : sAcoverurl.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}