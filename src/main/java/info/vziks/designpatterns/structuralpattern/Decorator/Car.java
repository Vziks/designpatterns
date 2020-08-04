package info.vziks.designpatterns.structuralpattern.Decorator;

/**
 * Class Car
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Car implements OptionalEquipment {
    @Override
    public int calculatePrice() {
        return 1000000;
    }
}
