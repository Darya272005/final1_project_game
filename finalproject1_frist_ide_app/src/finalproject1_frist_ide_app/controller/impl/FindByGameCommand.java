package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class FindByGameCommand implements Command {
	private final GameLogic boardGamesLogic;

	public FindByGameCommand() {
		this.boardGamesLogic = LogicProvider.getInstance().getBoardGameLogic();
	}

	@Override
	public String execute(String request) {
		String response;

		try {
			String text = extractTextFromRequest(request);
			response = "Результат поиска по тексту: " + boardGamesLogic.find(text);
		} catch (LogicException e) {
			response = "Ошибка поиска: " + e.getMessage();
		}

		return response;
	}

	private String extractTextFromRequest(String request) {
		String[] params = request.split("\n");
		return params[1].split("=")[1];
	}
}