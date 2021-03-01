package com.xworkz.xworkz;

import com.xworkz.xworkz.exam.Exam;
import com.xworkz.xworkz.exam.Hallticket;
import com.xworkz.xworkz.exam.SupplementryExam;

public class ExamUtil {

	public static void main(String[] args) {
		
		//Exam exam=new Exam();
		//exam.fees=1600;
		Hallticket hallticket=new Hallticket("Msc161609", "sudi", "123Msc123");
		//exam.allow(hallticket);
		//hallticket.displayInfo();
		
		Exam exam2=new SupplementryExam();
		exam2.fees=1600;
		exam2.allow(hallticket);
	}
}
