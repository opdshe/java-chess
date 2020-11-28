package chess.domain.command;

import utils.CommandSplitter;

public class MoveCommand implements Command {
    private static final String COMMAND = "move";
    private static final int SOURCE_INDEX = 0;
    private static final int DESTINATION_INDEX = 1;

    private String source;
    private String dest;

    public MoveCommand(String rawCommand) {
        String[] splitCommand = CommandSplitter.getSourceAndDest(rawCommand);
        source = splitCommand[SOURCE_INDEX];
        dest = splitCommand[DESTINATION_INDEX];
    }

    @Override
    public void execute() {
    }
}
