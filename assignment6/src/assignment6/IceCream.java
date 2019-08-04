package assignment6;

public class IceCream extends DessertItem {
	//String Flavor;
	int Price;
	public IceCream(String Flavor,int Price) {
		// TODO Auto-generated constructor stub
		super(Flavor);
		//this.Flavor=Flavor;
		this.Price=Price;
		
	}
//	public IceCream(String catigory) {
//		// TODO Auto-generated constructor stub
//		super(catigory);
//		
//		
//	}
	public  int getCost() {
		
		
		 return this.Price;
	}
	 public  void print() {
		 System.out.println("IceCream: "+this.getName()+"/"+this.Price+" cents/ "+DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }

}
