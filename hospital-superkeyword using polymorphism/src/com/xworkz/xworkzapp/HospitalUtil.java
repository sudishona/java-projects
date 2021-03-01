package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.hospital.Hospital;
import com.xworkz.xworkzapp.hospital.Patient;

public class HospitalUtil {

	public static void main(String[] args) {
		Patient patient=new Patient("Max", 50, "Kohli");
		
		
		Hospital hospital=new NameOfHospitals();
		hospital.nameOfHospital=5000;
		hospital.admit(patient);
	}
}
