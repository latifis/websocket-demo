package com.example.websocketdemo.utils;

import java.util.List;
import java.util.regex.Pattern;

public class CensorshipUtils {

    private static final List<String> BAD_WORDS = List.of(
            "kasar"
    );

    private static final Pattern BAD_WORDS_PATTERN = Pattern.compile(
            "(?i)\\b(" + String.join("|", BAD_WORDS) + ")\\b"
    );

    public static String censor(String message) {
        if (message == null) return null;
        return BAD_WORDS_PATTERN.matcher(message).replaceAll("***");
    }
}
