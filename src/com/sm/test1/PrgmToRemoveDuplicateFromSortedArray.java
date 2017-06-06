package com.sm.test1;

public class PrgmToRemoveDuplicateFromSortedArray {
	
/*
 * input: 2,3,6,6,8,9,10,10,10,12,12
 * output: 2 3 6 8 9 10 12 
 */
	public void removeDuplicate(int inputArray[]){
		int[] finalArray = new int[10]; 
		for(int start=0; inputArray.length<0;start++){
			for(int start1=start+1; inputArray.length<0;start++){
				if(inputArray[start] == inputArray[start1]){
					start++;
				}
			}
					finalArray[start]= inputArray[start];
		}
		for(int i=0;finalArray.length>=0;i++){
			
			System.out.println("llllllllllllllll"+finalArray[i]);
		}
	}
	
public static void main(String[] args) {
	PrgmToRemoveDuplicateFromSortedArray obj = new PrgmToRemoveDuplicateFromSortedArray();
	int[] input = new int[] {2,3,6,6,8,9,10,10,10,12,12};
	obj.removeDuplicate(input);
	
}

}
