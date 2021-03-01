package com.xworkz.workzapp;

public class Library4 {

	static {
		
		System.out.println("static block created");
	}
	
	static String libraryNo;
	static String libraryName;
	{
		
		{
			System.out.println("instance block is created");
			
		}
	}
	public Library4()
	{
		libraryNo="s14";
		libraryName="sudi";
		System.out.println(libraryNo);
		System.out.println(libraryName);
	}
	
	
}


