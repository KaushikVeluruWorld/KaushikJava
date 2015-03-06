
public class RacerDemo{

	public static void main(String args[])
	{
		Racer racer=new Racer();
		Thread tortoise=new Thread(racer,"tortoise");
		Thread hare=new Thread(racer,"hare");
		
		tortoise.start();
		hare.start();
	}
}
