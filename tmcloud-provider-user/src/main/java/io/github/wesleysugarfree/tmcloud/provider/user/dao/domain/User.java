package io.github.wesleysugarfree.tmcloud.provider.user.dao.domain;

import java.util.Date;

public class User {
    private Integer sUserid;

    private String sUaccount;

    private String sUpwdsalt;

    private String sUpwd;

    private String sUnickname;

    private String sUemail;

    private String sUnone;

    private Date updateTime;

    public Integer getsUserid() {
        return sUserid;
    }

    public void setsUserid(Integer sUserid) {
        this.sUserid = sUserid;
    }

    public String getsUaccount() {
        return sUaccount;
    }

    public void setsUaccount(String sUaccount) {
        this.sUaccount = sUaccount == null ? null : sUaccount.trim();
    }

    public String getsUpwdsalt() {
        return sUpwdsalt;
    }

    public void setsUpwdsalt(String sUpwdsalt) {
        this.sUpwdsalt = sUpwdsalt == null ? null : sUpwdsalt.trim();
    }

    public String getsUpwd() {
        return sUpwd;
    }

    public void setsUpwd(String sUpwd) {
        this.sUpwd = sUpwd == null ? null : sUpwd.trim();
    }

    public String getsUnickname() {
        return sUnickname;
    }

    public void setsUnickname(String sUnickname) {
        this.sUnickname = sUnickname == null ? null : sUnickname.trim();
    }

    public String getsUemail() {
        return sUemail;
    }

    public void setsUemail(String sUemail) {
        this.sUemail = sUemail == null ? null : sUemail.trim();
    }

    public String getsUnone() {
        return sUnone;
    }

    public void setsUnone(String sUnone) {
        this.sUnone = sUnone == null ? null : sUnone.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}