package pack;


public class MiniMax {
	
	public MiniMax(){
		
	}
	
	public void min(Node n){
		
	}
	
	public void max(Node n){
		if (n.getLeftChild() != null && n.getRightChild() != null){
			min(n.getLeftChild());
			min(n.getRightChild());
		}
		else if (n.getLeftChild() != null){
			min(n.getLeftChild());
		}
		else if (n.getRightChild() != null){
			min(n.getRightChild());
			
		}
		
		//n.setValue(n.getValue());
		//return n;
	}
	
	public void miniMax(Tree t){
	
		max(t.getRoot());
		
		
	}
	
	
	
	
	public static void main(String [] args){
		System.out.println("hello world");
	}

}
