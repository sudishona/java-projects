package com.xworkz.xworkz.exam;

public class Hallticket extends Exam {
	public String subjectCode;
	public String candidateName;
	public String usn;
	
	public Hallticket(String subjectCode, String candidateName, String usn) {
		
		super();
		this.subjectCode=subjectCode;
		this.candidateName=candidateName;
		this.usn=usn;
		//System.out.println(this.subjectCode +"  " + this.candidateName + " " + this.usn );
	}
	public void displayInfo() {
		System.out.println(this.subjectCode + " " + this.candidateName + " " + this.usn);
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	
	
	public String getCandidateName() {
		return candidateName;
	
	
	}
	public String getUsn() {
		return usn;
	}
	
	
}
