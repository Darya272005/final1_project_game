package finalproject1_frist_ide_app.dao.impl;

import finalproject1_frist_ide_app.dao.GameDao;
import finalproject1_frist_ide_app.dao.DaoException;
import finalproject1_frist_ide_app.entity.BoardGame;
import finalproject1_frist_ide_app.util.GameConverter;
import finalproject1_frist_ide_app.util.WriterRiderFilesUtil;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class FileGameDao implements GameDao {

	private final List<BoardGame> boardGamesList;

	public FileGameDao() {
		this.boardGamesList = new CopyOnWriteArrayList<>();
	}

	@Override
	public void save(BoardGame game) throws DaoException {
		boardGamesList.add(game);
		writeBoardGamesToFile();
	}

	@Override
	public void update(BoardGame game) throws DaoException {
		boardGamesList.removeIf(boardGame -> boardGame.getId().equals(game.getId()));
		boardGamesList.add(game);
		writeBoardGamesToFile();
	}

	@Override
	public List<BoardGame> getAll() throws DaoException {
		boardGamesList.clear();
		List<BoardGame> games = readBoardGamesFromFile().stream().map(GameConverter::toBoardGame)
				.collect(Collectors.toList());
		boardGamesList.addAll(games);
		return boardGamesList;
	}

	@Override
	public void clear() throws DaoException {
		boardGamesList.clear();
		writeBoardGamesToFile();
	}

	@Override
	public void delete(String id) throws DaoException {
		boardGamesList.removeIf(boardGame -> boardGame.getId().equals(id));
		writeBoardGamesToFile();
	}

	private List<String> readBoardGamesFromFile() throws DaoException {
		return WriterRiderFilesUtil.importBoardGame();
	}

	private void writeBoardGamesToFile() throws DaoException {
		WriterRiderFilesUtil.exportBoardGame(GameConverter.boardGamesToString(boardGamesList));
	}

	@Override
	public List<BoardGame> findByPublisher(String publisher) throws DaoException {

		return null;
	}

	@Override
	public List<BoardGame> findByName(String name) {

		return null;
	}

	@Override
	public List<BoardGame> findByPlayerRange(int minPlayers, int maxPlayers) {

		return null;
	}
}