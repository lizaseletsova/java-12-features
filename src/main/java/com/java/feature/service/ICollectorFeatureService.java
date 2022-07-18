package com.java.feature.service;

import com.java.feature.dto.EventParticipation;
import com.java.feature.dto.Guest;

import java.util.List;

public interface ICollectorFeatureService {

    EventParticipation getMembers(List<Guest> guests);

    List<List<String>> filter(List<String> names);
}
