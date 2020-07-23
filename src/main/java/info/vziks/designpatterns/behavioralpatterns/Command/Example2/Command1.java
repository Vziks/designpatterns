package info.vziks.designpatterns.behavioralpatterns.Command.Example2;

public class Command1 implements Command {
    @Override
    public void execute() {
        System.out.println(getClass());
    }
}
