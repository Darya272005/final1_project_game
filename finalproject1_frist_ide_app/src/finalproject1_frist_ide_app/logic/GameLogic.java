package finalproject1_frist_ide_app.logic;

import finalproject1_frist_ide_app.entity.BoardGame;

import java.util.List;

public interface GameLogic {
    void addGame(BoardGame boardGame) throws LogicException;

    void updateGame(BoardGame boardGame) throws LogicException;

    void deleteGame(String id) throws LogicException;

    List<BoardGame> getAllGames() throws LogicException;

    List<BoardGame> findGamesByName(String name) throws LogicException;

    List<BoardGame> findGamesByPublisher(String publisher) throws LogicException;

    List<BoardGame> findGamesByPlayerRange(int minPlayers, int maxPlayers) throws LogicException;

    List<BoardGame> findGamesByPlayTime(int playTime) throws LogicException;

    void update(BoardGame boardGame) throws LogicException;

    void clearBoardGame() throws LogicException;

    String find(String text) throws LogicException;

	void add(BoardGame boardGame) throws LogicException;

	void delete(String id) throws LogicException;

	List<BoardGame> findByName(String name) throws LogicException;

	List<BoardGame> getAll() throws LogicException;

	List<BoardGame> findByPublisher(String publisher) throws LogicException;

	List<BoardGame> findByPlayerRange(int minPlayers, int maxPlayers) throws LogicException;

	List<BoardGame> findByPlayTime(int playTime) throws LogicException;

	void clearBoardGame1() throws LogicException;
}