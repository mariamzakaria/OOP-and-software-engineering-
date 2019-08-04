package finalassignment;

public enum Coin {
	PENNY("PENNY",1), NICKLE("NICKLE",5), DIME("DIME",10), QUARTER("QUARTER",25)
	,HALFDOLLAR("HALFDOLLAR",50),DOLLAR("DOLLAR",100),TWODOLLARS("TWODOLLARS",200);
	
	private int denomination; 
	private String name;
	
	private Coin(String name,int denomination){
		this.denomination = denomination; 
		this.name=name;
		} 
	
	
	public int getDenomination(){
		return denomination; 
		}
	public String getName(){
		return this.name; 
		}

	
}
