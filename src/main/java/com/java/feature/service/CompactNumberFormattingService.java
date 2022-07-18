package com.java.feature.service;

import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.Locale;

@Service
public class CompactNumberFormattingService implements ICompactNumberFormattingService {
    @Override
    public NumberFormat getCompactNumberInstance(Locale locale, NumberFormat.Style formatStyle) {
        return NumberFormat.getCompactNumberInstance(locale, formatStyle);
    }
}
