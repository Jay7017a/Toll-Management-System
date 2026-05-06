package com.vehicleToll;

import java.util.Scanner;

public class vehicleMain extends Toll{
	static String yes="yes";
	static Scanner sc= new Scanner(System.in);
	static String vehicleNumber;
	static String vehicletype;
	static double entryTime;
	static String  nextVehicleInQueue;
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
		String againEnterVehicle="no";
		System.out.println("TOLL MANAGEMENT SYSTEM");
	do {
	
		System.out.println("=========================================");
		vehicleMain.addVehicle();
		Vehicle v1=new Vehicle();
		v1.setVehicleDetails(vehicleNumber,vehicletype,entryTime);
		v1.getVehicleDetails();
		v1.vehicleTypecheck(vehicletype,entryTime);
		v1.selectPaymentMode(v1.vehicletype, v1.tollTotal,v1.vehicleNumber);
		//Revenuetotal.fullCompletedVehiclesPayament();
		System.out.println("Next Vehicle is There");
		nextVehicleInQueue=sc.next();
		if(nextVehicleInQueue.equalsIgnoreCase("yes")) {
			if(totamount==tollTotal)
				againEnterVehicle="yes";
			
		}
		else if ((nextVehicleInQueue.equalsIgnoreCase("yes"))){
			againEnterVehicle="yes";
		}
		else {
			againEnterVehicle="no";
		}
	}
	
	while(againEnterVehicle.equalsIgnoreCase("yes"));
	Revenuetotal.fullCompletedVehiclesPayament();
	System.out.println();
	Revenuetotal.inCompletedVehiclesPayemtPendingList();
}
}
