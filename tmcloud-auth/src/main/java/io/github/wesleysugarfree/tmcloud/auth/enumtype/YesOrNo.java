package io.github.wesleysugarfree.tmcloud.auth.enumtype;

public enum YesOrNo {
    Y(1), N(0);

    // 定义私有变量
    private int val;

    // 构造函数，枚举类型只能为私有
    private YesOrNo(int val) {

        this.val = val;

    }
}