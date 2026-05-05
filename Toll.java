package com.vehicleToll;

import java.util.Scanner;

public class Toll extends Payment {
	static double baseToll;
	static double peakHour;
	static double tollTotal;
	public double totalRevenueInDay;
	public int countvehiclesPaymentDone;
	static Scanner sc = new Scanner(System.in);

	static void tollStart() {
		System.out.println();
		System.out.println("-------TOLL STARTED--------");

	}

	void vehicleTypecheck(String vehicletype,double entryTime) {
		if (vehicletype.equalsIgnoreCase("car")) {
			car();
			//Car Data
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("bike")) {
			bike();
			totalRevenueInDay+=tollCalculation(vehicletype);

		} else if (vehicletype.equalsIgnoreCase("bus")) {
			bus();
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("auto")) {
			auto();
			tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("truck")) {
			container();
			tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("lorry")) {
			container();
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("ambulance")) {
			ambulance();
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("electricvehicle")) {
			electricvehicle();
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("container")) {
			container();
			tollCalculation(vehicletype);
		} else if (vehicletype.equalsIgnoreCase("cycle") || vehicletype.equalsIgnoreCase("bullecot")
				|| vehicletype.equalsIgnoreCase("policevehicle") || vehicletype.equalsIgnoreCase("governmentvehicle")) {
			totalRevenueInDay+=tollCalculation(vehicletype);
		} else {
			totalRevenueInDay+=tollCalculation(vehicletype);
		
		}

	}

	static double  tollCalculation(String vehicletype) {
		System.out.println();
		System.out.println("------TOLL CALCULATION-------");
		System.out.println();
		System.out.println("Vehicle Type : " + vehicletype);
		System.out.println("Base Toll : " + baseToll);
		System.out.println("peak Hour : " + peakHour);
		System.out.println("Total Toll : " + tollTotal);
		System.out.println("------------------------------");
		return tollTotal;
	}

	static void car() {
		baseToll = 50;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;

	}

	static double bike() {
		baseToll = 20;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}

	static double auto() {
		baseToll = 30;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}

	static double van() {
		baseToll = 70;
		peakHour =peakHourSetup();
		tollTotal=baseToll=peakHour;
		return tollTotal;
	}

	static double bus() {
		baseToll = 100;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}

	static double container() {
		baseToll = 200;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}

	static double ambulance() {
		baseToll = 0;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}

	static double electricvehicle() {
		baseToll = 30;
		peakHour =peakHourSetup();
		tollTotal=baseToll+peakHour;
		return tollTotal;
	}
	static double peakHourSetup() {
		if((Vehicle.entryTime>=9)&&(Vehicle.entryTime<=11.30d)) {
			peakHour=(3/10)*baseToll;
			return peakHour;
		}
		else if((Vehicle.entryTime>=4.30d)&&(Vehicle.entryTime<=6.30d)) {
			peakHour=(0.45)*baseToll;
			return peakHour;
		}
		else {
			peakHour=(0.2)*baseToll;
			return peakHour;
		}
	}
}
