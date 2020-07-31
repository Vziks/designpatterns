package info.vziks.designpatterns.creationalpatterns.Multiton;

/**
 * Class Mysql
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Mysql implements IDatabase {

    private String name = "Mysql";

    public String getName() {
        return name;
    }
}
