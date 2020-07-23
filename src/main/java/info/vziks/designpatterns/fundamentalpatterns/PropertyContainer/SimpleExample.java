package info.vziks.designpatterns.fundamentalpatterns.PropertyContainer;

import java.util.*;

/**
 * Class SimpleExample
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SimpleExample implements PropertyContainer {

    private Map<String, Object> propertyContainer = new HashMap<>();


    @Override
    public Object addProperty(String name, Object value) {
        return this.propertyContainer.put(name, value);
    }

    @Override
    public Object getProperty(String name) {
        return this.propertyContainer.get(name);
    }

    @Override
    public String[] getPropertyNames() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Set keys = this.propertyContainer.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()) {
            stringArrayList.add(i.next().toString());
        }

        return stringArrayList.toArray(new String[0]);
    }

    @Override
    public void deleteProperty(String name) {
        this.propertyContainer.remove(name);
    }

    @Override
    public void setProperty(String name, Object value) throws Exception {
        if (!this.propertyContainer.containsKey(name)) {
            throw new Exception(String.format("The property [%s] not found", name));
        }
        this.propertyContainer.replace(name, value);
    }

    @Override
    public void removeProperties() {
        this.propertyContainer.clear();
    }
}
