package com.company;
//Through extending the thread class
class mythread extends Thread{
    String name;
    int time;
    int freq;
    mythread(String n,int t,int f)
    {
        name=n;
        time=t;
        freq=f;
    }
    public void run()
    {
        try{
            for(int i=freq;i>0;i--)
            {
                System.out.println(name);
                Thread.sleep(time);
            }
        }catch(InterruptedException e)
        {
            System.out.println(name+"Interrupted");
        }
    }
}

public class Threads {
    public static void main(String args[])
    {
        mythread t1=new mythread("BMS",10000,2);
        mythread t2=new mythread("CSE",2000,10);
        t1.start();
        t2.start();

    }
}
