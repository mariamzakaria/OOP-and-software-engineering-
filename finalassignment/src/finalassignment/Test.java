package finalassignment;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VendingMachine v=new VendingMachine();
		Bill b;
		
		ArrayList<Item>  a=new ArrayList<Item>();
		a.add(Item.CANDY);
		a.add(Item.CANDY);
		a.add(Item.COKE);
		
		
		v.selectItemAndGetPrice(a);
		
		
	ArrayList<Coin>  c=new ArrayList<Coin>();
	c.add(Coin.DIME);
	c.add(Coin.TWODOLLARS);
	c.add(Coin.DOLLAR);
	
	v.insertCoin(c);
	//v.getTotalPrice();
	 
	 b=new Bill();
	 b.transaction(v.collectItem());
    b.printBill(v.getTotalPrice(), v.getCurrentBalance(), v.collectChange());
	
	
	
	
	
	
		
		
		

	}

}
