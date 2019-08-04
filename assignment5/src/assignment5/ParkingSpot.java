package assignment5;

public abstract class ParkingSpot {
	
		  private final String spotCode;
		  private boolean free;
		  private Vehicle vehicle;
		  private final vehicaleType type;

		  public boolean IsFree() {
			  return free;
		  }

		  public ParkingSpot(vehicaleType type,String spotcode) {
		    this.type = type;
		    spotCode=spotcode;
		  }

		  public void assignVehicle(Vehicle vehicle) {
		    this.vehicle = vehicle;
		    free = false;
		  }

		  public void removeVehicle() {
		    this.vehicle = null;
		    free = true;
		  }
		  public String getSpotcode() {
			  return spotCode;
		  }
		  
		 
		  
		 

		}

		

		

