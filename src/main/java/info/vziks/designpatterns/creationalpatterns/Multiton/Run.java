package info.vziks.designpatterns.creationalpatterns.Multiton;

/**
 * Class Run
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Run {

    public static void main(String[] args) throws Exception {

        IDatabase iDatabase1 = Multiton.getInstance("Mysql");
        System.out.println(iDatabase1);
        System.out.println(iDatabase1.getName());

        IDatabase iDatabase2 = Multiton.getInstance("Sqlite");
        System.out.println(iDatabase2);
        System.out.println(iDatabase2.getName());


        IDatabase iDatabase3 = Multiton.getInstance("Mysql");
        System.out.println(iDatabase3);
        System.out.println(iDatabase3.getName());


        IDatabase iDatabase4 = Multiton.getInstance("Sqlite");
        System.out.println(iDatabase4);
        System.out.println(iDatabase4.getName());

        System.out.println(iDatabase3.equals(iDatabase1));
        System.out.println(iDatabase4.equals(iDatabase2));


        try {
            IDatabase iDatabase5 = Multiton.getInstance("SomeElse");
        }catch (Exception e) {
            System.out.println("something went wrong");
        }

    }
}
