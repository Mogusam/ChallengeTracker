package org.dmsv.challengetracker.entity;

public class ChallengeTemplate {
    private int id;
    private String name;
    private String description;
    private String settings;

    public ChallengeTemplate() {
    }

    public ChallengeTemplate(int id, String name, String description, String settings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.settings = settings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "ChallengeTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", settings='" + settings + '\'' +
                '}';
    }
}
