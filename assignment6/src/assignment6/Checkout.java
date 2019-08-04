package assignment6;

import java.util.ArrayList;

public class Checkout {
	///////////////////////////CheckoutBuilder
//	public static class CheckoutBuilder {
//		private ArrayList <DessertItem> cashRegister=new ArrayList <DessertItem>() ;
//		public CheckoutBuilder() {
//			// TODO Auto-generated constructor stub
//		}
//		public CheckoutBuilder enterItem (DessertItem item) {
//			 cashRegister.add(item);
//			 return this;
//		}
//		 public Checkout build(){
//			 Checkout checkout = new  Checkout();
//			 checkout.cashRegister = this.cashRegister;
//			 return checkout;
//		 }
//
//	}
	//////////////////////CheckoutBuilder
	private ArrayList <DessertItem> cashRegister=new ArrayList <DessertItem>() ;
	public Checkout() {
		// TODO Auto-generated constructor stub
	}
public ArrayList getCashRegister() {
	
//	for(int i=0;i<cashRegister.size();i++) {
//	cashRegister(i)=cashRegister(i).getName();
//	}
	return cashRegister;
}
public void enterItem(DessertItem item) {
	 cashRegister.add(item);
}
public int numberOfItems() {
	return cashRegister.size();
}
public int totalCost() {
	int cost=0;
	for (int i=0; i<cashRegister.size();i++) {
		cost+=(cashRegister.get(i).getCost());
	}
	return cost;
}
public int totalTax() {
	int tax=0;
	for (int i=0; i<cashRegister.size();i++) {
		tax+=(cashRegister.get(i).getCost()*0.02);
	}
	return tax;
}
public void clear() {
	cashRegister.clear();
}
public  void print() {
	for (int i=0; i<cashRegister.size();i++) {
		cashRegister.get(i).print();
	}
}
}
