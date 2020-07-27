package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

/**
 * Class Cow
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
class Cow extends Animal {

    public Cow() {
        super(getClassName());
    }

    @Override
    void castVoice() {
        System.out.printf("%s say Muuuu\n", getClassName());
    }

    public static String getClassName() {
        return new Object() {
        }.getClass().getName();
    }

}
