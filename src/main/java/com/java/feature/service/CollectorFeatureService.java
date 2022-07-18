package com.java.feature.service;

import com.java.feature.dto.EventParticipation;
import com.java.feature.dto.Guest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollectorFeatureService implements ICollectorFeatureService {

    @Override
    public EventParticipation getMembers(List<Guest> guests) {
        return guests.stream().collect(Collectors.teeing(
                Collectors.filtering(Guest::isParticipating, Collectors.mapping(o -> o.getName(), Collectors.toList())),
                Collectors.summingInt(Guest::getParticipantsNumber), EventParticipation::new));
    }

    @Override
    public List<List<String>> filter(List<String> names) {
       return names.stream().collect(Collectors.teeing(
                Collectors.filtering(n -> n.contains("xx"), Collectors.toList()),
                Collectors.filtering(n -> n.endsWith("One"), Collectors.toList()),
                (List<String> list1, List<String> list2) -> List.of(list1, list2)
        ));
    }
}
