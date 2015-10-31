
public class Game {
	private Player activePlayer;
	Board board;
	Player p1;
	Player p2;
	GameParams gameParams;

	public Game(Player activePlayer, Player p1, Player p2, GameParams gameParams) {
		super();
		this.activePlayer = activePlayer;
		this.p1 = p1;
		this.p2 = p2;
		this.gameParams = gameParams;
	}

	public void startGame() {
		/// utworz tablice
		board = new Board(gameParams);
		board.clearBoard();
		board.printBoard();
	}

	public void endGame() {
		board.printBoard();
		System.out.println("Koniec gry");
	}

	public boolean makeMoveAndCheckWin(Player player) {
		Position position = player.makeMove();
		/// sprawdz czy wygral
		while (!board.setField(player, position)) {
			System.out.println("Wprowadzono chujowe dane");
			position = player.makeMove();
		}

		return board.isPlayerWin(player);
	}

	public void changePlayers(Player activePlayer) {
		/// zmien gracza
		if (activePlayer.getId() == 1) {
			activePlayer.setId(2);
		} else {
			activePlayer.setId(1);
		}
		board.printBoard();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activePlayer == null) ? 0 : activePlayer.hashCode());
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		if (activePlayer == null) {
			if (other.activePlayer != null)
				return false;
		} else if (!activePlayer.equals(other.activePlayer))
			return false;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		return true;
	}

}
