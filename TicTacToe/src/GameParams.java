import java.util.Scanner;

public class GameParams {
	public int boardSize;
	public int fieldsToWin;
	public boolean isComputer;

	public GameParams(int boardSize, int fieldsToWin, boolean isComputer) {
		super();
		this.boardSize = boardSize;
		this.fieldsToWin = fieldsToWin;
		this.isComputer = isComputer;
	}
	
	public static GameParams getGameParams() {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj parametry gry:");
		System.out.println("1 - Multiplayer, 2 - Singleplayer");
		int gameType = in.nextInt();
		boolean isComputer;
		if (gameType == 2) {
			isComputer = true;
		} else {
			isComputer = false;
		}
		System.out.println("- Podaj ilosc pol:");
		int boardSize = in.nextInt();
		System.out.println("- Podaj ilosc pol do wygrania:");
		int fieldsToWin = in.nextInt();
		GameParams gp = new GameParams(boardSize, fieldsToWin, isComputer);
		return gp;
	}

}
