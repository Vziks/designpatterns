package info.vziks.designpatterns.structuralpattern.Decorator;

/**
 * Class optionalEquipmentDecorator
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
abstract class OptionalEquipmentDecorator implements OptionalEquipment {

    protected OptionalEquipment optionalEquipment;

    public OptionalEquipmentDecorator(OptionalEquipment optionalEquipment) {
        this.optionalEquipment = optionalEquipment;
    }
}
