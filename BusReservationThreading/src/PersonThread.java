
public class PersonThread extends Thread{

	int seatsNeeded;
	public int getSeatsNeeded()
	{
		return seatsNeeded;
	}
	
	PersonThread(int seatsNeeded,Runnable target, String name)
	{
		
		super(target,name);
		this.seatsNeeded=seatsNeeded;
	}
	
	public static void main(String args[])
	{
		BusReservation br=new BusReservation();
		PersonThread pt=new PersonThread(2,br,"Kaushik");
		PersonThread pt2=new PersonThread(2,br,"Veluru");
		pt.start();
		pt2.start();
	}
	
}
