🚗 Toll Management System (Java - Console Based)
📌 Project Overview

This is a console-based Toll Management System developed using Java. The application simulates how toll gates work by managing vehicle entries, calculating toll charges based on vehicle type and peak hours, and processing payments.

The project is built using Object-Oriented Programming (OOP) concepts such as:

Encapsulation
Inheritance
Method abstraction
🎯 Features
Accept vehicle details (Number, Type, Entry Time)
Validate vehicle number using regex (AP format)
Calculate toll based on:
Vehicle type
Peak hour timing
Support multiple payment modes:
Cash
UPI
FASTag
Generate receipt after successful payment
Track:
Completed payments
Incomplete payments
Total revenue
🛠️ Tech Stack
Java
OOP Concepts
Console-based UI
📅 Development Progress
🟢 Day 1: Project Setup & Basic Flow

On the first day, I focused on building the foundation of the project.

Work Done:
Created project structure with packages (com.vehicleToll)
Implemented main class (vehicleMain)
Designed console interaction to:
Accept vehicle number
Accept vehicle type
Accept entry time
Created Vehicle class with:
Fields for vehicle details
Method to store data (setVehicleDetails)
Method to display vehicle info
Implemented vehicle number validation using regex:
Format: AP00AA0000
Established initial program flow:
Input → Store → Display

👉 Outcome: Basic working program that accepts and validates vehicle details.

🟡 Day 2: Toll Calculation & Business Logic

On the second day, I added core logic for toll calculation.

Work Done:
Created Toll class for handling pricing logic
Implemented toll calculation based on:
Vehicle types:
Car
Bike
Bus
Auto
Truck / Container
Ambulance
Electric Vehicle
Peak hour charges
Added peak hour logic:
Morning peak (9:00 - 11:30)
Evening peak (4:30 - 6:30)
Normal hours

Calculated total toll:

Total Toll = Base Toll + Peak Charge
Displayed toll breakdown:
Base toll
Peak charge
Total amount

👉 Outcome: System can now calculate toll dynamically based on vehicle type and timing.
