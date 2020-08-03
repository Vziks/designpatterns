package info.vziks.designpatterns.behavioralpatterns.Memento;

/**
 * Class Memento
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Memento {

    private State state;

    public Memento(State stateToSave) {
        this.state = stateToSave;
    }

    public State getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state=" + state +
                '}';
    }
}
