package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Class AnimalAbstractFactory
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class AnimalAbstractFactory {

    public static void main(String[] args) throws Exception {

        Animal animal = createAnimalFactory("wild").createAnimal("wolf");
        animal.call();
        animal = createAnimalFactory("wild").createAnimal("fox");
        animal.call();

        animal = createAnimalFactory("home").createAnimal("pig");
        animal.call();

        animal = createAnimalFactory("home").createAnimal("rabbit");
        animal.call();

    }

    public static AnimalFactory createAnimalFactory(String type) throws Exception {
        if("wild".equals(type))
            return new WildFactory();
        else if ("home".equals(type))
            return new PetFactory();

        throw new Exception("no found factory");
    }

}
