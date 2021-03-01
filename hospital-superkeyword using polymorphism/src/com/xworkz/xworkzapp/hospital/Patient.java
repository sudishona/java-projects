package com.xworkz.xworkzapp.hospital;

public class Patient {

	public String patientName;
	public int patientAge;
	public String patientGardian;
	
	public Patient(String patientName, int patientAge, String patientGardian )
	{
		super();
		this.patientName=patientName;
		this.patientAge=patientAge;
		this.patientGardian=patientGardian;
	}
	public void patientInfo() {
		
		System.out.println(this.patientName + " " + this.patientAge + " " + this.patientGardian);
	}
	public String getPatientName() {
		return patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public String getPatientGardian() {
		return patientGardian;
	}
	
	}

