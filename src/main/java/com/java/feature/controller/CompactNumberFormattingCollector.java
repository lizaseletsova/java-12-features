package com.java.feature.controller;

import com.java.feature.service.ICompactNumberFormattingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.NumberFormat;
import java.util.Locale;


@RestController
@RequiredArgsConstructor
public class CompactNumberFormattingCollector {
    private final ICompactNumberFormattingService compactNumberFormattingService;

    @GetMapping
    public ResponseEntity compactNumber(@PathVariable("language") String language, @PathVariable("style") String style) {
        return ResponseEntity.ok(compactNumberFormattingService.getCompactNumberInstance(new Locale(language), NumberFormat.Style.valueOf(style)));
    }
}
