package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

/**
 * Class Wolf
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
class Wolf extends Animal {

    public Wolf() {
        super(getClassName());
    }

    @Override
    void castVoice() {
        System.out.printf("%s say Auuuu\n", getClassName());
    }

    public static String getClassName() {
        return new Object() {
        }.getClass().getName();
    }
}
