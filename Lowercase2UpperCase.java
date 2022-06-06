import java.util.Scanner;

public class ConvertLowercaseToUpperWithoutMethods
{
    public static void lowerCase(char str[])
    {
    	int i=0;
    	while(str[i]!='\0')
    	{
    		if(str[i]>=65 && str[i]<=96)
    		{
    		  str[i] +=32;
    		}
    		i++;
    	}
    	System.out.println(str[i]);
    	
    	
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		char[] st=str.toCharArray();
		lowerCase(st);
		
	}

}
