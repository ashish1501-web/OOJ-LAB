import java.util.*;


public class quad_roots {
    public static void main(String[] args)
    {   double a,b,c,r1,r2,r;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the co-effiecients");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        double d=(b*b)-(4*a*c);
        if(d==0)
        {   System.out.print("Roots are equal:");
            r=(-b)/(2*a);
            System.out.println(r+"and" +r);
        }
        else if(d>0)
        {
            System.out.print("Roots are real and distinct:");
            r1=((-b)+Math.sqrt(d))/(2*a);
            r2=((-b)-Math.sqrt(d))/(2*a);
            System.out.println(r1+"and"+r2);
        }
        else{
            System.out.println("Roots are imaginary");
            
        }

    }
}
