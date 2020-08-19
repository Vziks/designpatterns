package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Class StateDone
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class StateDone implements State {
    @Override
    public void proceedToNext(Order order) {

    }

    @Override
    public String toString() {
        return "StateDone{}";
    }
}
