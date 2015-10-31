import java.util.Random;
import java.util.Scanner;

public class Player {
	private int id;
	private boolean isComputer;

	public Player(int id, boolean isComputer) {
		super();
		this.id = id;
		this.isComputer = isComputer;
	}

	public Position makeMove() {
		System.out.println("Gracz:" + id + ", zaznacz pole.");
		Position playerMovePosition;

		// gracz lub komputer
		if (isComputer) {

			Random generator = new Random();/// musi byc jakis zakres, pewnie
											/// trzeba bedzie jakos poprawic
			int x = generator.nextInt();
			int y = generator.nextInt();
			playerMovePosition = new Position(x, y);
		} else {
			System.out.println("Podaj 1 wspolrzedna(x)");
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			System.out.println("Podaj 2 wspolrzedna(y)");
			int y = in.nextInt();
			in.close();
			playerMovePosition = new Position(x, y);
			
		}

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
