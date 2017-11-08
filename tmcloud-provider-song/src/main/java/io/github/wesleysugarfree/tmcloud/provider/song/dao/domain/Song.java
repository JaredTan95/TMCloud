package io.github.wesleysugarfree.tmcloud.provider.song.dao.domain;

import java.util.Date;

public class Song {
    private Integer sSongid;

    private Integer sSingerid;

    private String sTitle;

    private String sSurl;

    private Integer sVisited;

    private Integer sVisitedtotal;

    private Integer sDloaded;

    private String sScover;

    private String sSmvurl;

    private String sSongdescp;

    private Date updateTime;

    public Integer getsSongid() {
        return sSongid;
    }

    public void setsSongid(Integer sSongid) {
        this.sSongid = sSongid;
    }

    public Integer getsSingerid() {
        return sSingerid;
    }

    public void setsSingerid(Integer sSingerid) {
        this.sSingerid = sSingerid;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public String getsSurl() {
        return sSurl;
    }

    public void setsSurl(String sSurl) {
        this.sSurl = sSurl == null ? null : sSurl.trim();
    }

    public Integer getsVisited() {
        return sVisited;
    }

    public void setsVisited(Integer sVisited) {
        this.sVisited = sVisited;
    }

    public Integer getsVisitedtotal() {
        return sVisitedtotal;
    }

    public void setsVisitedtotal(Integer sVisitedtotal) {
        this.sVisitedtotal = sVisitedtotal;
    }

    public Integer getsDloaded() {
        return sDloaded;
    }

    public void setsDloaded(Integer sDloaded) {
        this.sDloaded = sDloaded;
    }

    public String getsScover() {
        return sScover;
    }

    public void setsScover(String sScover) {
        this.sScover = sScover == null ? null : sScover.trim();
    }

    public String getsSmvurl() {
        return sSmvurl;
    }

    public void setsSmvurl(String sSmvurl) {
        this.sSmvurl = sSmvurl == null ? null : sSmvurl.trim();
    }

    public String getsSongdescp() {
        return sSongdescp;
    }

    public void setsSongdescp(String sSongdescp) {
        this.sSongdescp = sSongdescp == null ? null : sSongdescp.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}