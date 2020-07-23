package info.vziks.designpatterns.behavioralpatterns.Command.Example2;

public class Example2 {

    public static void main(String[] args) {
        ContainerCommands commands = new ContainerCommands();
        commands.addCommand(new Command1());
        commands.addCommand(new Command2());
        commands.addCommand(new Command3());

        commands.runCommands();

    }
}
