package info.vziks.designpatterns.behavioralpatterns.Command.Example1;

public class Receiver {
    public Receiver() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
