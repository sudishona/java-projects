package com.xworkz.xworkzapp;

public class Cabs
{
	public String comapany;
	public int noOfCabs;

	public Cabs() {
		System.out.println("Uber is coming");
	}
	public Cabs(String company) {
		this();
		System.out.println("Ola is arriving");
		this.comapany=company;
	}
	public Cabs(int noOfCabs) {
		System.out.println("Both are coming");
		this.noOfCabs=noOfCabs;
	}
	
}
