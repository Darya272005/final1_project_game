package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;
import finalproject1_frist_ide_app.logic.GameLogic;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.LogicProvider;

public class DeleteCommand implements Command {
	private final LogicProvider logicProvider;
	private final GameLogic logic;

	public DeleteCommand() {
		this.logicProvider = new LogicProvider();
		this.logic = logicProvider.getGameLogic();
	}

	@Override
	public String execute(String request) {
		String response;

		try {
			logic.clearBoardGame();
			response = "Успешно удалены все настольные игры.";
		} catch (LogicException e) {
			response = "При удалении настольных игр произошла ошибка.";
		}

		return response;
	}
}
