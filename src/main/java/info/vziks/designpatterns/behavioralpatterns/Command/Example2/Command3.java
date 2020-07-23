package info.vziks.designpatterns.behavioralpatterns.Command.Example2;

public class Command3 implements Command {
    @Override
    public void execute() {
        System.out.println(getClass());
    }
}
