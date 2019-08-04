package assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class assignment3 {
	
	
	public static void int2str (int num) {
	int	n=getlength(num);
		//int n=50;
	char str[]= new char[n];
		
		for(int i=0;i<n;i++) {
			int num1=num%10+48;
			num=num/10;
			switch(num1) {
			   case 48 :
			     str[i]='0';
			      break; 
			   
			   case 49 :
			       str[i]='1';
			      break; 
			case 50 :
			       str[i]='2';
			      break; 
			case 51 :
			       str[i]='3';
			      break; 
			case 52 :
			       str[i]='4';
			      break; 
			case 53 :
			       str[i]='5';
			      break; 
			case 54 :
			       str[i]='6';
			      break; 
			   case 55 :
			       str[i]='7';
			      break; 
			case 56 :
			       str[i]='8';
			      break; 
			default : 
			       str[i]='9';
			}}
for(int t=0;t<n/2;t++) {
			char c=str[t];
			str[t]=str[n-t-1];
			str[n-t-1]=c;
		
		}
		System.out.println(str);
		// System.out.println(str.getClass().getSimpleName());
	} 
	public static int getlength(int num){
		int length=0;
	    while((num/10)!= 0) { length=length+1;num=num/10;}
	    return length+1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    System.out.println("enter number");
	    int num=in.nextInt();
	    in.close(); in.close();
	    int2str(num);
	 
	    //System.out.println( getlength(num));
	   
	}

}
