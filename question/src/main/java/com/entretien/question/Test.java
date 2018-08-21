package com.entretien.question;

public class Test {

	public int x;
	
	public Test()
	{
		x=5;
	}
	public Test (int a)
	{
		this();
		x=x-a;
	}
	public Test (int a, int b)
	{
		this(a);
		x=x-a+b;
	}
}
