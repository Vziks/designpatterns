package info.vziks.designpatterns.structuralpattern.Decorator;

/**
 * Class Example
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Example {

    public static void main(String[] args) {

        OptionalEquipment equipment = new Car();

        equipment = new AirConditioning(equipment);
        equipment = new AudioSystem(equipment);

        System.out.println(equipment.calculatePrice());
    }
}
