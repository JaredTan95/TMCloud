/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain;

public class UserCommentKey {
    private Integer sUserid;

    private Integer sSongid;

    public Integer getsUserid() {
        return sUserid;
    }

    public void setsUserid(Integer sUserid) {
        this.sUserid = sUserid;
    }

    public Integer getsSongid() {
        return sSongid;
    }

    public void setsSongid(Integer sSongid) {
        this.sSongid = sSongid;
    }
}