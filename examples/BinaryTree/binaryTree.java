package BinaryTree;

public class binaryTree {
	
	private Node root;
	
	public binaryTree()
	{
		root = null;
	}

	public void creatTree()
	{
		root = new Node('P');
		root.lChild = new Node('Q');
		root.rChild = new Node('R');
		root.lChild.lChild = new Node('A');
		root.lChild.rChild = new Node('B');
		root.rChild.lChild = new Node('X');
	}
}
