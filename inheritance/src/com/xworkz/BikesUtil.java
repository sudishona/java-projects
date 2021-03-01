package com.xworkz;

import bike.TopPowerBikes;

public class BikesUtil {

	public static void main(String[] args) {
		
		TopPowerBikes toppowerbikes=new TopPowerBikes();
		toppowerbikes.brand="pulsar";
		toppowerbikes.colour="RED AND BLACK";
		toppowerbikes.speedBikes();
		toppowerbikes.saftey();
		
		
		System.out.println(toppowerbikes.brand + " "+ toppowerbikes.colour);
		
	}
}
