# ATM Interface

![Java](https://img.shields.io/badge/Java-17+-orange)
![OOP](https://img.shields.io/badge/OOP-Project-blue)
![Console Application](https://img.shields.io/badge/Application-Console-green)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

---

# 📌 Project Title

**ATM Interface - Java Console Banking System**

A fully functional console-based ATM simulation developed using Java and Object-Oriented Programming principles. The application allows users to authenticate themselves using a User ID and PIN and perform various banking operations such as deposits, withdrawals, transfers, and transaction history management.

This project was developed as part of the **Oasis Infobyte Java Development Internship Program (OIBSIP)** and demonstrates practical implementation of Java programming concepts including classes, objects, encapsulation, collections, validation, and menu-driven application design.

---

# 📖 Table of Contents

* Introduction
* Project Objective
* Problem Statement
* Features
* Functional Requirements
* Non-Functional Requirements
* System Architecture
* Project Structure
* Technologies Used
* Java Concepts Implemented
* Class Descriptions
* Workflow
* Authentication Module
* Deposit Module
* Withdrawal Module
* Transfer Module
* Transaction History Module
* Sample Execution
* Screenshots
* Installation Guide
* How to Run
* Testing Scenarios
* Future Enhancements
* Learning Outcomes
* Internship Requirements Covered
* Author Information
* License

---

# 📚 Introduction

Automated Teller Machines (ATMs) have become an essential component of modern banking systems. They provide customers with quick and secure access to banking services without requiring direct interaction with bank employees.

This project simulates a real ATM environment where users can securely log in and perform essential banking operations. The application focuses on implementing core banking functionalities while maintaining a simple and user-friendly console interface.

The project emphasizes Object-Oriented Programming (OOP) practices and serves as an excellent learning resource for beginners who want to understand how banking systems work at a fundamental level.

---

# 🎯 Project Objective

The primary objective of this project is to develop a secure and interactive ATM Interface that allows users to:

* Authenticate using User ID and PIN
* Deposit money into their account
* Withdraw money from their account
* Transfer funds to another account
* View transaction history
* Maintain account balance
* Simulate real-world ATM operations

---

# ❗ Problem Statement

Traditional banking operations require customers to visit a bank branch for various services. ATMs solve this problem by providing self-service banking capabilities.

This project recreates those capabilities in software form by implementing:

* User authentication
* Balance management
* Transaction recording
* Fund transfer functionality
* Transaction history tracking

The goal is to provide a realistic ATM experience using Java programming.

---

# ✨ Features

## 🔐 Secure Login System

* User ID based authentication
* PIN verification
* Three login attempts allowed
* Access denied after three failed attempts
* Secure session management

## 💰 Deposit Money

* Deposit any valid amount
* Instant balance update
* Transaction recording
* Deposit confirmation

## 💸 Withdraw Money

* Balance verification
* Insufficient fund handling
* Instant balance deduction
* Withdrawal logging

## 🔄 Fund Transfer

* Transfer money to another account
* Recipient account verification
* Balance validation
* Transfer confirmation
* Transaction recording

## 📜 Transaction History

* Session-based transaction records
* Timestamp support
* Transaction descriptions
* Detailed activity log

## 🚪 Exit System

* Safe application termination
* User-friendly exit message

---

# 📋 Functional Requirements

### FR-1 User Authentication

The system shall:

* Accept User ID
* Accept PIN
* Verify credentials
* Deny access after three failed attempts

### FR-2 Deposit Funds

The system shall:

* Accept deposit amount
* Validate amount
* Update account balance
* Record transaction

### FR-3 Withdraw Funds

The system shall:

* Accept withdrawal amount
* Verify available balance
* Process withdrawal
* Record transaction

### FR-4 Transfer Funds

The system shall:

* Accept recipient account
* Accept transfer amount
* Verify balance
* Process transfer
* Record transaction

### FR-5 Transaction History

The system shall:

* Store transaction records
* Display transaction history
* Show timestamps

---

# ⚙️ Non-Functional Requirements

## Performance

* Fast transaction processing
* Instant balance updates

## Reliability

* Accurate transaction records
* Consistent balance calculations

## Security

* User authentication
* PIN validation
* Login attempt restrictions

## Maintainability

* Modular code structure
* Easy future enhancements

---

# 🏗️ System Architecture

```text
+----------------+
|     User       |
+-------+--------+
        |
        v
+----------------+
|      ATM       |
+-------+--------+
        |
        v
+----------------+
|     Bank       |
+-------+--------+
        |
        v
+----------------+
|   Accounts     |
+-------+--------+
        |
        v
+----------------+
| Transactions   |
+----------------+
```

---

# 📁 Project Structure

```text
OIBSIP/
└── JavaDevelopment-Task3-ATMInterface/
    │
    ├── src/
    │   ├── Main.java
    │   ├── ATM.java
    │   ├── Account.java
    │   ├── Bank.java
    │   └── Transaction.java
    │
    ├── screenshots/
    │   ├── login.png
    │   ├── deposit.png
    │   ├── withdraw.png
    │   ├── transfer.png
    │   └── history.png
    │
    └── README.md
```

---

# 🛠️ Technologies Used

| Technology    | Purpose              |
| ------------- | -------------------- |
| Java          | Programming Language |
| OOP           | System Design        |
| ArrayList     | Transaction Storage  |
| HashMap       | Account Storage      |
| Scanner       | User Input           |
| LocalDateTime | Timestamp Generation |

---

# 💡 Java Concepts Implemented

## Classes and Objects

The project is built using multiple Java classes and objects.

## Encapsulation

Private variables are protected and accessed through methods.

```java
private String userId;
private String pin;
private double balance;
```

## Abstraction

Complex banking operations are hidden behind simple methods.

## Inheritance Ready Design

The project architecture supports future inheritance-based extensions.

## Collections Framework

### ArrayList

Used for transaction history.

```java
ArrayList<Transaction> history
```

### HashMap

Used for storing accounts.

```java
HashMap<String, Account>
```

## Switch Case

Menu navigation is handled using switch-case statements.

## Constructors

Parameterized constructors initialize account data.

---

# 📦 Class Descriptions

## Main Class

Responsibilities:

* Starts application
* Creates bank object
* Creates ATM object
* Handles program initialization

---

## ATM Class

Responsibilities:

* User login
* Menu display
* Deposit processing
* Withdrawal processing
* Fund transfer
* Transaction history

---

## Account Class

Responsibilities:

* Store user details
* Maintain account balance
* Deposit operations
* Withdrawal operations

---

## Bank Class

Responsibilities:

* Store all accounts
* Validate account existence
* Handle transfers

---

## Transaction Class

Responsibilities:

* Store transaction details
* Generate timestamps
* Display transaction information

---

# 🔄 Application Workflow

```text
Start Application
       |
       v
User Login
       |
       v
Authentication Success?
       |
   Yes | No
       |
       v
Main Menu
       |
       +----------------+
       |                |
       v                v
 Deposit          Withdraw
       |                |
       +----------------+
       |
       v
 Transfer
       |
       v
 Transaction History
       |
       v
 Exit
```

---

# 🔐 Authentication Module

The authentication module verifies user credentials.

### Process

1. Enter User ID
2. Enter PIN
3. Verify credentials
4. Grant access
5. Allow maximum three attempts

### Sample Credentials

| User ID | PIN  | Balance |
| ------- | ---- | ------- |
| user1   | 1234 | ₹10000  |
| user2   | 5678 | ₹5000   |
| user3   | 9999 | ₹8000   |

---

# 💰 Deposit Module

The deposit module allows users to add funds.

### Steps

1. Select Deposit
2. Enter amount
3. Validate amount
4. Update balance
5. Record transaction

### Example

```text
Enter Amount: ₹5000
Deposit Successful
Updated Balance: ₹15000
```

---

# 💸 Withdrawal Module

The withdrawal module allows users to withdraw money.

### Steps

1. Select Withdraw
2. Enter amount
3. Check balance
4. Deduct amount
5. Record transaction

### Example

```text
Enter Amount: ₹2000
Withdrawal Successful
Remaining Balance: ₹8000
```

### Insufficient Funds Example

```text
Enter Amount: ₹20000
Insufficient Funds
```

---

# 🔄 Transfer Module

The transfer module enables money transfer between accounts.

### Steps

1. Enter recipient account
2. Enter amount
3. Validate balance
4. Transfer funds
5. Record transaction

### Example

```text
Receiver ID: user2
Amount: ₹1000

Transfer Successful
```

---

# 📜 Transaction History Module

All transactions are stored in an ArrayList.

### Stored Information

* Transaction Type
* Amount
* Timestamp
* Description

### Example

```text
2026-08-15 10:30 | DEPOSIT | ₹5000
2026-08-15 10:35 | WITHDRAW | ₹2000
2026-08-15 10:40 | TRANSFER | ₹1000
```

---

# ▶️ Sample Program Execution

```text
===== ATM SYSTEM =====

Enter User ID: user1
Enter PIN: 1234

Login Successful

===== ATM MENU =====

1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit

Enter Choice: 3

Enter Amount: 5000

Deposit Successful
Updated Balance: ₹15000
```

---

# 📸 Screenshots

Include screenshots of:

* Login Page
* Main Menu
* Deposit Operation
* Withdrawal Operation
* Transfer Operation
* Transaction History
* Successful Login
* Failed Login
* Exit Screen

Store all screenshots inside:

```text

<img width="263" height="180" alt="Login Successful" src="https://github.com/user-attachments/assets/e27d90b5-6d37-4991-a4e6-de5d5531b233" />
<img width="338" height="235" alt="Deposit" src="https://github.com/user-attachments/assets/9f2b73a7-73df-4ace-9f25-fc5d1ab41aba" />
<img width="350" height="218" alt="Withdraw" src="https://github.com/user-attachments/assets/7e40f283-1545-40e2-bdb4-f3d24cb5cc6d" />
<img width="369" height="227" alt="Transfer" src="https://github.com/user-attachments/assets/662e4982-6710-4544-b95d-569253fca08d" />
<img width="822" height="265" alt="Trasaction History" src="https://github.com/user-attachments/assets/0d3e556e-25f6-4f89-b6a6-8d67087bf442" />

```

---

# 🚀 Installation Guide

### Clone Repository

```bash
git clone https://github.com/yourusername/OIBSIP.git
```

### Navigate to Project

```bash
cd JavaDevelopment-Task3-ATMInterface
```

### Compile Files

```bash
javac *.java
```

### Run Program

```bash
java Main
```

---

# 🧪 Testing Scenarios

### Test Case 1

Valid Login

Expected Result:

```text
Login Successful
```

### Test Case 2

Invalid PIN

Expected Result:

```text
Invalid Credentials
```

### Test Case 3

Withdraw More Than Balance

Expected Result:

```text
Insufficient Funds
```

### Test Case 4

Transfer To Valid Account

Expected Result:

```text
Transfer Successful
```

### Test Case 5

View Transaction History

Expected Result:

```text
All session transactions displayed
```

---

# 🔮 Future Enhancements

* MySQL Database Integration
* Persistent Transaction History
* PIN Change Feature
* Account Registration
* Admin Dashboard
* Java Swing GUI
* JavaFX Interface
* Online Banking Features
* Email Notifications
* OTP Verification
* Mini Statement Generation
* Interest Calculation Module
* Multi-user Session Support

---

# 🎓 Learning Outcomes

Through this project, I learned:

* Object-Oriented Programming
* Java Collections Framework
* Authentication Systems
* Banking Logic Implementation
* Data Management
* User Input Handling
* Switch-Case Menus
* HashMap Operations
* ArrayList Management
* Software Design Principles

---

# ✅ Internship Requirements Covered

* User Authentication
* Three Login Attempts
* Deposit Functionality
* Withdrawal Functionality
* Fund Transfer
* Transaction History
* ArrayList Usage
* OOP Design
* Multiple Classes
* Menu-Driven Interface
* GitHub Documentation
* Demo Video Support

---

# 👨‍💻 Author

## Rajesh Patra

**B.Tech - Computer Science & Engineering**

Parala Maharaja Engineering College (PMEC)

Java Development Intern

### Skills

* Java
* Python
* SQL
* HTML
* CSS
* JavaScript
* React
* Node.js
* Machine Learning
* Power BI
* Tableau

### Internship

Oasis Infobyte Java Development Internship Program

---

# 📄 License

This project is developed for educational and internship evaluation purposes under the Oasis Infobyte Internship Program.

---

# ⭐ Support

If you found this project helpful, consider giving the repository a ⭐ on GitHub.

Your support motivates continuous learning and development.

**Thank You for Visiting This Repository!**
