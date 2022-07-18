package com.java.feature.dto;

public class Guest {
    private String name;
    private boolean participating;
    private Integer participantsNumber;

    public String getName() {
        return name;
    }

    public Guest(String name, boolean participating,
                 Integer participantsNumber) {
        this.name = name;
        this.participating = participating;
        this.participantsNumber = participantsNumber;
    }

    public boolean isParticipating() {
        return participating;
    }

    public Integer getParticipantsNumber() {
        return participantsNumber;
    }
}
