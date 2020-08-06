package info.vziks.designpatterns.structuralpattern.Adapter;

/**
 * Class FahrenheitSensor
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class FahrenheitSensor implements ITemperature {
    private double value;

    public FahrenheitSensor(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getTemperature() {
        return value;
    }
}
