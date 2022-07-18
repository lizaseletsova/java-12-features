package com.java.feature.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class FileFeatureService implements IFileFeatureService {

    public static final String TXT = ".txt";

    @Override
    public long findMismatch(String namesFile1, String namesFile2, String text1, String text2) {
        long mismatch;
        try {
            Path filePath1 = Files.createTempFile(namesFile1, TXT);
            Path filePath2 = Files.createTempFile(namesFile2, TXT);
            Files.writeString(filePath1, text1);
            Files.writeString(filePath2, text2);
            mismatch = Files.mismatch(filePath1, filePath2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mismatch;
    }
}
