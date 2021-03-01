package com.xworkz.workzapp.library;

public class Sudi {

	static {
		System.out.println("static block is created");
		
	}
	public String sudiFamilyName;
	public String sudiWifeName;
	public String sudiSirName;
	
	{
		System.out.println("instance block is created");
	}
	
	public Sudi()//String sudiFamilyName, String sudiWifeName, String sudiSirName)
	{
		sudiFamilyName="neelabhai";
		sudiWifeName="Shona";
		sudiSirName="lamani";
		System.out.println(sudiFamilyName);
		System.out.println(sudiWifeName);
		System.out.println(sudiSirName);
	}
}

