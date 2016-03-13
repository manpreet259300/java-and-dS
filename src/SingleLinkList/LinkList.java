package SingleLinkList;
import java.util.Scanner;

public class LinkList {
	
	Scanner scan = new Scanner(System.in);
	private Node start;
	
	public LinkList()
	{
		start = null;
	}
	
	
	//===============display list===============================//
	public void displayList() 
	{
		System.out.println("======================================");
		Node p;
		if (start==null) 
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			p = start;
			while(p!=null){
				System.out.print(p.info +" ");
				p=p.link;
			}
			System.out.println("");
		}	
		System.out.println("======================================");
	}
	
	//===============count of list===============================//
	public void count(){
		Node p;
		int counter = 0;
		if (start==null) {
			System.out.println("list is empty");
			return;
		}
		p=start;
		while(p!=null)
		{
			counter++;
			p=p.link;
		}
		System.out.println("Total number of links are " + counter);
	}
	
	//=============== Search and tell the location===============================//
	
	//correct search==============//
	public boolean search(int x) {
//		boolean flag=false;
		int counter=1;
		Node p;
		p=start;
		while(p!=null){
			if (p.info == x)
			{	//flag=true;
				break;}
			counter++;
			p=p.link;
		}
		
	//	if(p.link==null && flag==false)
		if(p==null)
		{	System.out.println("item is not searched");
			return false;
		}
		else 
		{
			System.out.println("item is present at position "+counter);
			return true;
		}
	}
	
	//=============== insert at beginning===============================//
	
	public void insertInBeginning(int x)
	{
		Node p;
		Node temp = new Node(x);
		temp.link=start;
		start=temp;
	}
	
	//=============== insert at End===============================//
	public void insertAtEnd(int x) 
	{	
		Node p;
		Node temp = new Node(x);
		p=start;
		if(start==null)
		{
			start = temp;
			return;
		}
		while(p.link!=null)
		{
			p=p.link;
		}
		
		p.link=temp;
	}
	
	//=============== Insert in between (or a position) ===============================//
	public void insertInBetween(int position, int data)
	{	
		Node temp= new Node(data);
		Node p;
		
		if (position == 1){
			temp.link=start;
			start = temp;
			System.out.println("item is inserted");
			return;
		}
		p = start;
		int counter=1;
		
		while(p!=null)
		{
			counter++;
			if(counter==position){
				break;
			}
			p=p.link;
		}
		
		if(p==null)
		{	System.out.println("position not found");}
		else {
			temp.link = p.link;
			p.link = temp;
		}
	}
	
	//============insert after a node with node provided==============//
	
	public void insertAfterNode(int dataToInsert, int nodeData)
	{
		Node temp = new Node(dataToInsert);
		Node p;
		p=start;
		while(p!=null)
		{
			if(p.info==nodeData)
			{	break;
			}
			p=p.link;
		}
		if(p==null)
		{	System.out.println("node is not found with specified data");}
		else {
			temp.link=p.link;
			p.link=temp;
			System.out.println("node is inserted");
		}
		
	}
	
	//============insert before a node with node provided==============//
	public void insertBeforeNode(int dataToInsert, int nodeData)
	{
		Node temp = new Node(dataToInsert);
		if(start.info==nodeData){
			temp.link=start;
			start=temp;
			System.out.println("item is inserted");
			return;
		}
		Node p;
		p = start;
		while(p.link!=null)
		{
			if(p.link.info==nodeData)
			{
				break;
			}
			p=p.link;
		}
		if(p.link==null)
		{	System.out.println("node is not found with specified data");}
		else {
			temp.link = p.link;
			p.link=temp;
		}
		
	}
	
	//=============== delete first Node ===============================//
	public void deleteFirstNode() 
	{	
		if(start==null){
			System.out.println("list is empty");
			return;
		}
		start = start.link;
	}
	
	//=============== delete last Node ===============================//
		public void deleteLastNode() 
		{	
			if(start==null){
				System.out.println("list is empty");
				return;
			}
			
			if (start.link==null){
				start = null;
				return;
			}
			
			Node p;
			p=start;
			while(p.link.link!=null) {
				p=p.link;
			}
			p.link=null;
		}
	
		//=============== delete a Node ===============================//
		public void deleteNode(int data)
		{
			if(start == null)
			{
				System.out.println("list is empty");
				return;
			}
			
			if(start.info==data){
				start=start.link;
				return;
			}
			Node p;
			p = start;
			while(p.link!=null)
			{
				if(p.link.info == data){
					//p.link = p.link.link;
					break;
				}
				p=p.link;
			}
			
			if(p.link==null){
				System.out.println("the node is not found with value" + data);
			}
			else {
				p.link=p.link.link;
				System.out.println("node deleted");
			}
		}
		
	//=============== reversing a list ===============================//
		public void reverse()
		{	
			if (start == null)
			{
				System.out.println("list is empty");
				return;
			}
			Node prev, p, next;
			prev=null;
			p=start;
			while(p!=null)
			{
				next = p.link;
				p.link = prev;
				prev = p;
				p = next;
			}
			start=prev;
		}
	
	//=============== bubble sort a list using data ===============================//
		public void bubbleSortData()
		{
			Node p,q,end;
			
			for(end=null;end!=start;end=p)
			{
				for(p=start;p.link!=end;p=p.link)
				{
					q=p.link;
					if(p.info > q.info)
					{
						int temp = p.info;
						p.info = q.info;
						q.info = temp;
					}
				}
			}
		}
		
	//=============== bubble sort a list using link ===============================//
		public void bubbleSortLink()
		{
			Node p, q, r, end, temp;
			for(end=null; end!=start; end=p)
			{
				for(r=p=start; p.link!=end; r=p,p=p.link)
				{
				 	q=p.link;
				 	if(p.info>q.info)
				 	{
				 		p.link =q.link;
				 		q.link=p;
				 		if(p!=start)
				 		{
				 			r.link=q;
				 		}
				 		else
				 		{
				 			start = q;
				 		}
				 		temp = p;
				 		p=q;
				 		q=temp;
				 	}
				}
			}
		}
		
	//=============== bubble sort a list using link ===============================//
		public boolean hasCycle()
		{	
			if(findCycle() == null)
				return false;
			else
				return true;
		}
		
		private Node findCycle()
		{	if(start == null || start.link == null)
				return null;
			Node slowR = start;
			Node fastR = start;
			
			while(fastR !=null && slowR != null)
			{
				slowR = slowR.link;
				fastR = fastR.link.link;
				if (slowR == fastR)
				{
					return slowR;
				}
			}
			return null;
		}
	//=============== removing a cycle ===============================//
		public void removeCycle()
		{
			Node c= findCycle();
			if (c==null)
				return;
			System.out.println("node detected is " + c.info);
			Node p=c, q=c;
			int lenCycle=0;
			
			do
			{
				lenCycle++;
				q=q.link;
			}while(p!=q);
			System.out.println("length of the cycle is "+lenCycle);
			int lenRemList = 0;
			p=start;
			while(p!=q)
			{
				lenRemList++;
				p=p.link;
				q=q.link;
			}
			
			System.out.println("no of nodes not included in cycle are " +lenRemList);
			
			int lengthList = lenRemList + lenCycle;
			
			System.out.println("length of the list is " + lengthList);
			
			p=start;
			for (int i=1; i<=lengthList - 1; i++)
			{
				p=p.link;
			}
			
			p.link=null;
		}
		
	//=============== inserting a cycle in a list===============================//
		
		public void insertCycle(int x)
		{
			if (start == null)
				return;
			
			Node p=start, px=null, prev = null;
			
			while (p!=null)
			{
				if (p.info == x)
				{
					px =p;
				}
				
				prev = p;
				p =p.link;
			}
			
			if (px!= null)
			{
				prev.link = px;
			}
			else
			{
				System.out.println( x + " not present in list");
			}
		}
	//=============== creating a list ===============================//
	public void createList() {
		System.out.println("entern the no of nodes to be created");
		int nodeCounter = scan.nextInt();
		
		for (int i=0;i<nodeCounter;i++)
		{
			System.out.println("enter the item to be added");
			int item = scan.nextInt();
			insertAtEnd(item);
		}
	}
}
