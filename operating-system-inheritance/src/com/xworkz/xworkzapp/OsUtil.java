package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.OS.Linux;
import com.xworkz.xworkzapp.OS.Windows;

public class OsUtil {

	public static void main(String[] args) {
		//Os windows=new Windows(); ----polymorphism
		Windows windows = new Windows();
		windows.bit = "64-bit OS";
		windows.version = "10";
		windows.openSource = false;
		windows.runApp();
		System.out.println(windows.bit + " " + windows.version);

		Linux linux = new Linux();
		linux.bit = "128-bit";
		linux.version = "7";
		linux.openSource = true;
		linux.provideSecurity();
		System.out.println(linux.bit + " " + linux.version + " " + linux.openSource);
	}

}
