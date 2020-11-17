package com.jakuszko.patterns.observer.news;

import com.jakuszko.patterns.observer.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
