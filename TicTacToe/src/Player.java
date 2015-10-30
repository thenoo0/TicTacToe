
public class Player {
	private int id;
	private boolean isComputer;

	public Player(int id, boolean isComputer) {
		super();
		this.id = id;
		this.isComputer = isComputer;
	}
	
	public Position makeMove(){
		return null;
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
