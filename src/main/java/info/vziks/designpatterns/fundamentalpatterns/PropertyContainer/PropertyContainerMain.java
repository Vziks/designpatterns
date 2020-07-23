package info.vziks.designpatterns.fundamentalpatterns.PropertyContainer;

/**
 * Class PropertyContainer
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class PropertyContainerMain {

    public static void main(String[] args) {
        SimpleExample simpleExample = new SimpleExample();
        Object obj;

        obj = simpleExample.addProperty("name", "1111");
        System.out.println(obj);
        obj = simpleExample.addProperty("name", "2222");
        obj = simpleExample.addProperty("name1", "2222");
        obj = simpleExample.addProperty("name2", "2222");
        obj = simpleExample.addProperty("name3", "2222");
        obj = simpleExample.addProperty("name4", "2222");
        System.out.println(simpleExample);
        obj = simpleExample.getProperty("name");
        System.out.println(obj);

        for (String srt :
                simpleExample.getPropertyNames()) {
            System.out.println(srt);

        }

        simpleExample.deleteProperty("name1");

        for (String srt :
                simpleExample.getPropertyNames()) {
            System.out.println(srt);
        }


//        try {
//            simpleExample.setProperty("name1","5555");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(simpleExample.getProperty("name"));
        try {
            simpleExample.setProperty("name", "66666");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(simpleExample.getProperty("name"));

        simpleExample.removeProperties();
        for (String srt :
                simpleExample.getPropertyNames()) {
            System.out.println(srt);
        }

        simpleExample.addProperty("1", "1");
        for (String srt :
                simpleExample.getPropertyNames()) {
            System.out.println(srt);
        }
    }

}
