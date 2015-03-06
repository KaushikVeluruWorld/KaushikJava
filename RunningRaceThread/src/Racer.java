import java.util.ArrayList;
import java.util.Iterator;


public class Racer implements Runnable {

	public static String winner;
	public long startTime;
	public long endTime;
	public String runnerName;
	public static int completedRunnersCount=0;
	public static ArrayList<String> ar=new ArrayList<String>();
	
	
	private void race()
	{
		this.startTime=System.currentTimeMillis();
		for(int meters=1;meters<101;meters++)
		{
			System.out.println("Distance covered by runner "+Thread.currentThread().getName()+": "+meters);
			isWon(meters);
		}
	}
	
	
	private void isWon(int distanceCovered)
	{
		if(distanceCovered==100)
		{
			Racer.completedRunnersCount++;
			//this.runnerName=Thread.currentThread().getName();
			ar.add(Thread.currentThread().getName());
		}
		
		if((Racer.winner==null)&&(distanceCovered==100))
		{
			
			//this.endTime=System.currentTimeMillis();
			Racer.winner=Thread.currentThread().getName();
			
		}
		
		
	}
	
	public void run()
	{
		this.race();
		
		if(Racer.winner!=null)
		{
			//System.out.println("runner completed the race: "+Racer.completedRunnersCount);
			if(Racer.completedRunnersCount==10)
			System.out.println("Winner is: "+Racer.winner);
			Iterator<String> itr=ar.iterator();
			int i=2;
			itr.next();
			while(itr.hasNext())
			{
				
				System.out.println("position "+(i++)+" "+itr.next());
			}
			
		}
		
	}
}
