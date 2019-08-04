import java.util.Arrays;
	import java.util.Scanner;


public class assignment1 {

		
		//n^2
	public static void FindRebetedElement (int arr[]) {
			if (arr==null ) {return;}
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]+" "+"is Repeated");
					}
					
				}
			}
		}
	//nlogn
	public static void FindRebetedElementSorted (int arr[]) {
		if (arr==null ) {return;}
		Arrays.sort(arr);
		for(int k=1;k<arr.length;k++) {
			if(arr[k-1]==arr[k]) {
				System.out.println(arr[k]+" "+"is Repeated");
			}	
		}
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
			 System.out.println("without sort (n^2):");
			 FindRebetedElement (array);
			// TODO Auto-generated method stub
			 System.out.println("with sort (nlogn):");
			 FindRebetedElementSorted (array);	
			
		}
	


}
