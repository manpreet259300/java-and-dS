import java.io.*;
import java.util.*;

public class AprioriAlgorithm extends Observable {

    public static void main(String[] args) throws Exception {
    	AprioriAlgorithm ap = new AprioriAlgorithm(args);
    }

    private List<int[]> itemsets ;
    private String transactionFile; 
    private int numberOfItems=0; 
    private int totalNoOfTransactions=0; 
    private double minimumSupp =0.3; 

    public  AprioriAlgorithm(String[] args) throws Exception
    {
      // Handling the input file
        if (args.length!=0) {
        	transactionFile = args[0];
        }
    	BufferedReader data_in = new BufferedReader(new FileReader(transactionFile));
    	while (data_in.ready()) {    		
    		String line=data_in.readLine();
    		
    		if (line.matches("\\s+")) {
    			continue;
    		}
    		
    		totalNoOfTransactions++;
    		
    		StringTokenizer stringTokenizer = new StringTokenizer(line," ");
    		while (stringTokenizer.hasMoreTokens()) {
    			int x = Integer.parseInt(stringTokenizer.nextToken());
    			if (x+1>numberOfItems) numberOfItems=x+1;
    		}    		
    	}  
    	
    	// CLosing the buffer
    	data_in.close();
    	
    	// generating candidates and counting frequent itemsets of each candidate
        go();
    }
    

    private void go() throws Exception {
        //creatinh itemset of size 1 as show in example in pdf -1,2,3,4,5 etc.. 
        createItemsetsOfSize1();        
        
        //itemset 1 is created with size 1
        int itemsetNumber=1; 
        int nbFrequentSets=0;
        
        while (itemsets.size()>0)
        {
        	//calculate the frequency of the itemsets(candidates) which we have generated
            calculateFrequentItemsets();

            if(itemsets.size()!=0)
            {
                nbFrequentSets+=itemsets.size();
                System.out.println("frequent itemsets of size " +itemsetNumber+" are " +itemsets.size()); 
                createNewItemsetsFromPreviousOnes();
            }

            itemsetNumber++;
        } 

        //display total no of frequent sets
        System.out.println("total no of frequent sets" + nbFrequentSets);
    }

	private void createItemsetsOfSize1() {
		itemsets = new ArrayList<int[]>();
        for(int i=0; i<numberOfItems; i++)
        {
        	int[] candidates = {i};
        	itemsets.add(candidates);
        }
	}
			
    private void createNewItemsetsFromPreviousOnes()
    {
    	int currentSizeOfItemsets = itemsets.get(0).length;
   		HashMap<String, int[]> tempCandidates = new HashMap<String, int[]>(); 
    	for(int i=0; i<itemsets.size(); i++)
        {
            for(int j=i+1; j<itemsets.size(); j++)
            {
                int[] X = itemsets.get(i);
                int[] Y = itemsets.get(j);
                int [] newCandidates = new int[currentSizeOfItemsets+1];
                for(int s=0; s<newCandidates.length-1; s++) {
                	newCandidates[s] = X[s];
                }
                    
                int ndifferent = 0;
                // then we find the missing value
                for(int s1=0; s1<Y.length; s1++)
                {
                	boolean found = false;
                	// is Y[s1] in X?
                    for(int s2=0; s2<X.length; s2++) {
                    	if (X[s2]==Y[s1]) { 
                    		found = true;
                    		break;
                    	}
                	}
                	if (!found){ // Y[s1] is not in X
                		ndifferent++;
                		// we put the missing value at the end of newCandidates
                		newCandidates[newCandidates.length -1] = Y[s1];
                	}
            	
            	}
                if (ndifferent==1) {
                    Arrays.sort(newCandidates);
                	tempCandidates.put(Arrays.toString(newCandidates),newCandidates);
                }
            }
        }
        itemsets = new ArrayList<int[]>(tempCandidates.values());
    }



    
    private void line2booleanArray(String line, boolean[] trans) {
	    Arrays.fill(trans, false);
	    StringTokenizer stFile = new StringTokenizer(line, " ");
	    while (stFile.hasMoreTokens())
	    {
	    	
	        int parsedVal = Integer.parseInt(stFile.nextToken());
			trans[parsedVal]=true;
	    }
    }

   
    private void calculateFrequentItemsets() throws Exception
    {
    	List<int[]> frequentCandidates = new ArrayList<int[]>();        
        int count[] = new int[itemsets.size()];
        boolean match;
        boolean[] trans = new boolean[numberOfItems];
        //reading file again to check for the candidate match
        BufferedReader data_in = new BufferedReader(new InputStreamReader(new FileInputStream(transactionFile)));
		 
        //traversing through each transaction for finding the smatch for the candidate 
		for (int i = 0; i < totalNoOfTransactions; i++) {

			String line = data_in.readLine();
			//passing all the items of a single transaction to find the match with candidate 
			line2booleanArray(line, trans);
			
			//increasing the count of the frequency of the candidate according to the match found inside the transaction file
			for (int c = 0; c < itemsets.size(); c++) {
				match = true; 
				int[] cand = itemsets.get(c);
				for (int x : cand) {
					if (trans[x] == false) {
						match = false;
						break;
					}
				}
				if (match) {
					count[c]++;
				}
			}
		}
		
		data_in.close();
		
		
		//checking if the data is passing the minimum support parameter or not
		for (int i = 0; i < itemsets.size(); i++) {
			if ((count[i] / (double) (totalNoOfTransactions)) >= minimumSupp) {
				frequentCandidates.add(itemsets.get(i));
			}
		}

        itemsets = frequentCandidates;
    }
}
