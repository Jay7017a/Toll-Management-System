package com.vehicleToll;

import java.util.Scanner;

public class Vehicle extends Toll {
	Scanner sc = new Scanner(System.in);
	String vehicleNumber;
	String vehicletype;
	static public double entryTime;
	public int countVehiclesInDay;

	public void setVehicleDetails(String vehicleNumber, String vehicletype, double entryTime) {
		this.vehicleNumber = this.checkVehicleNumber(vehicleNumber);

		this.vehicletype = vehicletype;
		this.entryTime = entryTime;

	}

	public String checkVehicleNumber(String vehicleNumber) {
		if (vehicleNumber != null && vehicleNumber.matches("AP\\d{2}[A-Z]{1,2}\\d{4}")) {
			return vehicleNumber;
		} else {
			throw new IllegalArgumentException("Invalid Vehicle Number");
		}

	}

	public void getVehicleDetails() {
		System.out.println();
		System.out.println("-------VEHICLE ENTERED------------");
		System.out.println();
		System.out.println("Vehicle Number : " + vehicleNumber);
		System.out.println("Vehicle Type : " + vehicletype);
		System.out.println("Entry Time : " + entryTime);
		System.out.println("status : Accepted");
		countVehiclesInDay+=1;
	}
}
