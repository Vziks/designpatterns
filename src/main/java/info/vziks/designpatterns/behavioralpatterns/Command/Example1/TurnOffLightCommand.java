package info.vziks.designpatterns.behavioralpatterns.Command.Example1;

public class TurnOffLightCommand implements Command{
    private final Receiver theLight;

    public TurnOffLightCommand(Receiver light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}
