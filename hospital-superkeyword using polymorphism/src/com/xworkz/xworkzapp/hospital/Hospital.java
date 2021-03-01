package com.xworkz.xworkzapp.hospital;

public class Hospital {

	public int nameOfHospital;
	public Patient patient;
	
	public boolean admit(Patient patient)
	{
		boolean  nameOfHospital=false;
		if(this.nameOfHospital ==5000)
		{
			nameOfHospital=true;
			if(patient!=null)
			{
				this.patient=patient;
				System.out.println("vaidevi hospital allow to special ward");
			}else
			{
				System.out.println("allow to waiting room");
			}
		
		}else
			{
				System.out.println("please allow the normal ward");
			}
		
		
		return nameOfHospital;
		
				
	}
	
}
