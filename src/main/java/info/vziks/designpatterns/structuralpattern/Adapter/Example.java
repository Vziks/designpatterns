package info.vziks.designpatterns.structuralpattern.Adapter;

/**
 * Class Example
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Example {

    public static void main(String[] args) {
        ITemperature fahrenheitSensor = new FahrenheitSensor(200);
        ITemperatureAdapter iTemperatureAdapter = new CelsiusTemperatureAdapter(fahrenheitSensor);
        System.out.println(iTemperatureAdapter.getTemperature());
    }
}
