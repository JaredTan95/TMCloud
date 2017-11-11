/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer.dao.domain;

import java.util.Date;

public class Singer {
    private Integer sSingerid;

    private String sSname;

    private Integer sSgender;

    private String sSingerdescp;

    private Integer sSvisi;

    private String sSpic;

    private Date updateTime;

    public Integer getsSingerid() {
        return sSingerid;
    }

    public void setsSingerid(Integer sSingerid) {
        this.sSingerid = sSingerid;
    }

    public String getsSname() {
        return sSname;
    }

    public void setsSname(String sSname) {
        this.sSname = sSname == null ? null : sSname.trim();
    }

    public Integer getsSgender() {
        return sSgender;
    }

    public void setsSgender(Integer sSgender) {
        this.sSgender = sSgender;
    }

    public String getsSingerdescp() {
        return sSingerdescp;
    }

    public void setsSingerdescp(String sSingerdescp) {
        this.sSingerdescp = sSingerdescp == null ? null : sSingerdescp.trim();
    }

    public Integer getsSvisi() {
        return sSvisi;
    }

    public void setsSvisi(Integer sSvisi) {
        this.sSvisi = sSvisi;
    }

    public String getsSpic() {
        return sSpic;
    }

    public void setsSpic(String sSpic) {
        this.sSpic = sSpic == null ? null : sSpic.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}