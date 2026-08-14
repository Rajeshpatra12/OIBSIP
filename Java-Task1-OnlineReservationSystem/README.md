# Online Reservation System

## Project Overview

The Online Reservation System is a desktop-based Java application developed using Java Swing, JDBC, and SQLite. The system is designed to simulate a real-world train reservation platform where users can securely log in, reserve tickets, generate unique PNR numbers, retrieve booking details, and cancel reservations.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP), Graphical User Interface (GUI) development, database management, and CRUD operations. It provides a user-friendly interface for managing reservations while ensuring data integrity and security through JDBC PreparedStatement-based database interactions.

The application was developed as part of the Oasis Infobyte Java Development Internship Program and focuses on applying core Java concepts to build a complete desktop application.

---

# Table of Contents

1. Project Overview
2. Features
3. Technologies Used
4. System Architecture
5. Project Structure
6. Database Design
7. Application Workflow
8. Modules Description
9. Screenshots
10. Installation Guide
11. How to Run
12. Testing Scenarios
13. Security Features
14. Learning Outcomes
15. Future Enhancements
16. Conclusion
17. Author

---

# Features

### Authentication Module

* Secure user login
* Username and password verification
* Invalid credential handling
* Access control before reservation operations

### Reservation Module

* Passenger information entry
* Train number validation
* Automatic train name population
* Journey date selection
* Source and destination station entry
* Class selection
* Reservation confirmation

### PNR Generation

* Automatic unique PNR generation
* Timestamp-based uniqueness
* Reservation tracking support

### Database Integration

* SQLite database connectivity
* JDBC implementation
* Automatic table creation
* Persistent reservation storage

### Reservation Retrieval

* Search booking using PNR number
* Display complete reservation details
* Quick reservation lookup

### Cancellation Module

* Fetch reservation before cancellation
* Confirmation dialog
* Permanent reservation removal
* User-friendly cancellation process

### Validation Features

* Empty field validation
* Numeric train number validation
* Date format validation
* Error message handling

### Security Features

* PreparedStatement implementation
* SQL Injection prevention
* Controlled database access
* Secure login verification

---

# Technologies Used

## Programming Language

* Java

## GUI Framework

* Java Swing

## Database

* SQLite

## Database Connectivity

* JDBC (Java Database Connectivity)

## Development Environment

* Eclipse IDE / IntelliJ IDEA

## Version Control

* Git
* GitHub

---

# System Architecture

```text
+---------------------+
|      User GUI       |
+----------+----------+
           |
           v
+---------------------+
|  Swing Forms Layer  |
+----------+----------+
           |
           v
+---------------------+
| Business Logic Layer|
+----------+----------+
           |
           v
+---------------------+
| Reservation Service |
+----------+----------+
           |
           v
+---------------------+
| JDBC Connectivity   |
+----------+----------+
           |
           v
+---------------------+
| SQLite Database     |
+---------------------+
```

---

# Project Structure

```text
OnlineReservationSystem
│
├── src
│   │
│   ├── database
│   │   └── DBConnection.java
│   │
│   ├── model
│   │   └── Reservation.java
│   │
│   ├── service
│   │   └── ReservationService.java
│   │
│   ├── util
│   │   ├── PNRGenerator.java
│   │   └── ValidationUtil.java
│   │
│   ├── gui
│   │   ├── LoginForm.java
│   │   ├── Dashboard.java
│   │   ├── ReservationForm.java
│   │   └── CancellationForm.java
│   │
│   └── Main.java
│
├── reservation.db
├── screenshots
├── README.md
└── sqlite-jdbc.jar
```

---

# Database Design

## Users Table

```sql
CREATE TABLE users(
    username TEXT PRIMARY KEY,
    password TEXT NOT NULL
);
```

### Default User

```text
Username : admin
Password : admin123
```

---

## Reservations Table

```sql
CREATE TABLE reservations(
    pnr TEXT PRIMARY KEY,
    passenger_name TEXT,
    train_number INTEGER,
    train_name TEXT,
    class_type TEXT,
    journey_date TEXT,
    source_station TEXT,
    destination_station TEXT
);
```

---

# Application Workflow

### Step 1

User launches application.

### Step 2

Login screen appears.

### Step 3

User enters username and password.

### Step 4

System validates credentials.

### Step 5

Dashboard opens after successful login.

### Step 6

User enters reservation details.

### Step 7

System validates inputs.

### Step 8

Unique PNR is generated.

### Step 9

Reservation is stored in SQLite database.

### Step 10

Booking confirmation dialog appears.

### Step 11

User can fetch reservation using PNR.

### Step 12

User can cancel reservation if required.

---

# Modules Description

## DBConnection Module

Responsibilities:

* Establish database connection
* Create tables automatically
* Initialize database
* Manage SQLite connectivity

---

## Login Module

Responsibilities:

* User authentication
* Access validation
* Error handling

---

## Reservation Module

Responsibilities:

* Accept reservation details
* Validate inputs
* Generate PNR
* Save booking

---

## Reservation Service Module

Responsibilities:

* Execute SQL queries
* Insert reservations
* Retrieve reservations
* Delete reservations

---

## Cancellation Module

Responsibilities:

* Search reservation
* Display booking information
* Cancel reservation
* Update database

---

# Screenshots

Add screenshots in the following sequence:

### Login Page

```text
screenshots/login.png
```

### Dashboard

```text
screenshots/dashboard.png
```

### Reservation Form

```text
screenshots/reservation_form.png
```

### Booking Confirmation

```text
screenshots/booking_success.png
```

### Fetch Reservation

```text
screenshots/fetch_reservation.png
```

### Cancellation Confirmation

```text
screenshots/cancel_reservation.png
```

### SQLite Database

```text
screenshots/database_records.png
```

---

# Installation Guide

## Step 1

Install Java JDK 17 or higher.

Verify installation:

```bash
java -version
javac -version
```

---

## Step 2

Download SQLite JDBC Driver.

Add the JAR file to your project libraries.

---

## Step 3

Import project into Eclipse or IntelliJ.

---

## Step 4

Build the project.

---

## Step 5

Run Main.java.

---

# How to Run

1. Open project in Eclipse.
2. Add SQLite JDBC Driver.
3. Run Main.java.
4. Login using default credentials.
5. Create reservation.
6. Generate PNR.
7. Retrieve reservation.
8. Cancel reservation if required.

---

# Testing Scenarios

## Login Testing

### Valid Login

Input:

```text
admin
admin123
```

Expected Result:

```text
Login Successful
```

---

### Invalid Login

Input:

```text
admin
wrongpassword
```

Expected Result:

```text
Invalid Username or Password
```

---

## Reservation Testing

### Empty Fields

Expected:

```text
All Fields Are Required
```

---

### Invalid Date

Expected:

```text
Invalid Date Format
```

---

### Successful Booking

Expected:

```text
Reservation Successful
```

---

## Cancellation Testing

### Valid PNR

Expected:

```text
Reservation Details Displayed
```

---

### Invalid PNR

Expected:

```text
PNR Not Found
```

---

# Security Features

## PreparedStatement

Used in all database operations.

Benefits:

* Prevents SQL Injection
* Improves query handling
* Enhances security

Example:

```java
PreparedStatement ps =
conn.prepareStatement(
"SELECT * FROM users WHERE username=? AND password=?"
);
```

---

## Input Validation

* Empty value checks
* Numeric validation
* Date validation
* Controlled user input

---

# Learning Outcomes

Through this project, the following concepts were learned and implemented:

* Java Programming
* Object-Oriented Programming
* Java Swing GUI Development
* Event Handling
* JDBC Connectivity
* SQLite Database Management
* CRUD Operations
* Input Validation
* Exception Handling
* Software Design Principles
* Git and GitHub Version Control

---

# Future Enhancements

The following features can be added in future versions:

* User Registration
* Password Encryption
* Admin Dashboard
* Seat Availability Management
* Fare Calculation
* PDF Ticket Generation
* Email Notifications
* Online Payment Integration
* Multi-user Support
* Reservation History
* Search and Filter Functionality
* Cloud Database Support

---

# Author

**Rajesh Patra**

B.Tech Computer Science & Engineering

Parala Maharaja Engineering College (PMEC)

Oasis Infobyte Java Development Intern

GitHub: https://github.com/Rajeshpatra12/OIBSIP

LinkedIn: https://www.linkedin.com/in/rajesh-patra-558334260/

---

# Conclusion

The Online Reservation System successfully demonstrates the integration of Java Swing, JDBC, and SQLite to build a complete desktop reservation management application. The system provides a practical solution for ticket booking and cancellation while implementing software engineering best practices, database operations, validation techniques, and secure coding standards.

The project serves as an excellent example of a real-world Java desktop application and highlights the use of Object-Oriented Programming principles, database connectivity, and user-friendly interface design.

---


