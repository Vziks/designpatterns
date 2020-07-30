package info.vziks.designpatterns.creationalpatterns.AbstractFactory;

/**
 * Class Pig
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Pig implements Animal {
    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }

    @Override
    public void call() {
        System.out.println("pig voice!!!");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to " + x + ", " + y);
    }
}
