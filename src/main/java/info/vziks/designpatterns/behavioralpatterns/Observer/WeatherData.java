package info.vziks.designpatterns.behavioralpatterns.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Class WeatherData
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class WeatherData implements Observable {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private int pressure;

    public WeatherData() {
        observers = new LinkedList<>();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void informAll() {
        for (Observer observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        informAll();
    }
}
