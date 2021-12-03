import java.util.*;
class book{
    String name;
    String author;
    int n;//pages
    int price;
    book(String a,String b,int n,int p)
    {
        name=a;
        author=b;
        this.n=n;
        price=p;
    }
    
    public String toString()
    {
        return "\nname:"+name+"\nauthor:"+author+"\nno_of_pages:"+n+"\ncost:"+price;
    }
}
public class ToString
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of books:");
		int n=in.nextInt();
		book[] b1=new book[n];
		for(int i=0;i<n;i++)
		{	
			String name=in.next();
			String author=in.next();
			int np=in.nextInt();
			int price=in.nextInt();
			b1[i]=new book(name,author,np,price);
		}
		for(int i=0;i<n;i++)
			System.out.println(b1[i]);
	}
}
