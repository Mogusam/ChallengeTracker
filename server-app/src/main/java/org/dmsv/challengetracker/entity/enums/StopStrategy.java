package org.dmsv.challengetracker.entity.enums;


import java.util.HashMap;
import java.util.Map;

public enum StopStrategy {
    EXACT_DATE("E"),
    FIRST_WINNER("F");

    private String value;

    StopStrategy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //Lookup table
    private static final Map<String, StopStrategy> lookup = new HashMap<>();

    static {
        for (StopStrategy stopStrategy : StopStrategy.values()) {
            lookup.put(stopStrategy.getValue(), stopStrategy);
        }
    }

    public static StopStrategy get(String value) {
        return lookup.get(value);
    }
}
