/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain;

import java.util.Date;

public class UserComment extends UserCommentKey {
    private String sUsercommcontent;

    private Date sUsercommdate;

    private Date updateTime;

    public String getsUsercommcontent() {
        return sUsercommcontent;
    }

    public void setsUsercommcontent(String sUsercommcontent) {
        this.sUsercommcontent = sUsercommcontent == null ? null : sUsercommcontent.trim();
    }

    public Date getsUsercommdate() {
        return sUsercommdate;
    }

    public void setsUsercommdate(Date sUsercommdate) {
        this.sUsercommdate = sUsercommdate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}