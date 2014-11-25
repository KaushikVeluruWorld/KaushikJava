/*
ID: kaushik18
LANG: JAVA
TASK: ride
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ride {


	private int StringToInteger(String str)
	{
		char[] str1=str.toCharArray();
		int[] result=new int[str1.length];
		int sum=1;
		for(int i=0;i<str.length();i++)
		{
			result[i]=(int)str1[i] - 64;
			sum*=result[i];
		}
		
		
		return sum;
	}

	public static void main(String[] args) throws IOException
	{
		
		//System.out.println(System.getProperty("user.dir"));
		ride rd=new ride();	
		
		BufferedReader br=new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		if((rd.StringToInteger(br.readLine().toUpperCase()) % 47)==(rd.StringToInteger(br.readLine().toUpperCase()) % 47))
			pw.println("GO");
		else
			pw.println("STAY");
		br.close();
		pw.close();
		System.exit(0);
		
	}
}
