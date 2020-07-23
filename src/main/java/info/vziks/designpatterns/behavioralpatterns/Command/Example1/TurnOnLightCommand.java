package info.vziks.designpatterns.behavioralpatterns.Command.Example1;

public class TurnOnLightCommand implements Command{
    private Receiver theLight;

    public TurnOnLightCommand(Receiver light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}
