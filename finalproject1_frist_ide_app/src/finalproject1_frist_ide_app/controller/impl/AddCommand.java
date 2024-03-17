package finalproject1_frist_ide_app.controller.impl;

import java.util.UUID;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.entity.BoardGame;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class AddCommand implements Command {
private final LogicProvider logicProvider = LogicProvider.getInstance();
private final GameLogic logic = logicProvider.getGameLogic();


@Override
public String execute(String request) {
    String response;

    try {
        String[] params = request.split("\n");
        BoardGame newGame = new BoardGame();
        newGame.setGenre(params[0].split("=")[1]);
        newGame.setName(params[1].split("=")[1]);
        newGame.setMinPlayers(Integer.parseInt(params[2].split("=")[1]));
        newGame.setMaxPlayers(Integer.parseInt(params[3].split("=")[1]));
        newGame.setPlayTime(Integer.parseInt(params[4].split("=")[1]));
		newGame.setPublisher(params[5].split("=")[1]);
        newGame.setId(UUID.randomUUID().toString());

        logic.addGame(newGame);
        response = "Информация о настольной игре добавлена успешно.";
    } catch (LogicException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
        response = "Что-то пошло не так. Попробуйте еще раз.";
    }

    return response;
}
}