package com;
import com.th.*;
public class ThreadDemo {
	public static void main(String[] args) {
	ThreadSum threadSum = new ThreadSum(1, 2);
	threadSum.start();
    System.out.println("Result: " + threadSum.getResult());
    
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    ThreadC c = new ThreadC();
    a.start();
    b.start();
    c.start();
    System.out.println("... Multithreading is over "); 
    
    
    
    
	}
}
