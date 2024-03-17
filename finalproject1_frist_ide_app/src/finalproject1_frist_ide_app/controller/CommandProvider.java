package finalproject1_frist_ide_app.controller;

import java.util.HashMap;
import java.util.Map;

import finalproject1_frist_ide_app.controller.impl.*;

public class CommandProvider {

	private final Map<String, Command> repository = new HashMap<>();

	public CommandProvider() {
		repository.put("add", new AddCommand());
		repository.put("update", new UpdateCommand());
		repository.put("delete", new DeleteCommand());
		repository.put("findbygame", new FindByGameCommand());
		repository.put("get_all", new GetAllCommand());
		repository.put("wrong_entry", new NoSuchCommand());
		repository.put("delete_record", new DeleteRecordCommand());
	}

	public Command getCommand(String name) {
		return repository.getOrDefault(name.toLowerCase(), repository.get("wrong_entry"));
	}
}