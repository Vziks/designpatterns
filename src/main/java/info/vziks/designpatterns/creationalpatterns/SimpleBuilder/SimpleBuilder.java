package info.vziks.designpatterns.creationalpatterns.SimpleBuilder;

/**
 * Class SimpleBuilder
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class SimpleBuilder {

    public static void main(String[] args) throws Exception {

        User user01 = new User.UserBuilder("Tamara", "Bowers")
                .age(30)
                .phone("517-272-3316")
                .address("Michigan, Lansing, 1486  Amethyst Drive")
                .build();

        System.out.println(user01);

        User user02 = new User.UserBuilder("Vicente", "Marsh")
                .age(40)
                .phone("432-394-8869")
                .build();

        System.out.println(user02);

        User user03 = new User.UserBuilder("Corrine", "Roberts")
                .build();

        System.out.println(user03);

        User user04 = new User.UserBuilder("Caitlin", "Bradford")
                .phone("203-932-8742")
                .build();

        System.out.println(user04);
    }
}
