package com.java.feature.controller;

import com.java.feature.service.ISwitchExpressionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SwitchExpressionsController {

    private final ISwitchExpressionsService switchExpressionsService;

    @GetMapping
    public ResponseEntity getWorkingDay(@PathVariable("year") int year, @PathVariable("month") String month, @PathVariable("day") int day) {
        return ResponseEntity.ok(switchExpressionsService.getWorkingDay(year, month, day));
    }

}
