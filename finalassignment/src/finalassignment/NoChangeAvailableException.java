package finalassignment;

public class NoChangeAvailableException extends RuntimeException  {
	private String message;
	   
	public NoChangeAvailableException() {
		// TODO Auto-generated constructor stub
		//System.out.println("No Change Available");
		this.message = "Not Sufficient change in Inventory";
	}
	@Override
    public String getMessage(){
        return message;
    }
}
