package finalproject1_frist_ide_app.dao;

import java.util.List;
import finalproject1_frist_ide_app.entity.BoardGame;

public interface GameDao {
	void save(BoardGame game) throws DaoException;

	void update(BoardGame game) throws DaoException;

	List<BoardGame> getAll() throws DaoException;

	void clear() throws DaoException;

	void delete(String id) throws DaoException;

	List<BoardGame> findByPublisher(String publisher) throws DaoException;

	List<BoardGame> findByName(int playTime);

	List<BoardGame> findByPlayerRange(int minPlayers, int maxPlayers);

	List<BoardGame> findByName(String name);
}