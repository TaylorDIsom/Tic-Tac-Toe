package pack;

import java.util.Random;

public class TicTacToe {
	
	private int playersTurn;
	private int turnsTaken;
	private Board board;
	
	public TicTacToe(){
		newGame();
	}

	public void newGame(){
		board = new Board();
		playersTurn = 1;
		turnsTaken = 0;
		while(!isGameOver()){
			Random rand = new Random();
			int y = rand.nextInt(3);
			int x = rand.nextInt(3);
			Position p = new Position(yPosition.values()[y],xPosition.values()[x]);
			takeTurn(p);
		}
	}
	
	public void takeTurn(Position p){
		Tile t = board.getTile(p);
		if (t.getValue() == 0){
			t.setValue(playersTurn);
			swapTurns();
		}
	}

	public void swapTurns(){
		if (playersTurn == 1){
			playersTurn = 2;
		}
		else {
			playersTurn = 1;
		}
		turnsTaken++; 
	}
	
	public boolean isGameOver(){
		boolean bool = false;
		if (turnsTaken > 8){
			return true;
		}
		return bool;
	}
	
	public static void main (String [] args){
		
		System.out.println("hello world!");
		TicTacToe t = new TicTacToe();
		t.board.print();
		System.out.println("done");
	}

}









