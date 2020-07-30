package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Interface Animal
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface Animal {
    void eat();
    void call();
    void move(int x, int y);
}