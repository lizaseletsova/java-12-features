package com.java.feature.controller;

import com.java.feature.service.IFileFeatureService;
import com.java.feature.service.IStringFeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FileFeatureController {

    private final IFileFeatureService fileFeatureService;

    @GetMapping
    public ResponseEntity indentString(@PathVariable("fileName1") String fileName1, @PathVariable("fileName2") String fileName2,
                                       @PathVariable("text1") String text1, @PathVariable("text2") String text2 ) {
        return ResponseEntity.ok(fileFeatureService.findMismatch(fileName1, fileName2, text1, text2));
    }

}
