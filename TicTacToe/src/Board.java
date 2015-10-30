
public class Board {
	private int fieldsToWin;
	private char[][] gameBoard;

	public boolean setField(Player player, Position position) {
		if (gameBoard[position.x][position.y] == 0) {
			if(player.getId() == 1){
			gameBoard[position.x][position.y] = 'X';
			return true;
			}
			else{
				gameBoard[position.x][position.y] = 'O';
				return true;
			}
		}

		else {
			System.out.println("Zle zaznaczyles pole");
			return false;
		}
		/////// dokonczyc
	}

	public void clearBoard() {
		for (int i = 0; i < gameBoard[i].length; i++) {
			for (int j = 0; j < gameBoard[j].length; j++) {
				gameBoard[i][j] = 0;
			}
		}
	}

	public boolean isPlayerWin(Player player) {
		
		
		return true;
	}

	public Board(GameParams gp) {
		this.fieldsToWin = gp.fieldsToWin;
		this.gameBoard = new char[gp.boardSize][gp.boardSize];
	}

	public void printBoard() {
		for (int i = 0; i < gameBoard[i].length; i++) {
			for (int j = 0; j < gameBoard[j].length; j++) {
				System.out.println(gameBoard[i][j]);
			}
		}
	}
}
