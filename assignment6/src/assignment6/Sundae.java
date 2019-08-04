package assignment6;

public class Sundae extends IceCream{
	String ToppingFlavor;
	int ToppingPrice;
	public Sundae(String IceCreamFlavor,int IceCreamPrice,String ToppingFlavor ,int ToppingPrice) {
		// TODO Auto-generated constructor stub
		super(IceCreamFlavor,IceCreamPrice);
		this.ToppingFlavor=ToppingFlavor;
		this.ToppingPrice=ToppingPrice;
		
	}
	public  int getCost() {
		int cost =this.ToppingPrice;
		 
		 return super.getCost()+cost;
	}
	 public  void print() {
		
		 System.out.println("ice cream: "+super.getName()+"/"+super.Price+" cents/ "+"topping: "+this.ToppingFlavor+"/ "+this.ToppingPrice+" cents/ "+""+DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }
}
