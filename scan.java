public class input{
	public static void main(String args[])
	{       int a;
		float b;
		String s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		a=in.nextInt();

		System.out.println("int a="+a);

		System.out.println("Enter a float");
		b=in.nextFloat();
		
		System.out.println("float b="+b);
		
		System.out.println("Enter a string");
		s=in.nextLine();
		
		System.out.println("string s="+s);
	}
}
		