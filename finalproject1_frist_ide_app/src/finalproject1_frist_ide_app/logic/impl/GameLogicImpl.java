package finalproject1_frist_ide_app.logic.impl;

import java.util.List;

import finalproject1_frist_ide_app.dao.DaoException;
import finalproject1_frist_ide_app.dao.DaoProvider;
import finalproject1_frist_ide_app.dao.GameDao;
import finalproject1_frist_ide_app.entity.BoardGame;
import finalproject1_frist_ide_app.logic.LogicException;
import finalproject1_frist_ide_app.logic.GameLogic;

public class GameLogicImpl implements GameLogic {
	private final GameDao dao;

	public GameLogicImpl() {
		this.dao = DaoProvider.getInstance().getBoardGameDao();
	}

	@Override
	public void add(BoardGame boardGame) throws LogicException {
		try {
			dao.save(boardGame);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void update(BoardGame boardGame) throws LogicException {
		try {
			dao.update(boardGame);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void delete(String id) throws LogicException {
		try {
			dao.delete(id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<BoardGame> getAll() throws LogicException {
		try {
			return dao.getAll();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<BoardGame> findByName(String name) throws LogicException {
		return dao.findByName(name);
	}

	@Override
	public List<BoardGame> findByPublisher(String publisher) throws LogicException {
		try {
			return dao.findByPublisher(publisher);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<BoardGame> findByPlayerRange(int minPlayers, int maxPlayers) throws LogicException {
		return dao.findByPlayerRange(minPlayers, maxPlayers);
	}

	@Override
	public List<BoardGame> findByPlayTime(int playTime) throws LogicException {
		return dao.findByName(playTime);
	}

	@Override
	public void clearBoardGame1() throws LogicException {
		try {
			dao.clear();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public String find(String text) throws LogicException {

		try {
			List<BoardGame> games = dao.getAll();
			StringBuilder result = new StringBuilder();
			for (BoardGame game : games) {
				if (game.getName().contains(text) || game.getPublisher().contains(text)) {
					result.append(game.getName()).append(", ").append(game.getPublisher()).append("\n");
				}
			}
			return result.toString();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void addGame(BoardGame boardGame) throws LogicException {
		try {
			dao.save(boardGame);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void updateGame(BoardGame boardGame) throws LogicException {
		try {
			dao.update(boardGame);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void deleteGame(String id) throws LogicException {
		try {
			dao.delete(id);
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<BoardGame> getAllGames() throws LogicException {
		try {
			return dao.getAll();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public void clearBoardGame() throws LogicException {
		try {
			dao.clear();
		} catch (DaoException e) {
			throw new LogicException(e);
		}
	}

	@Override
	public List<BoardGame> findGamesByName(String name) throws LogicException {

		return null;
	}

	@Override
	public List<BoardGame> findGamesByPublisher(String publisher) throws LogicException {

		return null;
	}

	@Override
	public List<BoardGame> findGamesByPlayerRange(int minPlayers, int maxPlayers) throws LogicException {

		return null;
	}

	@Override
	public List<BoardGame> findGamesByPlayTime(int playTime) throws LogicException {

		return null;
	}
}