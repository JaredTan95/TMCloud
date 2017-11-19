package io.github.wesleysugarfree.tmcloud.provider.type.dao.domain;

import java.util.Date;

public class Type {
    private Integer sStid;

    private String sSttitle;

    private Date updateTime;

    public Integer getsStid() {
        return sStid;
    }

    public void setsStid(Integer sStid) {
        this.sStid = sStid;
    }

    public String getsSttitle() {
        return sSttitle;
    }

    public void setsSttitle(String sSttitle) {
        this.sSttitle = sSttitle == null ? null : sSttitle.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}