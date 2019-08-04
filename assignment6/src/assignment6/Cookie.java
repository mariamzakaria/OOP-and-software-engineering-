package assignment6;

public class Cookie extends DessertItem {
	int Number;
	int  PricePerDozen;
	public Cookie(String Flavor ,int Number,int  PricePerDozen) {
		// TODO Auto-generated constructor stub
		super(Flavor);
		this.Number=Number;
		this.PricePerDozen=PricePerDozen;
	}
	public  int getCost() {
	//double ratio =(this.Number/12);
		//ratio*=this.PricePerDozen;
		 int cost =  (int) ((this.Number*this.PricePerDozen)/12);
		 return cost;
	}
	 public  void print() {
		 System.out.println("cookies: "+this.getName()+"/"+this.Number+" cookies/ "+this.PricePerDozen+" cents /dz. /"+" "+DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }
}
