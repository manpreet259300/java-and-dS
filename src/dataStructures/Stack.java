package dataStructures;

import java.util.Arrays;

public class Stack {
	
	private String[] StackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	void TheStack(int size) {
		
		stackSize = size;
		
		StackArray = new String[size];
		
		Arrays.fill(StackArray, "-1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
