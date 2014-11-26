import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TowersOfHanoi {

	
	public void towerExchange(int disks, char frompeg, char topeg, char auxpeg)
	{
		if(disks==1)
		{
			System.out.println("disk moved from "+frompeg +" to " + topeg);
			return;
		}
		towerExchange((disks - 1),frompeg, auxpeg, topeg);
		towerExchange((disks - 1),auxpeg, topeg, frompeg);
	}
	
	public static void main(String args[]) throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of disks:");
		int disks=Integer.parseInt(br.readLine());

		
		TowersOfHanoi toh=new TowersOfHanoi();
		toh.towerExchange(disks,'A', 'B','C');
	}
	
}
