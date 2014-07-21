package pack;


public class Tile {
	
	private Position pos;
	private int value;
	
	public Tile(Position pos){
		this.pos = pos;
		value = 0;
		
	}
	
	public void setValue(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setPos(Position pos){
		this.pos = pos;
	}
	
	public Position getPos(){
		return pos;
	}
	
}
