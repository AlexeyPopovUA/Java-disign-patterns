package com.custom_observer.subjects;


import com.custom_observer.observers.Observer;


public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
