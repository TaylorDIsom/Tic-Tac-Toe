package pack;

public class Node <T> {

	private T value;
	private Node parent;
	private Node leftChild;
	private Node rightChild;
	
	public Node (T v){
		
		value = v;
		parent = null;
		leftChild = null;
		rightChild = null;
		
	}
	
	public void setValue(T v){
		value = v;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setParent(Node p){
		parent = p;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public void setLeftChild(Node lc){
		leftChild = lc;
	}
	
	public Node getLeftChild(){
		return leftChild;
	}
	
	public void setRightChild(Node rc){
		rightChild = rc;
	}
	
	public Node getRightChild(){
		return rightChild;
	}
	
	public Double compareTo(Node n){
		T v1 = value;
		T v2 = (T) n.getValue();
		if ( (v1 instanceof Integer || v1 instanceof Double || v1 instanceof Long) && 
				(v2 instanceof Integer || v2 instanceof Double || v2 instanceof Long)){
			return Double.parseDouble(v1.toString()) - Double.parseDouble(v2.toString());
		}
		return 0.0;
	}
	
	public static void main (String [] args){
		System.out.println("hello world!");
		Node n1 = new Node(7);
		Node n2 = new Node(3);
		System.out.println(n1.compareTo(n2));
	}
	
}




