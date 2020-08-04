package info.vziks.designpatterns.behavioralpatterns.Command.Example2;

import java.util.ArrayList;
import java.util.List;

public class ContainerCommands {

    private List<Command> commandList = new ArrayList<>();

    /**
     * Add command.
     *
     * @param command the command
     */
    public void addCommand(Command command) {
        commandList.add(command);
    }

    /**
     * Run tasks.
     */
    public void runCommands() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
