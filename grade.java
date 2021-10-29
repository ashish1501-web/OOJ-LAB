import java.util.*;
public class grade{
	public static void main(String args[])
	{	int n=4;
		Scanner in=new Scanner(System.in);
		int cie[]=new int[n];
		int see[]=new int[n];
		int f[]=new int[n];
		System.out.println("Enter the cie marks");
		for(int i=0;i<n;i++)
		{	cie[i]=in.nextInt();
		}
		
		System.out.println("Enter the see marks");
		for(int i=0;i<n;i++)
		{	see[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{	f[i]=cie[i]+(int)(see[i]/2);
		}
		for(int i=0;i<n;i++)	
		{ 
			if(f[i]>=90 && f[i]<=100)
			{	System.out.println("subject"+(i+1)+"grade is:S");
			}
			else if(f[i]>=80 && f[i]<90)
			{	System.out.println("subject"+(i+1)+"grade is:A");
			}
			else if(f[i]>=70 && f[i]<80)
			{	System.out.println("subject"+(i+1)+"grade is:B");
			}
			else if(f[i]>=60 && f[i]<70)
			{	System.out.println("subject"+(i+1)+"grade is:C");
			}
			else if(f[i]>=50 && f[i]<60)
			{	System.out.println("subject"+(i+1)+"grade is:D");
			}
			else if(f[i]>=40 && f[i]<50)
			{	System.out.println("subject"+(i+1)+"grade is:E");
			}
			else
			{	System.out.println("subject"+(i+1)+"grade is:F");
			}
		}
	}	
		
}