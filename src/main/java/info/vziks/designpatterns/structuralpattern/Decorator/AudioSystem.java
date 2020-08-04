package info.vziks.designpatterns.structuralpattern.Decorator;

/**
 * Class AudioSystem
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class AudioSystem extends OptionalEquipmentDecorator{

    private int cost = 100;

    public AudioSystem(OptionalEquipment optionalEquipment) {
        super(optionalEquipment);
    }

    @Override
    public int calculatePrice() {
        return this.optionalEquipment.calculatePrice() + this.cost;
    }
}
