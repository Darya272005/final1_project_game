package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.entity.BoardGame;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class UpdateCommand implements Command {
	private final GameLogic boardGameLogic;

	public UpdateCommand() {
		this.boardGameLogic = LogicProvider.getInstance().getGameLogic();
	}

	@Override
	public String execute(String request) {
		String response = null;
		String[] params;
		BoardGame updatedGame;

		try {
			params = request.split("\n");
			updatedGame = new BoardGame(params[2].split("=")[1], params[3].split("=")[1],
					Integer.parseInt(params[4].split("=")[1]), Integer.parseInt(params[5].split("=")[1]),
					Integer.parseInt(params[6].split("=")[1]));
			updatedGame.setId(params[1].split("=")[1]);

			boardGameLogic.updateGame(updatedGame);
			response = "Информация о настольной игре успешно обновлена.";
		} catch (LogicException e) {
			response = "Ошибка при обновлении информации о настольной игре.";
		}

		return response;
	}
}