package io.github.wesleysugarfree.tmcloud.auth.enumtype;

import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String name;

    private static final Map<String,Gender> ENUM_MAP;

    Gender (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    static {
        Map<String,Gender> map = new ConcurrentHashMap<>();
        for (Gender instance : Gender.values()) {
            map.put(instance.getName(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Gender get (String name) {
        if(StringUtils.isEmpty(name)){
            return null;
        }
        return ENUM_MAP.get(name);
    }
}
