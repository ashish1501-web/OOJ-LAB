import java.lang.Math;
import java.util.*;
public class areavol{
	public static void main(String args[])
	{	int n,h,r;
		Scanner in=new Scanner(System.in);
		do{	System.out.println("Enter 1.cylinder\n2.cone\n3.sphere");	
			double area,vol;
			n=in.nextInt();
			switch(n)
			{
				case 1: 
				{System.out.println("Enter height and radius");
					h=in.nextInt();
					r=in.nextInt();
					area=(2*3.14*r*h)+(2*3.14*r*r);
					vol=3.14*r*r*h;
				System.out.println("area of cylinder:"+area+"and its vol:"+vol);
				break;}
				case 2: 
				{System.out.println("Enter height and radius");
					h=in.nextInt();
					r=in.nextInt();
					area=3.14*r*(r+Math.sqrt((h*h)+(r*r)));
					vol=3.14*r*r*h/3;
				System.out.println("area of cone:"+area+"and its vol:"+vol);
				break;}
				case 3: 
				{System.out.println("Enter height and radius");
					h=in.nextInt();
					r=in.nextInt();
					area=4*3.14*r*r;
					vol=(4/3)*3.14*r*r*r;
				System.out.println("area of sphere:"+area+"and its vol:"+vol);
				break;}
					
			}
		}while(n!=0);
}	
}
