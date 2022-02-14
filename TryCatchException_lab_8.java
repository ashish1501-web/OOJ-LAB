package com.company;

import java.util.Scanner;

class fatherageexception extends Exception{

    public String toString()
    {
        return "Father's age is less than 0----";
    }
}

class sonageexception extends Exception{
    int a;
    sonageexception(int age)
    {
        a=age;
    }
    public String toString()
    {
        if (a < 0) {
            return "son's age is less than 0";
        } else {
            return "son's age is more than father's age";
        }
    }
}

class Father{
    Scanner sc=new Scanner(System.in);
    int age1;
    Father()
    {
        System.out.println("Enter Father's age:");
        age1=sc.nextInt();
    }
    void ex1() throws fatherageexception
    {
        if(age1<0)
        {
            throw new fatherageexception();
        }
    }
}

class Son extends Father{
    Scanner sc=new Scanner(System.in);
    int age2;
    Son()
    {
        System.out.println("Enter Son's age:");
        age2=sc.nextInt();
    }
    void ex2() throws sonageexception{
        if(age2<0 || age2>super.age1){
            throw new sonageexception(age2);
        }
    }

}

public class tryexception {
    public static void main(String args[])
    {
        Son s=new Son();
        try{
            s.ex1();
        }
        catch(fatherageexception fe)
        {
            System.out.println(fe);
        }
        try{
            s.ex2();
        }
        catch(sonageexception se)
        {
            System.out.println(se);
        }

    }
}
