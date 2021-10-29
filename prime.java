import java.util.*;
import java.lang.Math;
public class prime{
	public static void main(String args[])
	{	int a,b;
		System.out.println("Enter the range");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(int i=a;i<=b;i++)	
		{ int prime=1;
			for(int j=2;j<=Math.sqrt(i);j++)
			{  if(i%j==0){
				prime=0;
				break;}
			}
		if(prime==1){ System.out.println(i);}
		}
	}
}