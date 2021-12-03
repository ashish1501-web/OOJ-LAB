import java.util.*;
abstract class fig{
    double d1;
    double d2;
    fig(double d1,double d2)
    {
        this.d1=d1;
        this.d2=d2;
    }
    fig(double r)
    {
        d1=r;
    }
    abstract double area();
    
}

class triangle extends fig{
    triangle(double a,double b)
    {	super(a,b);
        
    }
    double area()
    {
        System.out.println("Area of the triangle:");
        return (d1*d2*0.5);
    }
}
class rectangle extends fig{
    rectangle(double a,double b)
    {	super(a,b);
        
    }
    double area()
    {
        System.out.println("Area of the rectangle:");
        return (d1*d2);
    }
}
class circle extends fig{
   circle(double a)
    {	super(a);
        
    }
    double area()
    {
        System.out.println("Area of the circle:");
        return (d1*d1*3.14);
    }
}
public class area_of_diff_figures
{   public static void main(String args[])
    {
        
        triangle t=new triangle(3,4);
        rectangle r=new rectangle(5,10);
        circle c=new circle(5);
        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());
    }
    
}
