package com.java.feature.dto;

import java.util.List;

public class EventParticipation {
    private List<String> guestNameList;
    private Integer totalNumberOfParticipants;

    public EventParticipation(List<String> guestNameList,
                              Integer totalNumberOfParticipants) {
        this.guestNameList = guestNameList;
        this.totalNumberOfParticipants = totalNumberOfParticipants;
    }

    @Override
    public String toString() {
        return "EventParticipation { " +
                "guests = " + guestNameList +
                ", total number of participants = " + totalNumberOfParticipants +
                " }";
    }

}
