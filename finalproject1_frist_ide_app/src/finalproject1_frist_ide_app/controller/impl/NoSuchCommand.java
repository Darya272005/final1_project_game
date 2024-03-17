package finalproject1_frist_ide_app.controller.impl;

import finalproject1_frist_ide_app.controller.Command;

public class NoSuchCommand implements Command {
	private final String errorMessage = "Неизвестная команда";

	@Override
	public String execute(String request) {
		return errorMessage;
	}
}
