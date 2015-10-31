import java.util.Random;

public class Computer extends Player {

	private GameParams gameParams;

	public Computer(int id, GameParams gameParams) {
		super(id);
		this.gameParams = gameParams;
	}

	
	public Position makeMove() {
		int size = gameParams.boardSize;
		Random generator = new Random();
		int x = generator.nextInt(size);
		int y = generator.nextInt(size);
		Position playerMovePosition = new Position(x, y);
		return playerMovePosition;
	}

}
