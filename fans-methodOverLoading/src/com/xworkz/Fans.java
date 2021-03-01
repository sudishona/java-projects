package com.xworkz;

public class Fans 
{
public String fansCompany;
public int noOfWings;
public String noOfModels;

public Fans() 
{
	
	System.out.println("Fans is a in high speed");
}

public Fans(String fansCompany, int noOfWings)
{
	this();
	this.fansCompany=fansCompany;
	this.noOfWings=noOfWings;
	System.out.println("with 2 parameters");
}

public Fans(String fansCompany, int noOfWings, String noOfModels)
{
	this(fansCompany, noOfWings);
	this.fansCompany=fansCompany;
	this.noOfWings=noOfWings;
	this.noOfModels=noOfModels;
	System.out.println("with 3 parameters");
}
}
