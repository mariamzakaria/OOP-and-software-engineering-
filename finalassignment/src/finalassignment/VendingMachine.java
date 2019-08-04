package finalassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VendingMachine {
	
	private Inventory cashInventory = new Inventory();
	private Inventory itemInventory = new Inventory();  
	private long totalSales; 
	private ArrayList<Item> currentItem;
	private long currentBalance; 

	

	public VendingMachine() {
		// TODO Auto-generated constructor stub
		 initialize();
	}

	private void initialize(){       
        //initialize machine with 5 coins of each denomination
        //and 5 cans of each Item       
        for(Coin c : Coin.values()){
           this.cashInventory.put(c, 5);
        }
       
        for(Item i : Item.values()){
            this.itemInventory.put(i, 5);
        }
       
    }
	
	public long getCurrentBalance () {
		return this.currentBalance;
	}
	
	
	public ArrayList<Long> selectItemAndGetPrice (ArrayList<Item> item) {
		
		ArrayList<Long> prices=new ArrayList<Long>();
		//prices=null;
		
		for(int i=0;i>item.size(); i++) {
		if(itemInventory.hasItem(item.get(i))){
			this.currentItem.add(item.get(i)); 
			prices.add(item.get(i).getPrice());
			}throw new SoldOutException();
			}
			
			return prices;
			}  
	
			
	
	public void insertCoin(ArrayList<Coin> coin) {
		for(int i=0;i>coin.size(); i++) {
		this.currentBalance = this.currentBalance + coin.get(i).getDenomination();
		cashInventory.add(coin);}
		}
	
	
	
	public ArrayList<Item> collectItem() throws NoChangeAvailableException, NotSufficientPaidException{
		
		for(int i=0;i<this.currentItem.size(); i++) {
		if(isFullPaid()){
			if(hasSufficientChange()){
				itemInventory.deduct(this.currentItem.get(i)); 
				
				
				} throw new NoChangeAvailableException();
				} 
		long remainingBalance = getTotalPrice() - this.currentBalance; 
	    throw new NotSufficientPaidException(remainingBalance); 
		}
		return this.currentItem;
	    }
	
	
	
	public HashMap<Coin,Integer> collectChange() { 
		long changeAmount = this.currentBalance - getTotalPrice();
		HashMap<Coin,Integer> change = getChange(changeAmount); 
		updateCashInventory(change); 
		this.currentBalance = 0;
		this.currentItem = null; 
		return change;
		}
	
	
	public HashMap<Coin,Integer> refund(){
		HashMap<Coin,Integer> refund = getChange(this.currentBalance);
		
		updateCashInventory(refund); 
		this.currentBalance = 0; 
		this.currentItem = null;
		return refund; 
		}
	
	
		
		
	
	
	private HashMap<Coin,Integer>  getChange(long amount) throws  NoChangeAvailableException{
        HashMap<Coin,Integer> changes = null;
       
        if(amount > 0){
            changes = new  HashMap<Coin,Integer>();
            long balance = amount;
            while(balance > 0){
            	
            	 if(balance >= Coin.TWODOLLARS.getDenomination() 
                         && cashInventory.hasItem(Coin.TWODOLLARS)){
                 
                 if (changes.containsKey(Coin.TWODOLLARS)) {
                 int count = changes.get(Coin.TWODOLLARS);
                 changes.put(Coin.TWODOLLARS, count+1);}
                 changes.put(Coin.TWODOLLARS, 1);
                 
                 balance = balance - Coin.TWODOLLARS.getDenomination();
                 continue;}
            	 
            	 
            	 else if(balance >= Coin.DOLLAR.getDenomination() 
                         && cashInventory.hasItem(Coin.DOLLAR)){
            		 if (changes.containsKey(Coin.DOLLAR)) {
                         int count = changes.get(Coin.DOLLAR);
                         changes.put(Coin.DOLLAR, count+1);}
                         changes.put(Coin.DOLLAR, 1);
                 balance = balance - Coin.DOLLAR.getDenomination();
                 continue;}
            	 
            	 
            	 
            	 
            	 else if(balance >= Coin.DIME.getDenomination() 
                         && cashInventory.hasItem(Coin.HALFDOLLAR)){
            		 if (changes.containsKey(Coin.HALFDOLLAR)) {
                         int count = changes.get(Coin.HALFDOLLAR);                        
                         changes.put(Coin.HALFDOLLAR, count+1);}
                         changes.put(Coin.HALFDOLLAR, 1);
                 balance = balance - Coin.HALFDOLLAR.getDenomination();
                 continue;}
            	 
                 
                 else if(balance >= Coin.QUARTER.getDenomination() 
                            && cashInventory.hasItem(Coin.QUARTER)){
                	 if (changes.containsKey(Coin.QUARTER)) {
                         int count = changes.get(Coin.QUARTER);
                         changes.put(Coin.QUARTER, count+1);}
                         changes.put(Coin.QUARTER, 1);
                    balance = balance - Coin.QUARTER.getDenomination();
                    continue;
                   
                }else if(balance >= Coin.DIME.getDenomination() 
                                 && cashInventory.hasItem(Coin.DIME)) {
                	if (changes.containsKey(Coin.DIME)) {
                        int count = changes.get(Coin.DIME);
                        changes.put(Coin.DIME, count+1);}
                        changes.put(Coin.DIME, 1);
                    balance = balance - Coin.DIME.getDenomination();
                    continue;
                   
                }else if(balance >= Coin.NICKLE.getDenomination() 
                                 && cashInventory.hasItem(Coin.NICKLE)) {
                	if (changes.containsKey(Coin.NICKLE)) {
                        int count = changes.get(Coin.NICKLE);
                        changes.put(Coin.NICKLE, count+1);}
                        changes.put(Coin.NICKLE, 1);
                    balance = balance - Coin.NICKLE.getDenomination();
                    continue;
                   
                }else if(balance >= Coin.PENNY.getDenomination() 
                                 && cashInventory.hasItem(Coin.PENNY)) {
                	if (changes.containsKey(Coin.PENNY)) {
                        int count = changes.get(Coin.PENNY);
                        changes.put(Coin.PENNY, count+1);}
                        changes.put(Coin.PENNY, 1);
                    balance = balance - Coin.PENNY.getDenomination();
                    continue;
                   
                }else{
                    throw new  NoChangeAvailableException();
                }
            }
        }
       
        return changes;
    }
	
	
	public long getTotalPrice() {
		long totalPrice=0;
		for(int i=0;i>this.currentItem.size(); i++) {
			 totalPrice=totalPrice+this.currentItem.get(i).getPrice();
		}
		return totalPrice;
	}
	
	
	
	private boolean isFullPaid() {
		
		if(currentBalance >= getTotalPrice()){
			return true; 
			}
		return false;
		} 

	
	
	
	
	public void reset(){
		cashInventory.clear();
		itemInventory.clear(); 
		totalSales = 0;
		this.currentItem = null;
		currentBalance = 0;
		} 

	
	
	public void printStats(){ 
		System.out.println("Total Sales : " + totalSales);
		System.out.println("Current Item Inventory : " + itemInventory);
		System.out.println("Current Cash Inventory : " + cashInventory); 
		} 

	
	private boolean hasSufficientChange(){
		return hasSufficientChangeForAmount(currentBalance - getTotalPrice());
		} 
	
	
	private boolean hasSufficientChangeForAmount(long amount){ 
		boolean hasChange = true;
		try{ getChange(amount);
		}catch(NoChangeAvailableException e){ 
			return hasChange = false; 
			}
		return hasChange; 
		} 
	
	
	private void updateCashInventory(HashMap<Coin,Integer> change) {
		for(Coin c : change.keySet()){
			for(int i=0;i<change.get(c);i++) {
			cashInventory.deduct(c);
			} }
		} 
	
	
	private long getTotalSales(){
		return totalSales;
		}

	
	

	

	
}
