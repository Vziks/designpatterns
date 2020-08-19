package info.vziks.designpatterns.behavioralpatterns.Memento;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        validStates.addAll(Arrays.asList(States.values()));

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
