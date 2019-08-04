package assignment5;

import java.util.Scanner;

public class Ticket {
	private final float startTime;
	private static int ticketNumber=0;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
	    System.out.println("enter start time");
	 int startTime=in.nextInt();
		this.startTime=startTime;
		 ticketNumber++;
	}
	
	public float getStartTime() {
		return startTime;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketnumber ) {
		ticketNumber= ticketnumber;
	}
}
