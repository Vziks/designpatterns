package info.vziks.designpatterns.creationalpatterns.Multiton;

/**
 * Class Sqlite
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Sqlite implements IDatabase{
    private String name = "Sqlite";

    public String getName() {
        return name;
    }
}
