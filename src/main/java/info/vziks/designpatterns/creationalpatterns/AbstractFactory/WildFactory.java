package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Class WildFactory
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class WildFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) throws Exception {
        if ("wolf".equals(type))
            return new Wolf();
        else if ("fox".equals(type))
            return new Fox();

        throw new Exception("No found pet animal");
    }
}
