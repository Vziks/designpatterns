package info.vziks.designpatterns.behavioralpatterns.Memento;


/**
 * Class Main
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Order order = new Order();

        State state = order.getState();

        System.out.println("state " + state);

        System.out.println("equals order created" + state.getState().equals(States.CREATED));

        Memento memento = order.saveToMemento();

        System.out.println("memento " + memento);

        order.waiting();

        System.out.println("equals order waiting" + order.getState().getState().equals(States.WAITING_PAYMENT));

        order.payed();

        System.out.println("equals order payed" +  order.getState().getState().equals(States.PAYED));

        order.restoreFromMemento(memento);

        System.out.println("equals after restore " + order.getState().getState().equals(States.CREATED));
    }
}
