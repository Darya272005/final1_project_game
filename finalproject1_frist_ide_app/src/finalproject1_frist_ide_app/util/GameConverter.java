package finalproject1_frist_ide_app.util;

import finalproject1_frist_ide_app.entity.BoardGame;

import java.util.ArrayList;
import java.util.List;

public class GameConverter {

	public static BoardGame toBoardGame(String data) {
		String[] arrayData = data.split(";");

		BoardGame boardGame = new BoardGame();
		boardGame.setId(arrayData[0]);
		boardGame.setName(arrayData[1]);
		boardGame.setPublisher(arrayData[2]);
		boardGame.setMinPlayers(Integer.parseInt(arrayData[3]));
		boardGame.setMaxPlayers(Integer.parseInt(arrayData[4]));
		boardGame.setPlayTime(Integer.parseInt(arrayData[5]));

		return boardGame;
	}

	public static List<String> boardGamesToString(List<BoardGame> data) {
		final String DELIMITER = ";";

		List<String> strBoardGames = new ArrayList<>();

		for (BoardGame boardGame : data) {
			String strBoardGame = boardGame.getId() + DELIMITER + boardGame.getName() + DELIMITER
					+ boardGame.getPublisher() + DELIMITER + boardGame.getMinPlayers() + DELIMITER
					+ boardGame.getMaxPlayers() + DELIMITER + boardGame.getPlayTime() + DELIMITER;
			strBoardGames.add(strBoardGame);
		}

		return strBoardGames;
	}
}