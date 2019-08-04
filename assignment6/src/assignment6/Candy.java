package assignment6;



public class Candy extends DessertItem {
	//String Flavor;
	 private double Weight;
	private int PricePerPound;
	

	public Candy(String Flavor,double Weight,int PricePerPound ) {
		// TODO Auto-generated constructor stub
		super(Flavor);
		//this.Flavor=Flavor;
		this.Weight=Weight;
		this.PricePerPound=PricePerPound;
	}
	
	public  int getCost() {
		int  cost =(int) (this.Weight*this.PricePerPound);
		return cost;
	}
	 public  void print() {
		 System.out.println("candy:"+" "+this.getName()+"/ "+this.Weight+" lbs"+"/ "+this.PricePerPound+" /lb."+" /"+DessertShoppe.cents2dollarsAndCents(this.getCost()));
	 }

}
