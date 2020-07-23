package info.vziks.designpatterns.fundamentalpatterns.PropertyContainer;

/**
 * Interface PropertyContainer
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public interface PropertyContainer {

    Object addProperty(String name, Object value);

    Object getProperty(String name);

    String[] getPropertyNames();

    void deleteProperty(String name);

    void setProperty(String name, Object value) throws Exception;

    void removeProperties();
}
