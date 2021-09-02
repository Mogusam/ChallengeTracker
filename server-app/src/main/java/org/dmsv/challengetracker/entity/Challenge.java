package org.dmsv.challengetracker.entity;

import java.time.LocalDate;

import org.dmsv.challengetracker.entity.enums.Access;
import org.dmsv.challengetracker.entity.enums.ChallengeState;
import org.dmsv.challengetracker.entity.enums.StopStrategy;

public class Challenge {
    private int id;

    private int TemplateId;

    private LocalDate startDate;

    private LocalDate endDate;

    private Access access;

    private StopStrategy stopStrategy;

    private String Settings;

    private ChallengeState state;

    private Boolean moderated;

    private int typeId;

    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemplateId() {
        return TemplateId;
    }

    public void setTemplateId(int templateId) {
        TemplateId = templateId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public StopStrategy getStopStrategy() {
        return stopStrategy;
    }

    public void setStopStrategy(StopStrategy stopStrategy) {
        this.stopStrategy = stopStrategy;
    }

    public String getSettings() {
        return Settings;
    }

    public void setSettings(String settings) {
        Settings = settings;
    }

    public ChallengeState getState() {
        return state;
    }

    public void setState(ChallengeState state) {
        this.state = state;
    }

    public Boolean getModerated() {
        return moderated;
    }

    public void setModerated(Boolean moderated) {
        this.moderated = moderated;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}