package finalassignment;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private Map<Object, Integer> inventory = new HashMap<Object, Integer>();
	
	public int getQuantity(Object item){ 
		Integer value = inventory.get(item); 
		return value ;//== null? 0 : value ; 
		}
	
	public void add(Object item){
		int count = inventory.get(item); inventory.put(item, count+1);
		}
	
	public void deduct(Object item) { 
		if (hasItem(item)) {
			int count = inventory.get(item);
			inventory.put(item, count - 1); }
		}
	public boolean hasItem(Object item){
		return getQuantity(item) > 0;
		}
	
	public void clear(){
		inventory.clear();
		} 
	public void put(Object item, int quantity) {
		inventory.put(item, quantity); 
		}

	

}
