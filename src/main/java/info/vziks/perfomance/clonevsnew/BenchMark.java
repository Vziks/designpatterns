package info.vziks.perfomance.clonevsnew;

import java.text.SimpleDateFormat;

/**
 * Class BenchMark
 * Project designpatterns
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class BenchMark {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SimpleDateFormat localSdf = (SimpleDateFormat) sdf.clone();
        }
        System.out.println("Cloning SimpleDateFormat : " + (System.currentTimeMillis() - start) + " ms");


        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SimpleDateFormat localSdf = new SimpleDateFormat("yyyy-MM-dd");
        }
        System.out.println("Creating SimpleDateFormat : " + (System.currentTimeMillis() - start) + " ms");






        Person person = new Person("name", 21);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Person localPerson = (Person) person.clone();
        }
        System.out.println("Cloning Person : " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Person localPerson = new Person("name", 21);
        }
        System.out.println("Creating Person : " + (System.currentTimeMillis() - start) + " ms");


        try {
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            start = System.currentTimeMillis();
            SDFHolder holder = new SDFHolder();
            holder.setSdf(sdf2);
            for (int i = 0; i < 1000000; i++) {
                SDFHolder locHolder = (SDFHolder) holder.clone();
            }
            System.out.println("Cloning SDFHolder: " + (System.currentTimeMillis() - start) + " ms");
            start = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                SDFHolder locHolder = new SDFHolder();
                locHolder.setSdf(sdf2);
            }
            System.out.println("Creating SDFHolder: " + (System.currentTimeMillis() - start) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Person implements Cloneable {

    public Person(String name, int age) {
        this.name = name;
        this.age = age * 2;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}

class SDFHolder implements Cloneable {
    private SimpleDateFormat sdf;

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public SimpleDateFormat getSdf() {
        return this.sdf;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}