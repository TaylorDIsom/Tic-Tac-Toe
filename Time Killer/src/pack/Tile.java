package pack;


public class Tile {
	
	private xPosition xPos;
	private yPosition yPos;
	private int value;
	
	public Tile(xPosition x, yPosition y){
		xPos = x;
		yPos = y;
		value = 0;
		
	}
	
	public void setValue(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setX(xPosition x){
		xPos = x;
	}
	
	public xPosition getX(){
		return xPos;
	}

	
	public void setY(yPosition y){
		yPos = y;
	}
	
	public yPosition getY(){
		return yPos;
	}
	
	
}
