package finalproject1_frist_ide_app.dao;

import finalproject1_frist_ide_app.dao.impl.FileGameDao;

public class DaoProvider {
	private static DaoProvider instance;
	private GameDao boardGameDao;

	private DaoProvider() {
		this.boardGameDao = new FileGameDao(); // Изменили на FileGameDao
	}

	public static DaoProvider getInstance() {
		if (instance == null) {
			synchronized (DaoProvider.class) {
				if (instance == null) {
					instance = new DaoProvider();
				}
			}
		}
		return instance;
	}

	public GameDao getBoardGameDao() { // Изменили на getBoardGameDao
		return boardGameDao;
	}
}