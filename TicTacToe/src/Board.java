
public class Board {
	private int fieldsToWin;
	private char[][] gameBoard;
	public int size;

	public boolean setField(Player player, Position position) {//////ZWRACA TRUE LUB FALSE W ZALEZNOSCI OD TEGO CZY KTOS DOBRZE ZAZNACZYL
		//////////tutaj bedzie caly algorytm sprawdzenie czy dobrze ktos zaznaczyl
		if (gameBoard[position.x][position.y] == 0) {
			if (player.getId() == 1) {
				gameBoard[position.x][position.y] = 'X';
				return true;
			} else {
				gameBoard[position.x][position.y] = 'O';
				return true;
			}
		}

		else {
			
			return false;
		}
		/////// dokonczyc
	}

	public void clearBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				gameBoard[i][j] = 0;
			}
		}
	}

	public boolean isPlayerWin(Player player) {

		if (checkHorizontalWin(player)) {
			return true;
		}

		if (checkVerticalWin(player)) {
			return true;
		}

		if (checkDiagonalWin(player)) {
			return true;
		}
		return false;

	}

	public boolean checkHorizontalWin(Player player)

	{

		for (int row = 0; row < size; row++) {
			int total = 0;

			for (int col = 0; col < size; col++) {
				total += gameBoard[row][col];
			}

			if (total % player.getId() == 0) {
				return true;
			}
		}

		return false;
	}

	public boolean checkVerticalWin(Player player) {
		for (int col = 0; col < size; col++) {
			int total = 0;

			for (int row = 0; row < size; row++) {
				total += gameBoard[row][col];
			}

			if (total % player.getId() == 0) {
				return true;
			}
		}

		return false;
	}

	public boolean checkDiagonalWin(Player player) {
		int total = 0;

		for (int lr = 0; lr < size; lr++) {
			total += gameBoard[lr][lr];
		}

		if (total % player.getId() == 0) {
			return true;
		}

		total = 0;

		for (int rl = 0; rl < size; rl++) {
			total += gameBoard[rl][size - rl - 1];

		}

		if (total % player.getId() == 0) {
			return true;
		}
		return false;
	}

	public Board(GameParams gp) {
		this.fieldsToWin = gp.fieldsToWin;
		this.gameBoard = new char[gp.boardSize][gp.boardSize];
		this.size = gp.boardSize;
	}

	public void printBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println(gameBoard[i][j]);
			}
		}
	}
}
