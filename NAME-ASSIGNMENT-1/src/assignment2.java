import java.util.Arrays;
	import java.util.Scanner;
	import java.util.*;


public class assignment2 {

		
		//n^2
	public static void Getfruits1 (int arr[],int k) {
			if (arr==null ) {return;}
			for(int i=0;i<arr.length;i++) {
			int	subtract1=k-arr[i];
				for(int j=i+1;j<arr.length;j++) {
					if(subtract1==arr[j]) {
						System.out.println("put"+" "+arr[i]+"k"+" "+"and"+" "+subtract1+"k"+" "+"pieces");
					}
					
				}
			}
		}
	//nlogn
	public static void Getfruits2 (int arr[],int l) {
		if (arr==null ) {return;}
		Arrays.sort(arr);
		int i=0; int j=0;
		int[]subtract2 = new int[arr.length];
		for(int p=0;p<arr.length;p++) {
		 subtract2[p]=l-arr[p];}
		Arrays.sort(subtract2);
		while(i<subtract2.length && j<arr.length) {
			if(subtract2[i]<arr[j]) {i++;}
			else if (subtract2[i]>arr[j]) {j++;}
			else {
			int	a=l-subtract2[i];
				System.out.println("put"+" "+a+"k"+" "+"and"+" "+subtract2[i]+"k"+" "+"pieces");
				i++;j++;
			}	}
		}
	
	//n
	public static void Getfruits3 (int arr[],int l) {
		if (arr==null ) {return;}
		HashSet<Integer> h = new HashSet<Integer>(); 
		//int[]subtract3 = new int[arr.length];
		for(int p=0;p<arr.length;p++) {
		 h.add(arr[p]);}
		for(int i=0;i<arr.length;i++) {
			int subtract3=l-arr[i];
			if(h.contains(subtract3)) {
				System.out.println("put"+" "+arr[i]+"k"+" "+"and"+" "+subtract3+"k"+" "+"pieces");
				//h.remove(subtract3);
			}	}
		}
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		    System.out.println("enter number of elements");
		    int n=in.nextInt();
			int[] array = new int[n];//{ 1,2,3,4,9,6,3,8,9,6 }; 
			System.out.println("enter elements");
			for (int m=0;m<n;m++) {
				array[m] = in.nextInt();
			}
			System.out.println("How many kilos you want");
			 int k=in.nextInt();
			 System.out.println("without sort (n^2):");
			 Getfruits1 (array,k);
			// TODO Auto-generated method stub
			 System.out.println("with sort (nlogn):");
			Getfruits2 (array,k);	
			
			 System.out.println("with hash (n):");
				Getfruits3 (array,k);	
		}
	


}
