package com.xworkz.workzapp.library;

public class Library {
												
	static {												//static block
		System.out.println("static block is executed");

	}

	static int libraryDoorNo;		//static variable
	static String name;
	{
		System.out.println("Instance init block is executed");
		{
			{											//instance initialization block 

			}
		}
	}

	public Library() {

		{
			System.out.println("1");
		}
		{
			System.out.println("2");
		}
		{
			System.out.println("3");
		}
		{
			System.out.println("420");
		}
		{
			System.out.println("100");
		}
		// TODO Auto-generated constructor stub
		libraryDoorNo = 90;
		name = "vijayanagar library";
		System.out.println(libraryDoorNo);
		System.out.println(name);
	}

	public void read() {

		System.out.println("Reading books");
	}

}
