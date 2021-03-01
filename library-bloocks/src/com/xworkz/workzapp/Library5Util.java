package com.xworkz.workzapp;

import com.xworkz.workzapp.library.Library5;

public class Library5Util {

	static {
		System.out.println("main method is created");
	}
	public static void main(String[] args) {
		System.out.println("main methos is middle");
		Library5 library5=new Library5();
		System.out.println(library5);
		System.out.println("main method is ended");
		
	}
}
