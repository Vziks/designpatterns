package info.vziks.designpatterns.creationalpatterns.FactoryMethod;

public class AnimalFactoryExample {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.makeAnimal("wolf");
        System.out.println(animal instanceof Wolf);
        animal.castVoice();
        animal = AnimalFactory.makeAnimal("lion");
        System.out.println(animal instanceof Lion);
        animal.castVoice();
        animal = AnimalFactory.makeAnimal("cow");
        System.out.println(animal instanceof Cow);
        animal.castVoice();
    }
}