package finalproject1_frist_ide_app.logic;

import finalproject1_frist_ide_app.logic.impl.GameLogicImpl;

public final class LogicProvider {
	private static final LogicProvider instance;
	private GameLogic gameLogic;

	static {
		instance = new LogicProvider();
		instance.gameLogic = new GameLogicImpl();
	}

	public LogicProvider() {
	}

	public static LogicProvider getInstance() {
		return instance;
	}

	public GameLogic getGameLogic() {
		return gameLogic;
	}

	public GameLogic getBoardGameLogic() {
		return new GameLogicImpl();
	}
}