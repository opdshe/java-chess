package chess.domain.command;

public class StatusCommand implements Command {
    private static final String COMMAND = "status";

    public static boolean isStatus(String operation) {
        return COMMAND.equals(operation.toLowerCase());
    }

    @Override
    public void execute() {
    }
}
