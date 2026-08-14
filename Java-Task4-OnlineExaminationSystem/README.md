# Online Examination System

![Java](https://img.shields.io/badge/Java-17-orange)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![Database](https://img.shields.io/badge/Database-SQLite-green)
![Status](https://img.shields.io/badge/Project-Completed-success)

## 📌 Project Overview

The **Online Examination System** is a desktop-based application developed using **Java Swing** and **SQLite Database**. The system provides a complete examination environment where students can securely log in, update their profile information, take a timed multiple-choice examination, and receive detailed performance analysis after submission.

The application simulates a real-world online examination platform by implementing authentication, question navigation, answer tracking, countdown timer functionality, automatic submission, and result generation.

This project demonstrates the practical application of **Object-Oriented Programming (OOP)** concepts, **GUI development**, **event-driven programming**, **database connectivity**, and **software engineering principles** using Java.

---

# 🎯 Objectives

The primary objectives of this project are:

- Develop a user-friendly examination platform.
- Implement secure login functionality.
- Provide profile management features.
- Conduct timed examinations.
- Automatically submit examinations when time expires.
- Generate detailed examination reports.
- Store and manage user data using SQLite.
- Demonstrate Java Swing GUI development.
- Apply Object-Oriented Programming concepts.
- Simulate a real online assessment environment.

---

# 🚀 Features

## 🔐 User Authentication

The system provides secure login functionality for users.

### Functionalities

- Username and password authentication
- Database verification using SQLite
- Invalid login detection
- User session management
- Secure access to examination module

---

## 👤 Profile Management

Before starting the examination, users can update their profile information.

### Functionalities

- Change display name
- Update password
- Save profile changes
- Maintain user session

---

## 📝 Online Examination Module

The examination module provides an interactive interface for answering questions.

### Functionalities

- One question displayed at a time
- Four multiple-choice options
- Radio button-based answer selection
- Previous question navigation
- Next question navigation
- Automatic answer saving
- Question tracking

---

## ⏱ Countdown Timer

A real-time countdown timer manages examination duration.

### Functionalities

- 30-minute timer
- Live countdown display
- Real-time updates every second
- Automatic submission when timer expires
- Accurate time tracking

---

## 📤 Submission System

Students can submit examinations manually or automatically.

### Functionalities

- Manual submission button
- Confirmation dialog before submission
- Automatic submission on timeout
- Final answer storage

---

## 📊 Result Analysis

After submission, students receive detailed performance reports.

### Functionalities

- Total score calculation
- Correct answers count
- Incorrect answers count
- Time taken calculation
- Question-wise analysis
- Performance summary

---

## 🔒 Session Protection

The application prevents accidental termination during examinations.

### Functionalities

- Window close confirmation
- Exit protection
- Unsaved work prevention
- Session integrity

---

## 🚪 Logout Functionality

Users can safely logout after completing the examination.

### Functionalities

- Session termination
- Return to login page
- Clean application workflow

---

# 🏗 System Architecture

```text
+-------------------+
|   Login Screen    |
+-------------------+
          |
          v
+-------------------+
| Profile Screen    |
+-------------------+
          |
          v
+-------------------+
| Examination Page  |
+-------------------+
          |
          v
+-------------------+
| Result Screen     |
+-------------------+
          |
          v
+-------------------+
| Logout            |
+-------------------+
```

---

# 💻 Technology Stack

| Technology | Purpose |
|------------|----------|
| Java | Core Programming Language |
| Java Swing | GUI Development |
| SQLite | Database Management |
| JDBC | Database Connectivity |
| OOP | Application Design |
| Eclipse/IntelliJ | Development Environment |
| Git | Version Control |
| GitHub | Project Hosting |

---

# 📂 Project Structure

```text
OnlineExaminationSystem
│
├── src
│   │
│   ├── Main.java
│   ├── LoginFrame.java
│   ├── ProfileFrame.java
│   ├── ExamFrame.java
│   ├── ResultFrame.java
│   ├── Question.java
│   ├── User.java
│   ├── ExamManager.java
│   ├── TimerManager.java
│   ├── DatabaseManager.java
│   └── Utils.java
│
├── screenshots
│   ├── login.png
│   ├── profile.png
│   ├── exam.png
│   └── result.png
│
├── database
│   └── exam.db
│
└── README.md
```

---

# 📖 Class Description

## Main.java

Responsible for launching the application.

### Responsibilities

- Initialize database
- Launch login screen
- Start application execution

---

## LoginFrame.java

Handles authentication functionality.

### Responsibilities

- User login
- Credential validation
- Error handling
- Navigation to profile page

---

## ProfileFrame.java

Manages user profile information.

### Responsibilities

- Update display name
- Update password
- Save profile data
- Start examination

---

## ExamFrame.java

Core examination interface.

### Responsibilities

- Display questions
- Manage navigation
- Store answers
- Timer integration
- Submit examination

---

## ResultFrame.java

Displays examination results.

### Responsibilities

- Calculate score
- Generate report
- Display performance statistics
- Logout functionality

---

## Question.java

Question model class.

### Responsibilities

- Store question text
- Store options
- Store correct answer

---

## User.java

User model class.

### Responsibilities

- Store username
- Store password
- Store display name

---

## ExamManager.java

Controls examination logic.

### Responsibilities

- Load questions
- Save answers
- Calculate score
- Generate breakdown

---

## TimerManager.java

Handles timer functionality.

### Responsibilities

- Countdown timer
- Time tracking
- Auto submission trigger

---

## DatabaseManager.java

Handles database operations.

### Responsibilities

- User authentication
- Profile updates
- Database connection
- Table creation

---

## Utils.java

Utility methods.

### Responsibilities

- Time formatting
- Common helper methods

---

# 🗄 Database Design

## Users Table

```sql
CREATE TABLE users(
    username TEXT PRIMARY KEY,
    password TEXT,
    displayName TEXT
);
```

---

## Sample Data

```sql
INSERT INTO users
VALUES(
'admin',
'1234',
'Student'
);
```

---

# 🔄 Application Workflow

### Step 1

User launches application.

### Step 2

Login screen appears.

### Step 3

User enters username and password.

### Step 4

Credentials are validated.

### Step 5

Profile screen opens.

### Step 6

User updates profile information.

### Step 7

User starts examination.

### Step 8

Questions appear one by one.

### Step 9

Timer starts counting down.

### Step 10

User answers questions.

### Step 11

User submits examination or timer expires.

### Step 12

Result screen displays performance.

### Step 13

User logs out.

---

# 📸 Screenshots

## Login Screen

<img width="539" height="356" alt="Screenshot 2026-08-15 005535" src="https://github.com/user-attachments/assets/77ca1317-2090-4812-a31d-52706fa9abba" />
<img width="542" height="364" alt="Screenshot 2026-08-15 005552" src="https://github.com/user-attachments/assets/6fa860d2-f204-4c31-b312-0b47e0e116aa" />


---

## Profile Update Screen

<img width="603" height="416" alt="Screenshot 2026-08-15 005613" src="https://github.com/user-attachments/assets/f9dc0cbf-ff90-4dc5-b68b-e66f1ddd86c1" />

---

## Examination Screen

<img width="1045" height="679" alt="Screenshot 2026-08-15 005653" src="https://github.com/user-attachments/assets/fb8a3151-dd10-465c-93a2-31b4fe76b2fe" />
<img width="1041" height="674" alt="Screenshot 2026-08-15 005718" src="https://github.com/user-attachments/assets/ac6da29a-1945-41f6-a3b2-62608ff05d3d" />

---

## Result Screen

<img width="852" height="678" alt="Screenshot 2026-08-15 005510" src="https://github.com/user-attachments/assets/30d5a4c0-0f1a-43ff-b999-45fbbe7dfb98" />


---

# ⚙ Installation Guide

## Prerequisites

- Java JDK 8 or above
- SQLite JDBC Driver
- Eclipse IDE / IntelliJ IDEA
- Git

---

## Clone Repository

```bash
git clone https://github.com/Rajeshpatra12/OIBSIP.git
```

---

## Open Project

```bash
Import Project
→ Existing Java Project
→ Select Folder
```

---

## Add SQLite Driver

```text
Project
→ Properties
→ Java Build Path
→ Libraries
→ Add External JAR
```

Select:

```text
sqlite-jdbc.jar
```

---

## Run Project

```text
Run Main.java
```

---

# 🧪 Testing

### Login Testing

- Valid credentials
- Invalid credentials
- Empty fields

### Profile Testing

- Update name
- Update password

### Examination Testing

- Question navigation
- Answer saving
- Timer accuracy

### Result Testing

- Score calculation
- Time calculation
- Breakdown generation

---

# 📈 Future Enhancements

The following features can be added in future versions:

### Student Registration

Allow users to create accounts.

### Admin Dashboard

Manage users and questions.

### Question Randomization

Shuffle questions for each student.

### Negative Marking

Penalty for incorrect answers.

### Subject-Based Tests

Multiple subjects support.

### Leaderboard

Rank students based on scores.

### Cloud Database

MySQL/PostgreSQL integration.

### Result Export

Export results as PDF.

### Email Notifications

Send result reports via email.

### Dark Mode

Modern user interface.

---

# 🎓 Learning Outcomes

Through this project, the following skills were developed:

- Java Programming
- Java Swing GUI Development
- JDBC Connectivity
- SQLite Database Management
- Event Handling
- Object-Oriented Programming
- Software Design
- Exception Handling
- Session Management
- Timer Implementation
- Application Development
- Version Control using Git
- GitHub Project Management

---

# 🌟 Key Highlights

✅ Secure Login System

✅ Profile Management Module

✅ Timed Examination Environment

✅ Automatic Submission

✅ Detailed Result Analysis

✅ SQLite Database Integration

✅ User-Friendly Interface

✅ Object-Oriented Design

✅ Session Management

✅ Real-Time Countdown Timer

---

# 📚 References

- Oracle Java Documentation
- Java Swing Documentation
- SQLite Documentation
- JDBC API Documentation
- Object-Oriented Programming Concepts
- Software Engineering Principles

---

# 👨‍💻 Author

**Rajesh Patra**

B.Tech – Computer Science & Engineering

Parala Maharaja Engineering College (PMEC)

Java Development Intern

Oasis Infobyte

---

# 🙏 Acknowledgement

I would like to express my sincere gratitude to **Oasis Infobyte** for providing this internship opportunity and allowing me to enhance my practical skills in Java development, GUI design, database integration, and software engineering through this project.

The experience gained during the development of this project has significantly improved my understanding of real-world software development practices and strengthened my problem-solving abilities.

---

## ⭐ If you found this project useful, consider giving it a star on GitHub.
