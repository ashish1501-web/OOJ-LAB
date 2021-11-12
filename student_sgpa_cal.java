import java.util.*;
public class student_sgpa_cal {
    int n=5;
    int marks[]=new int[n];
    
    String name,usn;

    Scanner in=new Scanner(System.in);
    student_sgpa_cal()
    {
        
    }
    void input(int n)
    {   
        System.out.println("Enter the usn:");
       usn=in.next();
        System.out.println("Enter the name of the student:");
        name=in.next();
        
        System.out.println("Enter the array of marks for n subjects:");
        
        
        for(int i=0;i<n;i++)
        {
            marks[i]=in.nextInt();
        }

    }
     void output(int[] credits,int n)
    {  
        double sgpa;
        int sum=0;
        int total_cred=0;
        for(int i=0;i<n;i++)
        {   total_cred+=credits[i];
            sum+=(marks[i]*credits[i]);
        }
        sgpa=(double)sum/total_cred;
        System.out.println(sgpa);
    }
    public static void main(String[] args)
    {  int n=5;
        Scanner in=new Scanner(System.in);
         int credits[]=new int[n];
        System.out.println("Enter the credits:");
    for(int i=0;i<n;i++)
    {
        credits[i]=in.nextInt();
    }
        student_sgpa_cal s1=new student_sgpa_cal();
        s1.input(n);
        s1.output(credits,n);
    }
}
