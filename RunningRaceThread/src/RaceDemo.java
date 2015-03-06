
public class RaceDemo {

	public static void main(String[] args)
	{
		Racer racer=new Racer();
		
		for(int i=1;i<11;i++)
		{
			Thread thread=new Thread(racer, Integer.toString(i)); 
			thread.start();
		}
		
		
	}
}
