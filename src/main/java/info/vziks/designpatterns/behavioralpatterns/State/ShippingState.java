package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Class ShippingState
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class ShippingState implements State {
    @Override
    public void proceedToNext(Order order) {
        order.setState(new StateDone());
    }

    @Override
    public String toString() {
        return "ShippingState{}";
    }
}
