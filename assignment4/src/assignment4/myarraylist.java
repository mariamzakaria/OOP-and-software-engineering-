package assignment4;


import java.util.Arrays;

import java.util.Scanner;


public class myarraylist {
	
	
//////////////my arraylist	
public static class Myarraylist<type> {
		 private int size=0;
		 private int defaultsize=10;
		 private  Object[] myarray;
		 
	public Myarraylist() {
		    myarray = new Object[defaultsize];
		    }
	public void add(type element) {
	   if (size == myarray.length) {
	   	expansion();
	   }
	   myarray[size++] = element;
	}
	private void expansion() {
	   int newSize = myarray.length * 2;
	   myarray = Arrays.copyOf(myarray, newSize);
	}
	public type get(int i) {
	   if (i>= size || i <0) {
	       throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
	   }
	   return (type) myarray[i];
	}
	public void remove(int i) {
		   if (myarray==null) {
		       throw new IndexOutOfBoundsException("arraylist is empty" );
		   }
		   else {//myarray[i]=0;
			 //  n=myarray.length-i
			   for(int j=i+1;j<myarray.length;j++) {
				   myarray[j-1]=myarray[j];
			   }
		
			   myarray = Arrays.copyOf( myarray,  myarray.length-1 );
		   }
		}
	public int size() {
		return myarray.length;
	} 
		
	}
///////////////////////////////////////////////////////////////////////////////////////
////FindRebetedElement function
public static Myarraylist FindRebetedElement (Myarraylist<Integer> arr ) {
	Myarraylist<Integer> arrlist = new  Myarraylist<Integer>();
	if (arr==null ) {return null;}
	for(int i=0;i<arr.size;i++) {
		for(int j=i+1;j<arr.size;j++) {
			if(arr.get(i)==arr.get(j)) {
				//System.out.println(arr[i]+" "+"is Repeated");
				arrlist.add(arr.get(i));
			}
			
		}
	}
	return arrlist;
}
			
///////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    System.out.println("enter number of elements");
	    int n=in.nextInt();
		 Myarraylist<Integer> arrlist = new  Myarraylist<Integer>();
		 System.out.println("enter elements"); 
    	 for (int i=1; i<=n; i++) 
             arrlist.add(in.nextInt());
    	 arrlist=FindRebetedElement (arrlist);
    	 System.out.println("rebeted elements:");
    	
    	 for (int h=0;h<arrlist.size;h++) {
    		    System.out.println(arrlist.get(h));
    		}
    	 
	     }}







