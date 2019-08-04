package assignment5;

public abstract class Vehicle{
	
	  private String licenseNumber;
	  private final vehicaleType type;
	  private Ticket ticket;

public Vehicle(vehicaleType type) {
	    this.type = type;
	  }

public void assignTicket(Ticket ticket) {
	    this.ticket = ticket;
	  }

public vehicaleType getType() {
	 return type;
}
	  
	 
	}

	


	