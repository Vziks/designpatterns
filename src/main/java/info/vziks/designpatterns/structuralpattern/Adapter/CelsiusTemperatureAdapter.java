package info.vziks.designpatterns.structuralpattern.Adapter;

/**
 * Class CelsiusTemperatureAdapter
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class CelsiusTemperatureAdapter implements ITemperatureAdapter{

    public CelsiusTemperatureAdapter(ITemperature sensor) {
        this.sensor = sensor;
    }

    private ITemperature sensor;
    @Override
    public double getTemperature() {
        return (sensor.getTemperature() - 32.0) * 5.0 / 9.0;
    }
}
