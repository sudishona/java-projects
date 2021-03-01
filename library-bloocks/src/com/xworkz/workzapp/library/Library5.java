package com.xworkz.workzapp.library;

public class Library5 {

	static {
		System.out.println("static block is created");
	}
	static String libraryName;
	static String libraryNo;
	{
		{
			System.out.println("instance block is created");
		}
	}
	public Library5()
	{
		libraryName="shona";
		libraryNo="s123";
		System.out.println(libraryName);
		System.out.println(libraryNo);
	}
	
}
