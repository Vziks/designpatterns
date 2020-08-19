package info.vziks.designpatterns.behavioralpatterns.State;

/**
 * Interface State
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface State {
    void proceedToNext(Order order);
    String toString();
}
