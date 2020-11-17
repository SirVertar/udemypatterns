package com.jakuszko.patterns;

import com.jakuszko.patterns.observer.WeatherForecast;
import com.jakuszko.patterns.observer.news.InternetNews;
import com.jakuszko.patterns.observer.news.RadioNews;
import com.jakuszko.patterns.observer.news.TvNews;
import com.jakuszko.patterns.singleton.GuessGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
//        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
//        RadioNews radioNews = new RadioNews();
//        InternetNews internetNews = new InternetNews();
//        TvNews tvNews = new TvNews();
//        weatherForecast.registerObserver(radioNews);
//        weatherForecast.registerObserver(internetNews);
//        weatherForecast.registerObserver(tvNews);
//        weatherForecast.notifyObservers();
//        weatherForecast.unregisterObserver(tvNews);
//        weatherForecast.unregisterObserver(radioNews);
//        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
//        weatherForecast.updateForecast(18, 1007);
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
