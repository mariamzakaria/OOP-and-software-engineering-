package finalassignment;

public class SoldOutException extends RuntimeException {
	private String message;
	
	public SoldOutException() {
		// TODO Auto-generated constructor stub
		//System.out.println("Sold Out");
		
		 this.message = "Sold Out, Please buy another item";
	}
	
	@Override
    public String getMessage(){
        return this.message;
    }

}
