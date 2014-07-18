package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
	
	//int [][] board;
	private int playersTurn;
	private int turnsTaken;
	//ArrayList <Tile> board;
	private Board board;
	
	public TicTacToe(){
		//board = new ArrayList <Tile>();
		//initBoard();
		board = new Board();
		playersTurn = 1;
		turnsTaken = 0;
	}
	
	/*
	public void initBoard(){
		List <xPosition> xValues = Arrays.asList(xPosition.values());
		List <yPosition> yValues = Arrays.asList(yPosition.values());
		for (int j = 0; j < yValues.size(); ++j){
			for (int i = 0; i < xValues.size(); ++i){
				//System.out.println(""+i+", "+j);
				xPosition x = xValues.get(i);
				yPosition y = yValues.get(j);
				//System.out.println(""+y+" "+x);
				Tile t = new Tile(y, x);
				board.add(t);				
			}			
		}
	}
	*/
	
	public void takeTurn(xPosition x, yPosition y){
		int index = getIndex(x,y);
		Tile t = board.get(index);
		if (t.getValue() == 0){
			t.setValue(playersTurn);
			swapTurns();
		}
	}
	
	public int getIndex(xPosition x, yPosition y){
		int xIndex = 0;
		int yIndex = 0;
		if (y == yPosition.top){
			yIndex = 0;
		}
		else if (y == yPosition.middle){
			yIndex = 3;
		}
		else {
			yIndex = 6;
		}
		if (x == xPosition.left){
			xIndex = 0;
		}
		else if (x == xPosition.center){
			xIndex = 1;
		}
		else {
			xIndex = 2;
		}
		return xIndex + yIndex;
	}
	
	public void swapTurns(){
		if (playersTurn == 1){
			playersTurn = 2;
		}
		else {
			playersTurn = 1;
		}
	}
	
	public static void main (String [] args){
		
		System.out.println("hello world!");
		TicTacToe t = new TicTacToe();
		t.takeTurn(xPosition.left, yPosition.top);
		
	}

}









