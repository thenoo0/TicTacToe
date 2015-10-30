import java.util.*;

public class Main {
	
//	public static void Menu(){
//		System.out.println("Gra kolko i krzyzyk");
//		System.out.println("blablablalbalba");	
//	}
	public static GameParams getGameParams(){
		System.out.println("Podaj parametry gry:");
		System.out.println("- Multiplayer = 1, Singleplayer = 2");
		Scanner in = new Scanner(System.in);
		int gameType = in.nextInt();
		boolean isComputer;
		if(gameType==1){
		isComputer = true;
		}
		else{
			isComputer = false;
		}
		System.out.println("- Podaj ilosc pol:");
		int boardSize = in.nextInt();
		System.out.println("- Podaj ilosc pol do wygrania:");
		int fieldsToWin = in.nextInt();
		GameParams gp = new GameParams(boardSize, fieldsToWin, isComputer);
		return gp;
	}
	
	public static void main(String[] args){
		///while(1 - rozpocznij gre, 2 - wyjscie z programu
		//Menu();
		GameParams gameParams = getGameParams();
		Player p1 = new Player(1, false);
		Player p2 = new Player(2, gameParams.isComputer);
		
		System.out.println();
		///koniec petli(wyjscie z petli koniec programu)
	}
}
