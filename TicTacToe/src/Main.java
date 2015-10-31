import java.util.*;

public class Main {
	 public static Scanner in = new Scanner(System.in);
	 
	 public static void Menu(){
	 System.out.println("Gra kó³ko i krzy¿yk");
	 System.out.println("----------MENU------------");
	 System.out.println("1 - Rozpocznij grê, 2 - Wyjœcie");
	 }
	
	public static void main(String[] args)  {
		Menu();
		while(in.nextInt()!=2){
			GameParams gameParams = GameParams.getGameParams();
			Player p1 = new Player(1);
			Player p2 = new Player(2);
			if(gameParams.isComputer){
			p2 = new Computer(2, gameParams);
			}
			Player activePlayer = p1;
			Game game = new Game(activePlayer, p1, p2, gameParams);
			game.startGame();
			game.endGame();
			Menu();
		}
		in.close();
	}
}
