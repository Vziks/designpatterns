package info.vziks.designpatterns.behavioralpatterns.Memento;

/**
 * Class Order
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Order {

    private State currentState;

    public Order()
    {
        this.currentState = new State(States.CREATED);
    }

    public void waiting()
    {
        this.currentState = new State(States.WAITING_PAYMENT);
    }

    public void payed()
    {
        this.currentState = new State(States.PAYED);
    }

    public void close()
    {
        this.currentState = new State(States.CLOSE);
    }

    public void cancel()
    {
        this.currentState = new State(States.CANCELED);
    }

    public Memento saveToMemento() throws CloneNotSupportedException {
        return new Memento(this.currentState.clone());
    }

    public void restoreFromMemento(Memento memento)
    {
        this.currentState = memento.getState();
    }

    public State getState()
    {
        return this.currentState;
    }
}
