package info.vziks.designpatterns.creationalpatterns.Multiton;

import java.util.HashMap;

/**
 * Class Multiton
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Multiton {
    private static final HashMap<String, IDatabase> instances = new HashMap<>();

    public static IDatabase getInstance(String type) throws Exception {

        if (!instances.containsKey(type)) {
            if ("Sqlite".equals(type)) {
                instances.put(type, new Sqlite());
            } else if ("Mysql".equals(type)) {
                instances.put(type, new Mysql());
            } else {
                throw new Exception("");
            }
        }
        return instances.get(type);
    }
}
