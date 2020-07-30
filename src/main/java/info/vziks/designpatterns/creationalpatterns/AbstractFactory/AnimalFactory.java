package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Interface AnimalFactory
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface AnimalFactory {
    Animal createAnimal(String type) throws Exception;
}
