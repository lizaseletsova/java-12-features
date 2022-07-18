package com.java.feature.service;

import org.springframework.stereotype.Service;

@Service
public class StringFeatureService implements IStringFeatureService {

    @Override
    public String getStringWithIntern(String text, int indentation) {
        return text.indent(indentation);
    }

    @Override
    public String transform(String text) {
        return text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
    }

}
