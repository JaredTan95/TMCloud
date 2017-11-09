/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.common.dto;

import java.util.List;

public class ListResult<T extends Object> extends BaseResult {
    private List<T> listsContent;

    public ListResult(Boolean success, List<T> listsContent, String code, String message) {
        super(success, code, message);
        this.listsContent = listsContent;
    }

    public List<T> getListsContent() {
        return listsContent;
    }

    public void setListsContent(List<T> listsContent) {
        this.listsContent = listsContent;
    }
}
