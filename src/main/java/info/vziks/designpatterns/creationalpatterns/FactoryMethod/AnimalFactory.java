package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

import java.util.HashMap;

/**
 * Class AnimalFactory
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
class AnimalFactory {
    private static HashMap<String, Animal> factory = new HashMap<>();

    static {
        factory.put("wolf", new Wolf());
        factory.put("cow", new Cow());
        factory.put("lion", new Lion());
    }

    public static Animal makeAnimal(String type) {
        if (factory.containsKey(type)) {
            return factory.get(type);
        }
        throw new IllegalArgumentException("No found object in factory");
    }
}
