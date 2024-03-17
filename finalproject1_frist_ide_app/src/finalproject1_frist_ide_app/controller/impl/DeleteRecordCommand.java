package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class DeleteRecordCommand implements Command {
	private final GameLogic boardGamesLogic;

	public DeleteRecordCommand() {
		this.boardGamesLogic = LogicProvider.getInstance().getGameLogic();
	}

	@Override
	public String execute(String request) {
		String response;

		try {
			String id = extractIdFromRequest(request);
			boardGamesLogic.deleteGame(id);
			response = "Настольная игра успешно удалена.";
		} catch (LogicException e) {
			response = "Ошибка удаления настольной игры.";
		}

		return response;
	}

	private String extractIdFromRequest(String request) {
		String[] params = request.split("\n");
		return params[1].split("=")[1];
	}
}
