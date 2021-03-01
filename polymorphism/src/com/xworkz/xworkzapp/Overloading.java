package com.xworkz.xworkzapp;

public class Overloading {

	public void disp(char c)
	{
		System.out.println(c);
	}
	public void disp(char c, int num)
	{
		System.out.println(c + " "+ num);
		
		
	}
}
class sample
{
	public static void main(String[] args) {
		Overloading overloading =new Overloading();
		overloading.disp("sudi");
		overloading.disp();
	}
}