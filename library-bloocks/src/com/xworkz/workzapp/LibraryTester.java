package com.xworkz.workzapp;

import com.xworkz.workzapp.library.Library;

public class LibraryTester {
	
	static {
		System.out.println("main static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		Library library = new Library();
		System.out.println(library);
		System.out.println("main method ended");
	}

}
