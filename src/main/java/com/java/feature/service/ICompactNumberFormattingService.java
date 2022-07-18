package com.java.feature.service;

import java.text.NumberFormat;
import java.util.Locale;

public interface ICompactNumberFormattingService {

    NumberFormat getCompactNumberInstance(Locale locale, NumberFormat.Style formatStyle);
}
