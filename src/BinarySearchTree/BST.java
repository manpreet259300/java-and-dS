package BinarySearchTree;

public class BST {

	private Node root;
	
	public BST()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return (root == null);
	}
	
	//search by iteration
	public boolean searchByIteration(int x)
	{
		Node p =root;
		while(p!=null)
		{
			if(x == p.info)
			{
				return true;
			}
			else if(x <p.info)
			{
				p =p.lChild;
			}
			else
			{
				p =p.rChild;
			}
		}
		return false;
	}
	
	//search by recursion
	public boolean searchByRecursion(int x)
	{
		
		return (search(root, x)!=null);
	}
	
	public Node search(Node p, int x)
	{
		if(p == null)
			return null;
		if(x>p.info)
			search(p.rChild, x);
		if(x<p.info);
			search(p.lChild, x);
		return p;
	}
	
	// for finding minimum
	
	public int minUsingIteration()
	{
		if(isEmpty())
			return  -1;
		Node p =root;
		while(p.lChild!=null)
			p =p.lChild;
		return p.info;
	}
	
	//recursive method
	public int minUsingRecursion()
	{
		if(isEmpty())
			return -1;
		return min(root).info;
	}
	
	public Node min(Node p){
		if(p.lChild==null)
			return p;
		return max(p.lChild);
	}
	
	//finding maximum
	
	public int maxUsingIteration()
	{
		if(isEmpty())
			return -1;
		Node p = root;
		while(p.rChild!=null)
			p = p.rChild;
		return p.info;
	}
	
	//recursive method
	
	public int maxUsingRecursion()
	{
		if(isEmpty())
			return -1;
		return max(root).info;
	}
	
	public Node max(Node p){
		if(p.rChild==null)
			return p;
		return max(p.rChild);
	}
	
	//inserting a node in BST
	
	public void insert(int x)
	{
		Node p = root;
		Node par = null;
		
		while(p!=null)
		{
			par = p;
			if(x<p.info)
			{
				p =p.lChild;
			}
			else if(x > p.info)
			{
				p =p.rChild;
			}
			else
			{
				System.out.println("already present in the tree");
			}
		}
		
		Node temp = new Node(x);
		if(par == null)
		{
			root = temp;
		}
		else if(x <par.info)
		{
			par.lChild = temp;
		}
		else 
			par.rChild = temp;
	}
	
	//write recursive ethod
	
}
