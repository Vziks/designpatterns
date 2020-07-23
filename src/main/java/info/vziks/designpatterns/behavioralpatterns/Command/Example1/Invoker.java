package info.vziks.designpatterns.behavioralpatterns.Command.Example1;

public class Invoker {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Invoker(Command flipUpCommand,Command flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}
