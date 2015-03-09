
public class BusReservation implements Runnable{

	public int ticketsAvailable=3;
	
	public void run()
	{
		PersonThread pr=(PersonThread)Thread.currentThread();
		boolean ticketsBooked=bookTickets(pr.getSeatsNeeded(), pr.getName());
		if(ticketsBooked)
		{
			System.out.println("Congrats "+pr.getName()+" "+pr.getSeatsNeeded()+" booked");
		}
			
		else
			System.out.println("Sorry "+pr.getName()+" requestd seats ("+pr.getSeatsNeeded()+") are not available");
		
		System.out.println("Seats remaining: "+ticketsAvailable);
		
	}
	
	public synchronized boolean bookTickets(int seats, String name)
	{
		boolean isBooked=false;
		
		System.out.println("Hello "+Thread.currentThread().getName()+" Total seats available: "+ticketsAvailable);
		if(seats<=ticketsAvailable)
		{
			ticketsAvailable=ticketsAvailable-seats;
			isBooked=true;
		}
		
		
		return isBooked;
	}
}
