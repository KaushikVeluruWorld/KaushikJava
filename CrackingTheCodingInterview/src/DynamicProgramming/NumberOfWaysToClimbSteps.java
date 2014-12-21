package DynamicProgramming;

public class NumberOfWaysToClimbSteps {

	
	public int calculateSteps(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 4;
		else
		return (calculateSteps(n-1)+(calculateSteps(n-2))+(calculateSteps(n-3)));
	}
	
	public static void main(String args[])
	{
		NumberOfWaysToClimbSteps n=new NumberOfWaysToClimbSteps();
		int steps=5;
		System.out.println("Number of possible ways to climb "+ steps +" is :"+n.calculateSteps(steps));
		
	}
}
