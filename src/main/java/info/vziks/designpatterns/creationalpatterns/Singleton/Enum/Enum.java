package info.vziks.designpatterns.creationalpatterns.Singleton.Enum;

public class Enum {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        singleton1.setString("Foo");
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton2.setString("Bar");


        System.out.println(singleton1.string);
        System.out.println(singleton1.string);
        System.out.println(singleton2);
        System.out.println(singleton2.string);
        System.out.println(singleton1 == singleton2);
    }
}
