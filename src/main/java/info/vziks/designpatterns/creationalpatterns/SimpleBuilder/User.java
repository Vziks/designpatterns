package info.vziks.designpatterns.creationalpatterns.SimpleBuilder;

/**
 * Class User
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class User {
    private final String firstName; // req
    private final String lastName; // req
    private final int age; // opt
    private final String phone; // opt
    private final String address; // opt

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() throws Exception {

            User user = new User(this);

            if (!validateUserObject(user)) {
                throw new Exception("User not valid");
            }

            return user;
        }

        private boolean validateUserObject(User user) {
            return true;
        }
    }
}