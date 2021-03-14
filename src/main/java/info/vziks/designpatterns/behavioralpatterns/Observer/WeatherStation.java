package info.vziks.designpatterns.behavioralpatterns.Observer;

/**
 * Class WeatherStation
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay = new CurrentConditionsDisplay();
        Observer binaryDisplay = new BinaryDisplay();

        weatherData.attach(currentDisplay);
        weatherData.attach(binaryDisplay);

        weatherData.setMeasurements(29f, 65f, 745);

        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.remove(binaryDisplay);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
