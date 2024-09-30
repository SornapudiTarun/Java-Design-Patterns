package ObserverDesignPattern;

import IteratorDesignPattern.Library;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers;
    private float temp;
    private float humidity;

    public WeatherStation(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity);
        }
    }

    public void setWeatherDat(float temp,float humidity){
        this.temp=temp;
        this.humidity=humidity;
        notifyObservers();
    }
}
