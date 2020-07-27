package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

/**
 * Class Lion
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
class Lion extends Animal {

    public Lion() {
        super(getClassName());
    }

    @Override
    void castVoice() {
        System.out.printf("%s say Rrrrr\n", getClassName());
    }

    public static String getClassName() {
        return new Object() {
        }.getClass().getName();
    }
}
