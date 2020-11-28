package chess.controller;

import chess.domain.command.Command;
import chess.domain.command.CommandMapper;
import chess.view.InputView;
import chess.view.OutputView;

public class ChessGameController {
    public static void play() {
        OutputView.printGreetingMessage();
        inputCommand();
    }

    private static Command inputCommand() {
        Command command = null;
        try {
            command = CommandMapper.find(InputView.getCommand());
        } catch (Exception e) {
            OutputView.printMessageAndNewLine(e.getMessage());
            inputCommand();
        }
        return command;
    }
}
