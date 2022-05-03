package com.th;

public class ThreadC extends Thread{
    public void run( ) {
       for(int i = 1; i <= 5; i++) {
          System.out.println("From Thread" + this.getName() + -1*i);
       }
       System.out.println("Exiting from Thread C ...");
    }
}