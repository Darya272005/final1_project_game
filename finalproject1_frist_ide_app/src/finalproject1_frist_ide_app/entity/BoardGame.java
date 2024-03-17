package finalproject1_frist_ide_app.entity;

import java.util.Objects;
import java.util.UUID;

public class BoardGame {
	private String id;
	private String name;
	private String publisher;
	private int minPlayers;
	private int maxPlayers;
	private int playTime;
	private String genre;

	public BoardGame(String name, String publisher, int minPlayers, int maxPlayers, int playTime) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.publisher = publisher;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.playTime = playTime;
	}

	public BoardGame() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BoardGame boardGame = (BoardGame) o;
		return minPlayers == boardGame.minPlayers && maxPlayers == boardGame.maxPlayers
				&& playTime == boardGame.playTime && Objects.equals(id, boardGame.id)
				&& Objects.equals(name, boardGame.name) && Objects.equals(publisher, boardGame.publisher);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, publisher, minPlayers, maxPlayers, playTime);
	}

	@Override
	public String toString() {
		return "BoardGame{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", publisher='" + publisher + '\''
				+ ", minPlayers=" + minPlayers + ", maxPlayers=" + maxPlayers + ", playTime=" + playTime + ", genre='"
				+ genre + '\'' + '}';
	}

	public void setId(String string) {

	}

	public void setPublisher(String string) {

	}
}