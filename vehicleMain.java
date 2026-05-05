package com.vehicleToll;

import java.util.Scanner;

public class vehicleMain extends Toll{
	static String yes="yes";
	static Scanner sc= new Scanner(System.in);
	static String vehicleNumber;
	static String vehicletype;
	static double entryTime;
	static void addVehicle() {
		System.out.println("Enter Vehicle Number : ");
		vehicleNumber=sc.next();
		System.out.println("Enter Vehicle type : ");
		vehicletype=sc.next();
		System.out.println("Enter Vehicle entryTime : ");
		entryTime=sc.nextDouble();
		
	}
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("========================================");

		System.out.println("TOLL MANAGEMENT SYSTEM");
	
		System.out.println("=========================================");
		vehicleMain.addVehicle();
		Vehicle v1=new Vehicle();
		v1.setVehicleDetails(vehicleNumber,vehicletype,entryTime);
		v1.getVehicleDetails();
		v1.vehicleTypecheck(vehicletype,entryTime);
		v1.selectPaymentMode(v1.vehicletype, v1.tollTotal,v1.vehicleNumber);
		Revenuetotal.fullCompletedVehiclesPayament();
		
		
		}
}
