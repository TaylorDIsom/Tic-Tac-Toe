package pack;
import java.util.Arrays;


public class Tree <T>{
	
	private int size;
	private Node root;

	public Tree(Node n){
		
		size = 0;
		root = n;
		
	}
	
	public void setRoot(Node n){
		root = n;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public Tree createTree (Node [] leaves){
		int lIndex;
		int rIndex;
		Node lChild;
		Node rChild;
		while (leaves.length != 1){
			int numNodes = leaves.length;
			int i = 0;
			for (i = 0; i < numNodes/2; ++i){
				lIndex = 2*i;
				rIndex = lIndex+1;
				lChild = leaves[lIndex];
				rChild = leaves[rIndex];
				T value = null;
				Node parent = new Node(value);
				parent.setLeftChild(lChild);
				parent.setRightChild(rChild);
				leaves[i] = parent;
				System.out.print(lIndex+" "+rIndex+" ");
			}
			
			leaves = Arrays.copyOfRange(leaves, 0, i);
			
			System.out.println();
		}
		Node root = leaves[0];
		Tree t = new Tree(root);
		return t;
	}
	
	public static void main (String [] args){

		Node n1 = new Node(null);
		Node n2 = new Node(null);
		Node n3 = new Node(null);
		Node n4 = new Node(null);
		Node n5 = new Node(null);
		Node n6 = new Node(null);
		Node n7 = new Node(null);
		Node n8 = new Node(null);
		
		Node[] nodeList = {n1,n2,n3,n4,n5,n6,n7,n8};
		
		Tree t = new Tree(new Node(null));
		
		t.createTree(nodeList);
		
	}
}
