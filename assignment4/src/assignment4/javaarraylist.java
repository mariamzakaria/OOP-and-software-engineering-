package assignment4;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*; 
import java.util.*; 

public class javaarraylist {

	
	
	public static ArrayList<Integer> FindRebetedElementSorted (ArrayList<Integer> arr) {
 ArrayList<Integer> array = new ArrayList<Integer>();
		if (arr==null ) {return null;}
			//throw new RuntimeException("no elements");}
		
		Collections.sort(arr); 
		for(int k=1;k<arr.size();k++) {
			if(arr.get(k-1)==arr.get(k)) {
				//System.out.println(arr[k]+" "+"is Repeated");
				  array.add(arr.get(k));
			}	
		}
		return array;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    System.out.println("enter number of elements");
	    int n=in.nextInt();
	    ArrayList<Integer> array = new ArrayList<Integer>();
	    System.out.println("enter elements"); 
	    	 for (int i=1; i<=n; i++) 
	             array.add(in.nextInt());
	    	 in.close();
	    	 System.out.println("rebeted elements:");
	    	 System.out.println(FindRebetedElementSorted (array));
	    
		 
	}

}
