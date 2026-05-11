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
Payment System & Flow Control
------------------------------
On Day 3, I enhanced the Toll Management System by implementing a complete payment module with multiple modes like UPI, Cash, and FASTag, along with logic to handle successful, pending, and failed transactions. I added receipt generation displaying vehicle details, toll amount, payment mode, and status, and maintained records for completed, incomplete, and pending payments with total calculations. I also improved the vehicle processing flow using a loop to handle multiple vehicles and fixed issues causing unnecessary repetition, while gaining a better understanding of control flow, condition handling, and modular design.
***ScreenShots:  CONSOLE BASED SAMPLE SCREENSHOTS :-
TOTAL REVENUE CALCULATED CONSIST OF DAILY HOW MUCH PENDING AND NON PENDING PAYEMNTS REPORTS ALONG WITH VEHICLE NUMBERS
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105527" src="https://github.com/user-attachments/assets/d943ff9a-cf4c-4c54-b7ae-24fc738f0762" />
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105634" src="https://github.com/user-attachments/assets/39000450-b838-4c78-a596-7bc70f131647" />
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105556" src="https://github.com/user-attachments/assets/aa93277b-2973-4382-ae63-881657fad14e" />
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105731" src="https://github.com/user-attachments/assets/4fb216b6-95fb-47fc-a90b-954865b7b2e5" />
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105718" src="https://github.com/user-attachments/assets/f3e9d9e2-2ad9-4a8a-9a55-6020ef2e2ba6" />
<img width="1920" height="1080" alt="Screenshot 2026-05-11 105658" src="https://github.com/user-attachments/assets/a681a07b-42a7-453e-a4ea-7917a73401d8" />


