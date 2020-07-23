package info.vziks.designpatterns.behavioralpatterns.Command.Example1;

public class Example1 {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command switchUp = new TurnOnLightCommand(receiver);
        Command switchDown = new TurnOffLightCommand(receiver);

        Invoker s = new Invoker(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}
