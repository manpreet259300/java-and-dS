package BinaryTree;
import java.util.*;

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
	
	//max element in binary tree
	
	public int findMaximumElement(Node p)
	{
		int root_val,left, right, max=Integer.MIN_VALUE;
		if(p!=null)
		{
			root_val = p.info;
			left =findMaximumElement(p.lChild);
			right = findMaximumElement(p.rChild);
			
			if(left>right)
				max = left;
			else if(right > left)
				max = right;
			else
				max = p.info;
		}
		return max;
	}
	
	//searching in binary tree
	
	public boolean searchBinaryTree(Node p, int data)
	{
		Boolean temp;
		//when the tree is empty
		if(p == null)
			return false;
		else
		{
			if(p.info == data)
				return true;
			else
			{
				temp = searchBinaryTree(p.lChild, data);
				if(temp!=true)
					return temp;
				return (searchBinaryTree(p.rChild, data));
			}
		}
	}
	
	//inserting a node in tree
	public void insert(int newNodeData)
	{
		insertNode(root, newNodeData);
	}
	public void insertNode(Node p, int newNodeData)
	{
		Queue q = new LinkedList();
		Node n = new Node(newNodeData);
		Node temp;
		if(p == null)
			System.out.println("empty tree");
		q.add(p);
		while(!q.isEmpty())
		{
			temp = (Node)q.remove();
			if(temp.lChild!=null)
				q.add(temp.lChild);
			else
			{
				//setting methods have not been addedd 
				temp.setLeft(n);
				q.clear();
				return;
			}
			if(p.rChild!=null)
				q.add(temp.rChild);
			else
			{
				//setting methods have not been addedd 
				temp.setRight(n);
				q.clear();
				return;
			}		
		}
	}
	
	public int size()
	{
		return sizeOfBinaryTree(root);
	}
	//size of binary tree
	public int sizeOfBinaryTree(Node p)
	{
		if(p == null)
			return 0;
		return(sizeOfBinaryTree(p.lChild) + 1 + sizeOfBinaryTree(p.rChild));
	}
	//pre order traversal - NLR
	
	public void preOrderTraversal()
	{
		preOrder(root);
		System.out.println();
	}
	
	public void preOrder(Node p)
	{
		if(p==null)
			return;
		System.out.print(p.info + " ");
		preOrder(p.lChild);
		preOrder(p.rChild);
	}
	
	//In order Traaversal - LNR
	
	public void inOrderTraversal()
	{
		inOrder(root);
		System.out.println();
	} 
	
	public void inOrder(Node p)
	{
		if(p==null)
			return;
		inOrder(p.lChild);
			System.out.print(p.info + " ");
		inOrder(p.rChild);
	}
	
	//post order traversal - LRN
	public void postOrderTraversal()
	{
		postOrder(root);
		System.out.println();
	}
	
	
	public void postOrder(Node p)
	{
		if(p == null)
			return;
		
		postOrder(p.rChild);
		postOrder(p.lChild);
		System.out.print(p.info + " ");
	}
	
	//levelorder traversal
	public void levelOrder()
	{
		if (root == null)
		{
			System.out.println("tree is empty");
			return;
		}
		
		Queue q = new LinkedList();
		
		q.add(root);
		
		Node p;
		
		while(!q.isEmpty())
		{
			p = (Node)q.remove();
			System.out.println(p.info + " ");
			if(p.lChild!= null)
				{
					q.add(p.lChild);
				}
			if(p.rChild!=null)
				{
				 q.add(p.rChild);	
				}
		}
		System.out.println(" ");
	}
	
	//height of subtree
	
	public int heightofTree()
	{
		return height(root);
	}
	
	private int height(Node p)
	{
		if(p == null)
			return 0;
		
		int hL = height(p.lChild);
		int hR = height(p.rChild);
		
		if(hL > hR)
		{
			return 1+hL;
		}
		else
		{
			return 1+hR;
		}
	}
}

