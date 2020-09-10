package org.dmsv.challengetracker.entity.enums;

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

    @Override
    public String toString() {
        return "Access{" +
                "value='" + value + '\'' +
                '}';
    }
}
