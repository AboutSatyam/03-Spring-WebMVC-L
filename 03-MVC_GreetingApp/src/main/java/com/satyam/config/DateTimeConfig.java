package com.satyam.config;

import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class DateTimeConfig {

    public LocalTime generateTime() {
        return LocalTime.now();
    }
}
