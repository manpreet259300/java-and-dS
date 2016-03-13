package SingleLinkList;
import java.util.Scanner;

public class Demo {
	
	public static void main (String[] args){
	
		Scanner scan = new Scanner(System.in);
		LinkList List = new LinkList();
		List.createList();
		
		while(true){
			System.out.println("1.Display List");
			System.out.println("2.count the no nodes");
			System.out.println("3.search the no of element");
			System.out.println("4. insert element at beginning");
			System.out.println("5. insert element at end");
			System.out.println("6. insert node at given position");
			System.out.println("7. insert node after the provided node");
			System.out.println("8. insert node before the provided node");
			System.out.println("9. delete first node");
			System.out.println("10. delete Last node");
			System.out.println("11. delete a node");
			System.out.println("12. reverse a list");
			System.out.println("13. bubble sort using data");
			System.out.println("14. bubble sort using link");
			System.out.println("15. detect a cycle");
			System.out.println("16. remove a cycle");
			System.out.println("17. insert a cycle");
			
			System.out.println("100.Quit");
			
			System.out.println("======enter the choice===============");
			
			int choice = scan.nextInt();
			
			if (choice==100)
				break;
			
			switch(choice)
			{
			case 1:
				List.displayList();
				break;
			case 2:
				List.count();
				break;
			case 3:
				System.out.println("enter the item to be searched");
				int x= scan.nextInt();
				System.out.println("entered no to be searched is "+x);
				List.search(x);
				break;
			case 4:
				System.out.println("enter the element to be added at beginning");
				int y= scan.nextInt();
				List.insertInBeginning(y);
				System.out.println("element is added at the beginning");
				List.displayList();
				break;
			case 5:
				System.out.println("Enter the item to be added at last");
				int z= scan.nextInt();
				List.insertAtEnd(z);
				System.out.println("item inserted at end");
				List.displayList();
				break;
			case 6:
				System.out.println("Enter the position where element is added");
				int position = scan.nextInt();
				System.out.println("Enter the element to be added in between");
				int val = scan.nextInt();
				List.insertInBetween(position, val);
				System.out.println("element is added in between");
				break;
			case 7:
				System.out.println("Enter the node after which data has to be inserted");
				int node = scan.nextInt();
				System.out.println("enter the data to be inserted");
				int data = scan.nextInt();
				List.insertAfterNode(data, node);
				List.displayList();
				break;
			case 8:
				System.out.println("Enter the node before which data has to be inserted");
				int node1 = scan.nextInt();
				System.out.println("enter the data to be inserted");
				int data1 = scan.nextInt();
				List.insertBeforeNode(data1, node1);
				List.displayList();
				break;
			case 9:
				List.deleteFirstNode();
				List.displayList();
				break;
			case 10:
				List.deleteLastNode();
				List.displayList();
				break;
			case 11:
				System.out.println("enter the node to be deleted");
				int data3 = scan.nextInt();
				List.deleteNode(data3);
				List.displayList();
				break;
			case 12:
				List.reverse();
				List.displayList();
				break;
			case 13:
				List.bubbleSortData();
				List.displayList();
				break;
			case 14:
				List.bubbleSortLink();
				List.displayList();
				break;
			case 15:
				boolean present = List.hasCycle();
				if (present)
				{
					System.out.println("cycle is present");
				}
				else
					System.out.println("cycle is not present");
				break;
			case 16:
				List.removeCycle();
				System.out.println("cycle is removed");
				break;
			case 17:
				System.out.println("enter the value of node where cycle should start");
				int nodeValue = scan.nextInt();
				List.insertCycle(nodeValue);
				System.out.println("cycle is inserted");
				break;
			default:
				System.out.println("enter the value  provided in the list");
				
			}	
		}
		scan.close();
	}
}
