package com.xworkz.workzapp.library;

import com.xworkz.workzapp.Library4;

public class Library4Util {

	static {
		System.out.println("static main method is created");
	}
	public static void main(String[] args) {
		
		System.out.println("main method");
		Library4 library4=new Library4();
		System.out.println(library4);
		System.out.println("main method is ended");
	}
}
