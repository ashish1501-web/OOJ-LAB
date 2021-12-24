package SEE;
import CIE.*;
import java.util.*;

public class Externals extends CIE.Student{
    Scanner sc=new Scanner(System.in);
    public int seem[]=new int[5] ;
    public void accept()
    {   for(int i=0;i<5;i++)
       { System.out.println("Enter see marks of subject:"+(i+1));
        seem[i]=sc.nextInt();
       }
    }
    
    
}

======================================================================
package CIE;
import java.util.*;

public class Internals extends CIE.Student{
    Scanner sc=new Scanner(System.in);
    public int ciem[]=new int[5] ;
    public void accept()
    {   for(int i=0;i<5;i++)
       { System.out.println("Enter cie marks of subject:"+(i+1));
        ciem[i]=sc.nextInt();
       }
    }
    
    
}
====================================================================
package CIE;
import java.util.*;

public class Student{
    Scanner sc=new Scanner(System.in);
     public String usn,name;
     public int sem;
    public void accept()
    {
        System.out.println("Enter usn:");
        usn=sc.next();
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter sem:");
        sem=sc.nextInt();
    }
    
    public void display()
    {
        System.out.println(" usn:"+usn);
        System.out.println(" name:"+name);
        System.out.println("sem:"+sem);
    }
}
=========================================================

package marks;
import SEE.*;
import CIE.*;
import java.util.*;

class totalmarks{
    public static void main(String args[])
    {   int i,j,n;
        Scanner sc=new Scanner(System.in);
        int total[]=new int[5];
        System.out.println("Enter the number of students:");
        n=sc.nextInt();
        Student s[]=new Student[n];
        Internals ci[]=new Internals[n];
        SEE.Externals e[]=new SEE.Externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter details of stuident"+(i+1));
            s[i]=new Student();
            s[i].accept(); 
            ci[i]=new Internals();
            ci[i].accept(); 
            e[i]=new Externals();
            e[i].accept();      
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Student details:"+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+e[i].seem[j];
                System.out.println("total marks in subject:"+(i+1));
                
            }
            System.out.println();
        }
        
    }
}
