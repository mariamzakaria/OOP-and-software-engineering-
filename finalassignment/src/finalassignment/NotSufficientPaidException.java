package finalassignment;

public class NotSufficientPaidException extends RuntimeException {

	private String message;
    private long remaining;
    
	public NotSufficientPaidException(long remaining) {
		// TODO Auto-generated constructor stub
		
	//System.out.print("Not Sufficient Paid");
		 this.message = "Price not full paid, remaining :";
	        this.remaining = remaining;
	}
	
	 public long getRemaining(){
	        return remaining;
	    }
	 
	 public String getMessage(){
		 return this.message + this.remaining; 
		 } 

	

}
