package com;

public class ThreadSum extends Thread {
	// data members of class/fields
	private int a;
	private int b;
	private int result;

	// create non-default constructor
	public ThreadSum(int a, int b) {
		setA(a);
		setB(b);
	}

	// setter/mutator methods
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	// getter/accessor
	public int getResult() {
		return result;
	}

	@Override
	public void run() {
		super.run();
	
			result = a + b;
			System.out.println(result);
		
	}

}
