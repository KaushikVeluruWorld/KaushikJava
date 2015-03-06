
public class Racer implements Runnable {

	public static String winner;
	
	public void race()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Distance covered by "+Thread.currentThread().getName()+":"+i);
			if(this.isRaceWon(i))
			{
			
				break;
			}
		}
	}
	
	private boolean isRaceWon(int distanceCovered)
	{
		 boolean isWon=false;
		 if((Racer.winner==null)&&(distanceCovered==100))
		 {
			 Racer.winner=Thread.currentThread().getName();
			 System.out.println("Winner is: "+Racer.winner);
			 isWon=true;
		 }
		 else if(Racer.winner==null)
			 isWon=false;
		 else if(Racer.winner!=null)
			 isWon=true;
		 
		 return isWon;
		
		
	}
	public void run()
	{
		this.race();
	}
}
