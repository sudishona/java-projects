package com.xworkz.xworkz.exam;

public class SupplementryExam extends Exam{

	
	@Override
	public boolean allow(Hallticket ticket)
	{
		System.out.println("invoked allow method from supplementry ");
		super.fees=1600;
		return super.allow(ticket);
	}
	
	
	
	
	
	
	
}
