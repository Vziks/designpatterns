package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Class PetFactory
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class PetFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) throws Exception {
        if ("pig".equals(type))
            return new Pig();
        else if ("rabbit".equals(type))
            return new Rabbit();

        throw new Exception("No found pet animal");
    }
}
