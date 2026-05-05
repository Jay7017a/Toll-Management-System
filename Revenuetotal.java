package com.vehicleToll;

public class Revenuetotal extends Payment{
static void fullCompletedVehiclesPayament() {
	System.out.println();
	System.out.println("-----TOTAL REVENUE-------");
	System.out.println("Vehicles List Completed Payment 		  : "+vehiclesCompletedPayment);
	System.out.println("Count of Vehicles Payment Done 			  : "+countvehiclesPaymentDone);
	System.out.println("Total Revenue On Completed Vehicles Payment: "+totalCompletedvehiclesPayment);

}
static void incompletedVehiclesList() {
	if((int)unCompleteVehiclesPaymentTotal!=0) {
	System.out.println(vehiclesPaymentInComplete);
	System.out.println(unCompleteVehiclesPaymentTotal);
	
}
}
}