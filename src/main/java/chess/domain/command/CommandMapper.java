package chess.domain.command;

import chess.validators.CommandValidator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CommandMapper {
    private static final Map<Predicate<String>, Supplier<Command>> mapper = new HashMap<>();

    static {
        mapper.put(StartCommand::isStart, StartCommand::new);
        mapper.put(EndCommand::isEnd, EndCommand::new);
        mapper.put(StatusCommand::isStatus, StatusCommand::new);
    }

    public static Command find(String rawCommand) {
        CommandValidator.validateCommand(rawCommand);
        for (Map.Entry<Predicate<String>, Supplier<Command>> entry : mapper.entrySet()) {
            if (entry.getKey().test(rawCommand)) {
                return entry.getValue().get();
            }
        }
        return new MoveCommand(rawCommand);
    }
}
