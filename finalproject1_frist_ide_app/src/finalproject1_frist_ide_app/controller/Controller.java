package finalproject1_frist_ide_app.controller;

public class Controller {
	private final char paramDelimiter = '\n';
	private final CommandProvider provider = new CommandProvider();

	public String doAction(String request) {
		String[] requestData = request.split(String.valueOf(paramDelimiter), 2);
		String commandName = requestData[0].toUpperCase();
		Command executionCommand = provider.getCommand(commandName);

		String response;
		if (executionCommand != null) {
			response = executionCommand.execute(requestData[1]);
		} else {
			response = "Command not found";
		}

		return response;
	}
}
