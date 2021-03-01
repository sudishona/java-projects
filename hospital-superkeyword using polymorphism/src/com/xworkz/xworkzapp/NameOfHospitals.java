package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.hospital.Hospital;
import com.xworkz.xworkzapp.hospital.Patient;

public class NameOfHospitals extends Hospital {

	
	@Override
	public boolean admit(Patient vaidevi)
	{
		System.out.println("vaidevi hospital allow to  the patient");
		super.nameOfHospital=5000;
		return super.admit(vaidevi);
		
	}
}
