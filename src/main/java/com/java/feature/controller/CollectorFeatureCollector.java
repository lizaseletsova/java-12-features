package com.java.feature.controller;

import com.java.feature.dto.Guest;
import com.java.feature.service.ICollectorFeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CollectorFeatureCollector {
    private final ICollectorFeatureService collectorFeatureService;

    @GetMapping
    public ResponseEntity getMembers(@RequestBody List<Guest> guests) {
        return ResponseEntity.ok(collectorFeatureService.getMembers(guests));
    }

    @GetMapping
    public ResponseEntity filter(@RequestBody List<String> names) {
        return ResponseEntity.ok(collectorFeatureService.filter(names));
    }

}
