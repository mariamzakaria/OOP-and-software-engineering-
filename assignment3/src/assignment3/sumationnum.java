package assignment3;

import java.util.HashSet;
import java.util.Scanner;

public class sumationnum {
	
	
	public static void Get (int arr[][],int l,int t,int n) {
		
			if (arr==null ) {return;}
		HashSet<Integer> h = new HashSet<Integer>();
		
		HashMap<Integer,int[]> map = new Hashmap<Integer,int[n]>();
		
		for(int p=0;p<t;p++) {
			int results=0;
			for(int j=0;j<n;j++) {
			h.add(arr[p][j]);}
		 
		for(int i=0;i<n;i++) {
			
			int subtract3=l-arr[p][i];
	
			if(h.contains(subtract3)) {
				results =1; 
				System.out.println(arr[p][i]+" "+subtract3);
				 break;}
			}	if (results==0) 
			{ System.out.println("!ok");}
			
	}}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner in = new Scanner(System.in);
				
				 int t=in.nextInt();
				 
				for (int i=0;i<t;i++) {
					
					 int h=in.nextInt();
					 int n=in.nextInt();
					 //int[] array = new int[n];
					 int[][] arrays=new int[t][n];
				for (int m=0;m<n;m++) {
					arrays[i][m] = in.nextInt();
					System.out.print(arrays[i][m].len);
				}}
				//Get (arrays,h,t,n);	
				
				
					
				
					
			}
		



	}


