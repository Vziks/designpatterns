package info.vziks.designpatterns.structuralpattern.Decorator;

/**
 * Class AirConditioning
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class AirConditioning extends OptionalEquipmentDecorator {

    private int cost = 4000;

    public AirConditioning(OptionalEquipment optionalEquipment) {
        super(optionalEquipment);
    }

    @Override
    public int calculatePrice() {
        return this.optionalEquipment.calculatePrice() + this.cost;
    }

}
