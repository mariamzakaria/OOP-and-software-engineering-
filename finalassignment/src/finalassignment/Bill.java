package finalassignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Bill {
    private String  buyingTime;
    
   ArrayList<Item> checkout =new ArrayList<Item>();
	public Bill() {
		// TODO Auto-generated constructor stub
		this.buyingTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	}
	public void transaction(ArrayList<Item> item) {
		this.checkout=item;
	}
	public int numberOfItems() {
		return this.checkout.size();
	}
	
	  
	public void printBill(long price,long paid,HashMap<Coin,Integer> change) {
		
		System.out.println( "Time of purchase"+this.buyingTime);
		System.out.println( "Number of purchased items"+this.numberOfItems());
		System.out.println( "............................................................................................");
		for(int i=0;i<this.checkout.size();i++) {
		System.out.println( this.checkout.get(i).getName()+ "......................"+this.checkout.get(i).getPrice());
		}
		System.out.println( ".");
		System.out.println( ".");
		System.out.println( ".");
		System.out.println( "............................................................................................");
		System.out.println( "Total price: ............"+ price);
		System.out.println( "Paid: ............"+ paid);
		
		for(Coin c : change.keySet()){ 
		System.out.print( "Change: ............"+change.get(c)+c.getName()+"      ");
		}
		
	}
	
	
	
	
	
}
