
public class Board {
	private int fieldsToWin;
	private int[][] gameBoard;
	public int size;

	public boolean setField(Player player, Position position) {////// ZWRACA
		////// TRUE LUB
		////// FALSE W
		////// ZALEZNOSCI
		////// OD TEGO
		////// CZY KTOS
		////// DOBRZE
		////// ZAZNACZYL
		////////// tutaj bedzie caly algorytm sprawdzenie czy dobrze ktos
		////////// zaznaczyl
		if ((position.y-1) < size && (position.x-1) < size) {

			if (gameBoard[position.y-1][position.x-1] == 0) {
				if (player.getId() == 1) {
					gameBoard[position.y-1][position.x-1] = 1;
					return true;
				} else {
					gameBoard[position.y-1][position.x-1] = 2;
					return true;
				}
			}

			else {

				return false;
			}
		} else
			return false;
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
				if (gameBoard[row][col] == player.getId()) {
					total++;
					if (total == fieldsToWin) {
						return true;
					}
				} else {
					total = 0;
				}
			}
		}
		return false;
	}

	public boolean checkVerticalWin(Player player) {
		for (int col = 0; col < size; col++) {
			int total = 0;
			for (int row = 0; row < size; row++) {
				if (gameBoard[row][col] == player.getId()) {
					total++;
					if (total == fieldsToWin) {
						return true;
					}
				} else {
					total = 0;
				}
			}
		}
		return false;
	}

	public boolean checkDiagonalWin(Player player) {
		int total = 0;

		for (int lr = 0; lr < size; lr++) {
			if (gameBoard[lr][lr] == player.getId()) {
				total++;
				if (total == fieldsToWin) {
					return true;
				}
			} else {
				total = 0;
			}
		}

		total = 0;

		for (int rl = 0; rl < size; rl++) {
			//total += gameBoard[rl][size - rl - 1];
			if (gameBoard[rl][size - rl - 1] == player.getId()) {
				total++;
				if (total == fieldsToWin) {
					return true;
				}
			} else {
				total = 0;
			}

		}
		return false;
	}

	public Board(GameParams gp) {
		this.fieldsToWin = gp.fieldsToWin;
		this.gameBoard = new int[gp.boardSize][gp.boardSize];
		this.size = gp.boardSize;
	}

	public void printBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (gameBoard[i][j] == 1) {
					System.out.print("|X|");
				} else {
					if (gameBoard[i][j] == 2) {
						System.out.print("|O|");
					} else {
						System.out.print("| |");
					}
				}
			}
			System.out.println("");
		}
	}
}
