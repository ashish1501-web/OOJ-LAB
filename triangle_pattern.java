import java.util.*;
public class triangle_pattern{
	public static void main(String args[])
	{	int n,count=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{  for(int j=0;j<=i;j++)
			{  System.out.print(count);
				count++;}
		System.out.println();
		}
	}
}