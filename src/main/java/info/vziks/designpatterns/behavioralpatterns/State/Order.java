package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Class Order
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Order {

    private State state;

    public static Order create()
    {
        Order order = new Order();
        order.state = new StateCreated();
        return order;
    }

    public void proceedToNext()
    {
        state.proceedToNext(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "state=" + state +
                '}';
    }
}
