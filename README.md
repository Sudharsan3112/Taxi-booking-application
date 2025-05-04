# 🚕 Taxi Booking Application

A simple Java-based console application that simulates a taxi booking system with multiple taxis and smart allocation logic. It helps users book the most optimal taxi based on availability, location, and earnings.

## 📌 Features

- Allows booking taxis based on pickup/drop locations and time
- Smart taxi allocation (chooses nearest available taxi with least earnings in case of a tie)
- Maintains history of all taxi bookings
- Displays detailed booking records
- Supports up to 4 taxis by default (can be configured)

## 🧠 Booking Logic

When a user tries to book a taxi:
1. Only taxis available (free before pickup time) are considered.
2. Among available taxis, the closest one to the pickup point is chosen.
3. If multiple taxis are at the same distance, the one with the **least earnings** is selected.
4. Earnings and travel time are calculated based on distance.

## 💡 How Fare is Calculated

- Base fare: ₹100
- ₹10 per km (after 5 km)
- 1 unit distance = 1 km (e.g., A to C = 2 km)

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Cloning and Deep Copy (`Cloneable` interface)
- Console-based Input/Output

## 🧾 Sample Output

```bash
1. For Booking Taxi
2. Displaying TaxiBookings History
3. Exit
Enter Your Choice:
1
Enter pick up Location
A
Enter Drop Location
C
Enter Pickup Time
2
Taxi number 1 is booked
