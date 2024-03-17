package finalproject1_frist_ide_app.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import finalproject1_frist_ide_app.entity.BoardGame;

public class WriterRiderFilesUtil {

	public static void export(List<BoardGame> boardGames, String filePath) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (BoardGame boardGame : boardGames) {
				String line = boardGame.getId() + ";" + boardGame.getName() + ";" + boardGame.getPublisher() + ";"
						+ boardGame.getMinPlayers() + ";" + boardGame.getMaxPlayers() + ";" + boardGame.getPlayTime();
				writer.write(line);
				writer.newLine();
			}
		}
	}

	public static List<BoardGame> importBoardGames(String filePath) throws IOException {
		List<BoardGame> boardGames = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(";");
				BoardGame boardGame = new BoardGame(data[1], data[2], Integer.parseInt(data[3]),
						Integer.parseInt(data[4]), Integer.parseInt(data[5]));
				boardGame.setId(data[0]);
				boardGames.add(boardGame);
			}
		}
		return boardGames;
	}

	public static List<String> importBoardGame() {

		return null;
	}

	public static void exportBoardGame(List<String> boardGamesToString) {

	}
}