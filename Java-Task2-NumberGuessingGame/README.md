# Number Guessing Game - Java Console Application

## Overview

The Number Guessing Game is a console-based Java application designed to provide an interactive and engaging gaming experience. The program generates a random number within a specified range, and the player must guess the number within a limited number of attempts. After each guess, the system provides feedback indicating whether the guessed number is too high, too low, or correct.

This project demonstrates the practical implementation of core Java concepts such as loops, conditional statements, user input handling, random number generation, collections, and object-oriented programming principles. Additionally, the application includes multiple difficulty levels, score tracking, round summaries, and replay functionality to enhance user engagement.

---

## Project Objectives

The primary objectives of this project are:

* Develop a console-based interactive game using Java.
* Implement random number generation using the Random class.
* Practice decision-making using conditional statements.
* Utilize loops for continuous game execution.
* Manage user input through the Scanner class.
* Track player performance across multiple rounds.
* Provide different difficulty levels to increase challenge and replay value.
* Demonstrate problem-solving and logical programming skills.

---

## Features

### 1. Random Number Generation

The system automatically generates a random number at the beginning of each round. The number is hidden from the user and must be guessed through trial and error.

### 2. Difficulty Levels

The game offers three difficulty levels:

| Difficulty | Number Range | Maximum Attempts |
| ---------- | ------------ | ---------------- |
| Easy       | 1 - 50       | 10               |
| Medium     | 1 - 100      | 7                |
| Hard       | 1 - 200      | 5                |

### 3. User Guess Input

Players enter their guesses through the console using the Scanner class.

### 4. Hint System

After each guess, the system provides feedback:

* Too High!
* Too Low!
* Correct!

These hints help players narrow down the possible number range.

### 5. Attempt Tracking

The application keeps track of the number of attempts made during each round and displays the remaining attempts.

### 6. Win/Loss Conditions

#### Winning Condition

The player wins if the correct number is guessed within the allotted attempts.

#### Losing Condition

The player loses if all attempts are exhausted before guessing the correct number.

### 7. Play Again Functionality

After each round, users can choose to start a new game or exit the application.

### 8. Scoreboard Management

The game stores round results and displays a summary when the player exits.

Example:

```text
Round 1 - Guessed in 3 attempts
Round 2 - Failed
Round 3 - Guessed in 5 attempts
```

---

## Technology Stack

### Programming Language

* Java

### Development Environment

* Eclipse IDE / IntelliJ IDEA / VS Code

### Libraries Used

#### java.util.Scanner

Used to accept user input from the console.

#### java.util.Random

Used to generate random numbers.

#### java.util.ArrayList

Used to store and display round-wise scores.

---

## Project Structure

```text
Java-Task1-NumberGuessingGame/
│
├── NumberGuessingGame.java
├── README.md
│
└── screenshots/
    ├── game_start.png
    ├── gameplay.png
    ├── winning_screen.png
    ├── losing_screen.png
    └── summary_screen.png
```

---

## System Workflow

### Step 1

The application starts and displays the game menu.

### Step 2

The player selects a difficulty level.

### Step 3

The system generates a random secret number.

### Step 4

The player enters a guess.

### Step 5

The system compares the guess with the secret number.

### Step 6

One of the following messages is displayed:

* Too High!
* Too Low!
* Correct!

### Step 7

The process repeats until:

* The player guesses correctly, or
* The maximum attempts are reached.

### Step 8

The result is recorded in the scoreboard.

### Step 9

The player chooses whether to play another round.

### Step 10

Upon exiting, the game summary is displayed.

---

## Algorithm

### Start

1. Display welcome message.
2. Initialize round counter.
3. Display difficulty options.
4. Read difficulty selection.
5. Set number range and attempt limit.
6. Generate random number.
7. Initialize attempt counter.
8. Accept user guess.
9. Compare guess with generated number.
10. Display hint.
11. Repeat until:

    * Correct guess, or
    * Attempt limit reached.
12. Store result.
13. Ask user whether to play again.
14. If yes, start new round.
15. If no, display score summary.
16. End program.

---

## Sample Output

### Winning Scenario

```text
==================================
NUMBER GUESSING GAME
==================================

Select Difficulty:
1. Easy
2. Medium
3. Hard

Enter choice: 2

Round 1

Guess the number between 1 and 100

Attempts Left: 7
Enter Guess: 50

Too High!

Attempts Left: 6
Enter Guess: 25

Too Low!

Attempts Left: 5
Enter Guess: 35

Correct!

You guessed the number in 3 attempts.
```

---

### Losing Scenario

```text
Round 2

Guess the number between 1 and 100

Attempts Left: 7
Enter Guess: 10

Too Low!

Attempts Left: 6
Enter Guess: 20

Too Low!

Attempts Left: 5
Enter Guess: 30

Too Low!

Attempts Left: 4
Enter Guess: 40

Too Low!

Attempts Left: 3
Enter Guess: 50

Too High!

Attempts Left: 2
Enter Guess: 45

Too High!

Attempts Left: 1
Enter Guess: 43

Too High!

You Lost!

The correct number was: 42
```

---

## Learning Outcomes

By completing this project, the following Java concepts are reinforced:

### Core Java Concepts

* Variables and Data Types
* User Input Handling
* Random Number Generation
* Conditional Statements
* Loops
* Collections
* Methods
* Object-Oriented Programming Basics

### Problem Solving Skills

* Logical Thinking
* Algorithm Design
* Decision Making
* Flow Control

### Software Development Skills

* Project Structuring
* Documentation
* Version Control using GitHub
* Testing and Debugging

---

## Future Enhancements

The project can be further enhanced with:

### Graphical User Interface

Develop a Swing-based GUI version using:

* JFrame
* JButton
* JTextField
* JLabel

### Timer Feature

Add countdown timers for each guess.

### Database Integration

Store scores and player records in:

* MySQL
* PostgreSQL
* SQLite

### Multiplayer Mode

Allow multiple users to compete in the same game.

### Leaderboard System

Maintain rankings based on player performance.

### Sound Effects

Add audio feedback for wins, losses, and hints.

### Difficulty Customization

Allow users to define custom ranges and attempt limits.

---

## Testing

The application was tested for:

| Test Case                | Expected Result       | Status |
| ------------------------ | --------------------- | ------ |
| Correct Guess            | Display "Correct!"    | Passed |
| High Guess               | Display "Too High!"   | Passed |
| Low Guess                | Display "Too Low!"    | Passed |
| Maximum Attempts Reached | Display Loss Message  | Passed |
| Play Again Option        | Start New Round       | Passed |
| Score Tracking           | Display Round Summary | Passed |

---

## GitHub Repository

All internship tasks are maintained within a single repository:

```text
OIBSIP/
└── Java-Task2-NumberGuessingGame/
```

The repository contains:

* Source Code
* README Documentation
* Screenshots
* Project Demonstration Assets

---

## Author

**Rajesh Patra**

B.Tech in Computer Science & Engineering
Parala Maharaja Engineering College (PMEC)
Berhampur, Odisha, India

### Skills

* Java
* Python
* HTML
* CSS
* JavaScript
* React
* Node.js
* MongoDB
* SQL
* Machine Learning
* Power BI
* Tableau
* Selenium
* Postman

### Internship Program

**Oasis Infobyte Java Development Internship**

---

## Conclusion

The Number Guessing Game is a beginner-friendly Java project that effectively demonstrates fundamental programming concepts while providing an enjoyable user experience. Through random number generation, conditional logic, loops, user interaction, and score management, the project showcases practical software development skills and serves as a strong foundation for more advanced Java applications.
