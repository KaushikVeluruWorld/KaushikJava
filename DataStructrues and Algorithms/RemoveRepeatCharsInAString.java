
public class RemoveRepeatCharsInAString {

	public static void main(String args[])
	{
		String str="aacabcabacdabeefg";
		
		//Since a string is immutable, take a StringBuilder
		StringBuilder sb=new StringBuilder(str);		
		System.out.println("Initial string:  "+sb.toString());
		
		//This solution uses an extra array
		char array[]=new char[str.length()];
		boolean bool=false;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(array.length==0)
			{
				array[0]=sb.charAt(i);
				count++;
			}
			else
			{
				bool=false;
				for(int j=0;j<array.length;j++)
				{
					if(sb.charAt(i)==array[j])
						bool=true;
				}
				if(!bool)
				{   //System.out.println("inserting  at "+ count + sb.charAt(i));
					array[count]=sb.charAt(i);
					count++;
				}
			}
		}
		
		//Print new string
		sb.delete(0, str.length());
		System.out.println("after removing duplicate variables:  "+sb.append(array).toString());
	}
}
