import java.util.ArrayList;

public class Apriori {
	private static Apriori ap;
//	private static final String Public = null;
	
	//creating arraylist for getting all the transactional records
	private ArrayList<int[]> mTransaction = new ArrayList<int[]>();
	  //providing minimum support as 2
	  private int mMinSup = 2;

	  public static void main(String[] args) {
		ap = new Apriori();
	    ap.initializeValues();
	    ap.executeApriori();
	  }
	  
	  //providing input for the algorithm to work on
	  private void initializeValues() {
		int[] item1 = {1, 3, 4};
		int[] item2 = {2, 3, 5};
		int[] item3 = {1, 2, 3, 5};
		int[] item4 = {2, 5};
	    mTransaction.add(item1);
	    mTransaction.add(item2);
	    mTransaction.add(item3);
	    mTransaction.add(item4);
	  }
	  
	  public void executeApriori() {
		  
	    ArrayList<ItemList> first = generateCandidateFromTransaction();
	    System.out.println("==============================================================================");
	    printItemList(first);
	    while(true) {
	      ArrayList<ItemList> second = generateCandidateFromList(first);
	      ArrayList<ItemList> second_2 = generateNextListFromCandidate(second);
	      System.out.println("================================================================================");
	      printItemList(second_2);
	      if (second_2.size() <= 1) {
	        break;
	      }
	      first = second_2;
	    }
	  }
	  
	  
	  
	  // generating list structure for storing data of candidates
	  // and creating getters and setters
	  
	  public class ItemList {
	    private int mCount;
	    private int[] mItems;
	    private int mSup = 2;
	    
	    public ItemList(int c, int[] i, int s) {
	      mCount = c;
	      mItems = i;
	      mSup = s;
	    }
	    
	    public int getSupport() {
	      return mSup;
	    }
	    public int[] getItems() {
	      return mItems;
	    }
	    public int getItem(int index) {
	      return mItems[index];
	    }
	    public int getCount() {
	      return mCount;
	    }
	    
	    // matching the candidates
	    public boolean isAlreadyExist(ArrayList<ItemList> items) {
	      boolean res = false;
	      for (int i = 0; i < items.size(); i++) {
	        if (Apriori.ap.contain(items.get(i).getItems(), this.getItems())) {
	          return true;
	        }
	      }
	      return res;
	    }
	  }
	  
	  
	  //counting the no of frequent itemsets(set) present in the transaction arraylist
	  private int countAppearance(ArrayList<int[]> set, int[] target) {
	    int ret = 0;
	    for (int i = 0; i < set.size(); i++) {
	      if (contain(set.get(i), target)) {
	        ret++;
	      }
	    }
	    return ret;
	  }
	  
	  //matching with the single transaction at a time for getting the frequency(if match increase in count of ret will occur from method countAppearnace)
	  //returns boolean true if matched.
	  private boolean contain(int[] source, int[] find) {
	    boolean ret = false;
	    int match = 0;
	    for (int i = 0; i < find.length; i++) {
	      for (int j = 0; j < source.length; j++) {
	        if (source[j] == find[i]) {
	          match++;
	        }
	      }
	    }
	    if(match == find.length) {
	      ret = true;
	    }
	    return ret;
	  }
	  
	  private ArrayList<ItemList> generateCandidateFromTransaction() {
	    ArrayList<ItemList> ret = new ArrayList<ItemList>();
	    ArrayList<Integer> items = new ArrayList<Integer>();
	    
	    //traversing through the items of the transaction file
	    for (int i = 0; i < mTransaction.size(); i++) {
	      int[] temp_items = mTransaction.get(i);
	      //traversing through each value present in a single transaction
	      for (int j = 0; j < temp_items.length; j++) {
	        Integer data = new Integer(temp_items[j]);
	        //adding the data to the items arraylist
            items.add(data);
	      }
	    }
	    
	    //traversing through each items
	    for (int x = 0; x < items.size(); x++) {
	      //creating temp from the items arraylist that to be inserted into ret arraylist
	      int[] temp = {items.get(x)};
	      // adding into ret arraylist by providing values into Itemlist constructor
	      ret.add(new ItemList(1, temp, countAppearance(mTransaction, temp)));
	    }
	    return ret;
	  }
	  
	  /*
	   * creating list of candidates with the frequency more than the minimum support
	  */
	  private ArrayList<ItemList> generateCandidateFromList(ArrayList<ItemList> list) {
	    ArrayList<ItemList> candidate = new ArrayList<ItemList>();
	    for (int i = 0; i < list.size(); i++) {
	      if (list.get(i).getSupport() >= mMinSup) {
	        if (!list.get(i).isAlreadyExist(candidate)) {
	          candidate.add(list.get(i));
	        }
	      }
	    }
	    return candidate;
	  }
	  
	  /*
	   * creating candidates from previously left candidate
	   * Candidates which were left after the passing the minimum support criteria
	   */
	  
	  private ArrayList<ItemList> generateNextListFromCandidate(ArrayList<ItemList> candidate) {
	    ArrayList<ItemList> list = new ArrayList<ItemList>();
	    for (int i = 0; i < candidate.size(); i++) {
	      for (int j = i; j < candidate.size(); j++) {
	        System.out.println("generateNextListFromCandidate");
	        printItemList(candidate);
	        
	        if (distance(candidate.get(i), candidate.get(j)) == 1) {
	          System.out.println("");
	          int[] items = pickItems(candidate.get(i), candidate.get(j));
	          ItemList temp = new ItemList(candidate.get(0).getCount() + 1, items, countAppearance(mTransaction, items));
	          list.add(temp);
	        }
	      }
	    }
	    return list;
	  }
	  /*
	   * forming the pair or triplets from single candidates or paired candidates
	   */
	  private int distance(ItemList one, ItemList another) {
	    int ret = one.getCount();
	    for (int i = 0; i < one.getCount(); i++) {
	      for (int j = 0; j < another.getCount(); j++) {
	        if (one.getItem(i) == another.getItem(j)) {
	          ret--;
	        }
	      }
	    }
	    return ret;
	  }
	  
	  /*
	   * picking one and returning the array
	   */
	  private int[] pickItems(ItemList one, ItemList another) {
	    int[] ret = new int[one.getCount() + 1];
	    int i = 0;
	    int j = 0;
	    int index = 0;
	    System.out.println("pickItems");
	    while((i < one.getCount()) || (j < another.getCount())) {
	      if (one.getCount() == i) {
	        ret[index++] = another.getItem(j);
	        j++;
	      } else if (another.getCount() == j) {
	        ret[index++] = one.getItem(i);
	        i++;
	      } else if (one.getItem(i) < another.getItem(j)) {
	        ret[index++] = one.getItem(i);
	        i++;
	      } else if (one.getItem(i) > another.getItem(j)) {
	        ret[index++] = another.getItem(j);
	        j++;
	      } else {
	        ret[index++] = one.getItem(i);
	        i++;
	        j++;
	      }
	    }
	    return ret;
	  }
	  
	  //to print the Arraylist of itemlist type
	  private void printItemList(ArrayList<ItemList> list) {
	    for (int i = 0; i < list.size(); i++) {
	      int[] items = list.get(i).getItems();
	      System.out.print("ID : " + i + " - Items : ");
	      for (int j = 0; j < items.length; j++) {
	        System.out.print(items[j] + ", ");
	      }
	      System.out.println("Frequency : " + list.get(i).getSupport());
	    }
	  }

	}