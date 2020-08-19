package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Class StateCreated
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class StateCreated implements State {
    @Override
    public void proceedToNext(Order order) {
        order.setState(new ShippingState());
    }

    @Override
    public String toString() {
        return "StateCreated{}";
    }
}
