import java.util.*;
class gen<T,V>
{
    T var1;
    V var2;
    
    gen(T v1,V v2)
    {
        var1=v1;
        var2=v2;
    }
    
    void showtype()
    {
        System.out.println("Datatype of first :" +var1.getClass().getName());
        System.out.println("Datatype of second :" +var2.getClass().getName());
    }
    
    T getvar1()
    {
        return var1;
    }
    V getvar2()
    {
        return var2;
    }
}
 class javalab7
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String1:");
	    String s=sc.next();
	    System.out.println("Enter integer:");
	    int i=sc.nextInt();
	    
	    gen<String,Integer> ob1=new gen<String,Integer>(s,i);
	    
	    ob1.showtype();
	    
	    System.out.println("value of first:"+ob1.getvar1());
	    System.out.println("value of second:"+ob1.getvar2());

	   System.out.println("\nEnter String2:");
	     s=sc.next();
	    System.out.println("Enter double:");
	    double d=sc.nextDouble();
	    
	    gen<String,Double> ob2=new gen<String,Double>(s,d);
	    
	    ob2.showtype();
	    
	    System.out.println("value of first:"+ob2.getvar1());
	    System.out.println("value of second:"+ob2.getvar2());
	}
}
