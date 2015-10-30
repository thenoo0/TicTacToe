
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
	
	public void startGame(){
		///utworz tablice
		///
		board = new Board(gameParams);
	}
	
	public boolean makeMoveAndCheckWin(Player player){
		player.makeMove();
		///sprawdz czy wygral
	 
        return board.isPlayerWin(player);
	}
	
	private void changePlayers(){
		
	}
	
}
