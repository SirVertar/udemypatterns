package com.jakuszko.patterns.observer;

import com.jakuszko.patterns.observer.news.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
