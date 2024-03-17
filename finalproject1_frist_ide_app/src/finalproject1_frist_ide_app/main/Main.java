package finalproject1_frist_ide_app.main;

import finalproject1_frist_ide_app.controller.Controller;

public class Main {
	private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) {
		Controller controller = new Controller();
		StringBuilder output = new StringBuilder();

		String request;
		String response;

		request = "GETALL";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		request = "ADD\nМонополия\nHasbro\n2\n4\n120";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		request = "FINDBYNAME\nМонополия";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		request = "UPDATE\n808af100-7251-431e-b174-f7be08e6af70\nМонополия\nHasbro\n2\n6\n180";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		request = "DELETE\n808af100-7251-431e-b174-f7be08e6af70";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		request = "CLEAR";
		response = controller.doAction(request);
		output.append(response).append(LINE_SEPARATOR);

		System.out.println(output.toString());
	}
}