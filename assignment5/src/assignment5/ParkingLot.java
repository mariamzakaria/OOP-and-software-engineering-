package assignment5;

import java.util.Scanner;

public class ParkingLot {

	public ParkingLot() {
		
	}
	
	
	  
		  private int compactSlotCount;
		  private int regularSlotCount;
		  private final int maxCompactCount=2;
		  private final int maxRegularCount=2;
		  

		  

		  
		  //private HashMap<String, Ticket> activeTickets;

		
		  public void getNewParkingTicket(Vehicle vehicle) throws IllegalAccessException  {
		    
		    if(this.isFull(vehicle.getType())) {
		     System.out.print("is full");
		     throw new IllegalAccessException("is full"); }
		     
		   Ticket ticket = new Ticket();
		    vehicle.assignTicket(ticket);
		 ParkingSpot spot ;//= new ParkingSpot(vehicle.getType()); 
		    // if the ticket is successfully saved in the database, we can increment the parking slot count
		  spot= this.incrementSlotCount(vehicle.getType() );
		   // this.activeTickets.put(ticket.getTicketNumber(), ticket);
		    //return ticket;
		  spot.assignVehicle(vehicle);
		    System.out.println("start time is :"+ticket.getStartTime());
		    System.out.println("slot number is:"+spot.getSpotcode());
		    System.out.println("ticket number is:"+ticket.getTicketNumber());
		    
		  }

		  public boolean isFull(vehicaleType type) {
		    // trucks and vans can only be parked in LargeSlot
		    if(type == vehicaleType.compact ) {
		      return (compactSlotCount+regularSlotCount) >=(maxCompactCount+maxRegularCount);
		    }

		    // moterbikes can only be parked at motorbike slots
		    //if(type == vehicaleType.regular) {
		      return regularSlotCount>= maxRegularCount;
		    //}

		    
		  }

		  // increment the parking slot count based on the vehicle type
		  private ParkingSpot incrementSlotCount(vehicaleType type) {
			  ParkingSpot spot=null;
			  if(type == vehicaleType.compact ) {
		    	 if(compactSlotCount < maxCompactCount) {
			         compactSlotCount++;
        spot = new CompactSpot(compactSlotCount);
			       } else {
			    	   regularSlotCount++;
	     spot = new RegularSpot(regularSlotCount);
			       }
		    } else if (type == vehicaleType.regular) {
		    	regularSlotCount++;
		  spot = new CompactSpot(regularSlotCount);
		    }
		    return spot ;} 

		  


	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
     ParkingLot  L=new ParkingLot();
     Vehicle vtype;
     Scanner in = new Scanner(System.in);
     //int type;//=in.nextInt();(type = in.nextInt()) != 1 ||(type = in.nextInt())!=2
     System.out.println("press 0 to new car");
     while(in.nextInt()==0) { 
     System.out.println("enter type");
     int type=in.nextInt();
	   if (type==1) {
	   vtype= new CompactCar();
	   System.out.println("compact car");
	   L.getNewParkingTicket(vtype);}
	   else if (type==2) {
	   vtype=new RegularCar();
	   System.out.println("regular car");
	   L.getNewParkingTicket(vtype);}
	   System.out.println("press 0 to new car");
	   }
	   
	 

}}
