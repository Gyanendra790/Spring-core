package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor:int int");
	}
	
	Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor:double double");
	}
	 
	void doSum()
	{
		System.out.println("Sum is:"+(this.a+this.b));
	}

}
