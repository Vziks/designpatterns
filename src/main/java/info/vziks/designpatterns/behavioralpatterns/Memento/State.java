package info.vziks.designpatterns.behavioralpatterns.Memento;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class State
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class State implements Cloneable {
    private States state;

    private List<States> validStates = new ArrayList<>();

    public State(States state) {

        for (States stat : States.values()) {
            validStates.add(stat);
        }

        this.ensureIsValidState(state);
        this.state = state;
    }

    private void ensureIsValidState(States state) {
        if (!validStates.contains(state)) {
            throw  new IllegalArgumentException("Invalid state given");
        }
    }

    @Override
    public String toString() {
        return "State{" +
                "state=" + state +
                '}';
    }

    @Override
    protected State clone() throws CloneNotSupportedException {
        return (State) super.clone();
    }

    public States getState() {
        return state;
    }
}
