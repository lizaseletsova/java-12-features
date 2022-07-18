package com.java.feature.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

@Service
public class SwitchExpressionsService implements ISwitchExpressionsService {

    @Override
    public String getWorkingDay(int year, String month, int dayOfMonth) {
        LocalDate localDate = LocalDate.of(year, Month.valueOf(month), dayOfMonth);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };
    }
}
