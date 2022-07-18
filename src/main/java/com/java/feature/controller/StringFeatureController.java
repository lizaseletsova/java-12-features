package com.java.feature.controller;

import com.java.feature.service.IStringFeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StringFeatureController {

    private final IStringFeatureService stringFeatureService;

    @GetMapping
    public ResponseEntity indentString(@PathVariable("text") String text, @PathVariable("indentation") int indentation) {
        return ResponseEntity.ok(stringFeatureService.getStringWithIntern(text, indentation));
    }

    @GetMapping
    public ResponseEntity transform(@PathVariable("text") String text) {
        return ResponseEntity.ok(stringFeatureService.transform(text));
    }
}
