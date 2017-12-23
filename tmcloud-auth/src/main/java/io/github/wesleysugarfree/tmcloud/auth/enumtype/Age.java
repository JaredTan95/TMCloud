package io.github.wesleysugarfree.tmcloud.auth.enumtype;

import org.springframework.util.StringUtils;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Age {
    TEENAGER("TEENAGER"),
    AFTER00S("AFTER00S"),
    AFTER90S("AFTER90S"),
    AFTER80S("AFTER80S"),
    AFTER70S("AFTER70S"),
    AFTER60S("AFTER60S"),
    BEFORE60S("BEFORE60S");

    private String name;

    private static final Map<String, Age> ENUM_MAP;

    Age(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static {
        Map<String, Age> map = new ConcurrentHashMap<>();
        for (Age instance : Age.values()) {
            map.put(instance.getName(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Age get(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        return ENUM_MAP.get(name);
    }
}

