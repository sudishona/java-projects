package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.bank.Bandhanbank;
import com.xworkz.xworkzapp.bank.Bank;
import com.xworkz.xworkzapp.bank.Denabank;
import com.xworkz.xworkzapp.bank.Hdfcbank;
import com.xworkz.xworkzapp.bank.Icicibank;
import com.xworkz.xworkzapp.bank.Sbibank;

public class BankTester {

	public static void main(String[] args) {
		
		Bank icici=new Icicibank();  //overriding
		icici.rateOfIntrest();
		
		Bank hdfc=new Hdfcbank();
		hdfc.rateOfIntrest();
		
		Bank dena=new Denabank();
		dena.rateOfIntrest();
		
		Bank bandhan=new Bandhanbank();
		bandhan.rateOfIntrest();
		
		Bank sbi=new Sbibank();
		sbi.rateOfIntrest();
	}
}
