
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

	public boolean makeMoveAndCheckWin(Player player) {
		Position position = player.makeMove();
		/// sprawdz czy wygral
		while (!board.setField(player, position)) {
			System.out.println("Wprowadzono chujowe dane");
			position = player.makeMove();
		}

		return board.isPlayerWin(player);
	}

	private void changePlayers() {
		///zmien gracza
		///board.printBoard();
	}

}
