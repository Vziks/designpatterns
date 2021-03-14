package info.vziks.designpatterns.behavioralpatterns.Observer;

/**
 * Interface Observable
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface Observable {
    void attach(Observer o);
    void remove(Observer o);
    void informAll();
}
