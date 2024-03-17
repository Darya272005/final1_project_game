package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class GetAllCommand implements Command {
	private final GameLogic boardGamesLogic;

	public GetAllCommand() {
		this.boardGamesLogic = LogicProvider.getInstance().getBoardGameLogic();
	}

	@Override
	public String execute(String request) {
		String response;

		try {
			response = "Список всех настольных игр: " + boardGamesLogic.getAllGames();
		} catch (LogicException e) {
			response = "Ошибка при получении списка настольных игр";
		}

		return response;
	}
}
