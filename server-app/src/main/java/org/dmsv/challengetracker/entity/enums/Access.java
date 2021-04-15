package org.dmsv.challengetracker.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum Access {
    PUBLIC("Y"),
    PRIVATE("N");

    private String value;

    Access(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    //Lookup table
    private static final Map<String, Access> lookup = new HashMap<>();

    static {
        for (Access access : Access.values()) {
            lookup.put(access.getValue(), access);
        }
    }

    public static Access get(String value) {
        return lookup.get(value);
    }
}
