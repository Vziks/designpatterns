package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Class MainState
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class MainState {

    public static void main(String[] args) {
        Order order = Order.create();

        System.out.println(order);
        order.proceedToNext();
        System.out.println(order);
        order.proceedToNext();
        System.out.println(order);
        order.proceedToNext();
        System.out.println(order);

    }
}
