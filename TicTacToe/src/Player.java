import java.util.Scanner;

public class Player {
	private int id;
	private boolean isComputer;

	public Player(int id) {
		super();
		this.id = id;
	}

	public Position makeMove() {
		System.out.println("Gracz:" + id + ", zaznacz pole.");
		Position playerMovePosition;

		System.out.println("Podaj 1 wspó³rzedn¹(x)");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println("Podaj 2 wspó³rzedn¹(y)");
		int y = in.nextInt();
		playerMovePosition = new Position(x, y);

		return playerMovePosition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isComputer() {
		return isComputer;
	}

	public void setComputer(boolean isComputer) {
		this.isComputer = isComputer;
	}

}
