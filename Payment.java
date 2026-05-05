package com.vehicleToll;

import java.util.Scanner;

public class Payment{
	static Scanner sc = new Scanner(System.in);
	static String paymentMode;
	public static String status;
	public double totamount;
	public  static int countvehiclesPaymentDone;
	public  static String vehiclesPaymentInComplete="";
	public static String vehiclesCompletedPayment="";
	public  static double unCompleteVehiclesPaymentTotal;
	public static  double totalCompletedvehiclesPayment;

	void selectPaymentMode(String vehicletype,double tollTotal,String vehicleNumber) {
		System.out.println("selece Payment Mode :");
		System.out.println("1.UPI");
		System.out.println("2.CASH");
		System.out.println("3.FASTag");
		paymentMode = sc.next();
		if (paymentMode.equalsIgnoreCase("cash")) {
			System.out.println("This is the required Amount : " + Toll.tollTotal);
			double totamount = sc.nextDouble();
			if (totamount == Toll.tollTotal) {
				status = receipt(vehicletype,tollTotal);
				countvehiclesPaymentDone+=1;
				totalCompletedvehiclesPayment+=tollTotal;
				vehiclesCompletedPayment+=vehicleNumber+" : "+vehicletype+"-> "+tollTotal+"\n";
			} else {
				System.out.println("Status : FAILED");
				 vehiclesPaymentInComplete+=vehicleNumber+" : "+vehicletype+"->	"+tollTotal+"\n";
				 unCompleteVehiclesPaymentTotal+=tollTotal;
				 
				
			}
		} else if (paymentMode.equalsIgnoreCase("upi")) {
			System.out.println("This is the required Amount : " + Toll.tollTotal);
			totamount = sc.nextDouble();
			if (totamount == Toll.tollTotal) {
				status = receipt(vehicletype,tollTotal);
				countvehiclesPaymentDone+=1;
				totalCompletedvehiclesPayment+=tollTotal;
				vehiclesCompletedPayment+=vehicleNumber+" : "+vehicletype+"-> "+tollTotal+"\n";
			} else {
				System.out.println("Status : FAILED");
				vehiclesPaymentInComplete+=vehicleNumber+" : "+vehicletype+"->	"+tollTotal+"\n";
				 unCompleteVehiclesPaymentTotal+=tollTotal;
			}
		} else if (paymentMode.equalsIgnoreCase("fastag")) {
			System.out.println("This is the required Amount : " + Toll.tollTotal);
			totamount = sc.nextDouble();
			if ((int)totamount == (int)Toll.tollTotal) {
				status = receipt(vehicletype,tollTotal);
				countvehiclesPaymentDone+=1;
				totalCompletedvehiclesPayment+=tollTotal;
				vehiclesCompletedPayment+=vehicleNumber+" : "+vehicletype+"-> "+tollTotal+"\n";
			} else {
				System.out.println("Status : FAILED");
				vehiclesPaymentInComplete+=vehicleNumber+" :"+vehicletype+"->	 "+tollTotal+"\n";
				 unCompleteVehiclesPaymentTotal+=tollTotal;
			}
		} else {
			System.out.println("Choose the above Payment Mode Options");
		}

	}

	public String receipt(String vehicletype,double tollTotal) {
		System.out.println();
		System.out.println("--------RECEIPT---------");
		System.out.println();
		System.out.println("Vehicle :" + vehicletype);
		System.out.println("Toll Amount : " + tollTotal);
		System.out.println("Payment Mode : " + paymentMode);
		if ((int)totamount == (int)tollTotal) {
			status = "SUCCESS";
			System.out.println("status : " + status);
		} else {
			status = "FAILED";
			System.out.println("status : " + status);
		}
		return status;

	}
}



