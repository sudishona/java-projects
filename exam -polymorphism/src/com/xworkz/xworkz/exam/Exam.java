package com.xworkz.xworkz.exam;

public class Exam {

	public int fees;
	public Hallticket hallticket;
	
	public boolean allow(Hallticket hallticket)
	{
		boolean check=false;
		
		if(this.fees==1600)
		{
			check=true;
			if(hallticket !=null)
				
			{
				
				this.hallticket=hallticket;
				System.out.println("allow to exam");
				
			}else
			{
				System.out.println("hall ticket is not yet generated");
				
			}
			
		}else
		{
			System.out.println("please pay the fees");
			
		}
		return check;
			
			
	} 
}
