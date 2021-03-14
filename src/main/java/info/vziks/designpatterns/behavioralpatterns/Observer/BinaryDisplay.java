package info.vziks.designpatterns.behavioralpatterns.Observer;

/**
 * Class BinaryDisplay
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class BinaryDisplay implements Observer {
    private float temperature;
    private float humidity;
    private int pressure;

    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.printf("%s%s%s\n", Integer.toBinaryString(Float.floatToIntBits(temperature)), Integer.toBinaryString(Float.floatToIntBits(humidity)), Integer.toBinaryString(pressure));
    }
}