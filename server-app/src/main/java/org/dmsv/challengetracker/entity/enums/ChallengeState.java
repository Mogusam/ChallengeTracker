package org.dmsv.challengetracker.entity.enums;

import java.util.HashMap;
import java.util.Map;

public enum ChallengeState {
    OPEN("O"),
    CLOSED("C"),
    IN_PROGRESS("I"),
    WAITING_FOR_START("W"),
    DRAFT("D"),
    CREATED("R");

    private String value;

    ChallengeState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    //Lookup table
    private static final Map<String, ChallengeState> lookup = new HashMap<>();

    static {
        for (ChallengeState challengeState : ChallengeState.values()) {
            lookup.put(challengeState.getValue(), challengeState);
        }
    }

    public static ChallengeState get(String value) {
        return lookup.get(value);
    }


}
