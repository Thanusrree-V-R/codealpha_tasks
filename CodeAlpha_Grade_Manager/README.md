# Student Grade Tracker

## Overview

Student Grade Tracker is a Java-based console application designed to manage and analyze student academic performance efficiently. The system enables users to store student records, calculate average grades, identify top and lowest performers, and generate summary reports through an interactive menu-driven interface.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts in Java and serves as a foundational academic management system.

---

## Project Objectives

* Manage student records efficiently.
* Perform grade-related calculations automatically.
* Provide quick academic insights through reports.
* Demonstrate Java programming and OOP principles.
* Build a reusable and extensible academic management application.

---

## Key Features

### Student Management

* Add student records.
* Store student names and grades.
* Maintain records dynamically using ArrayList.

### Academic Analysis

* Calculate average grade.
* Identify the highest-scoring student.
* Identify the lowest-scoring student.

### Reporting

* Display all student records.
* Generate a summary report.
* Present results in a clean console format.

### User-Friendly Interface

* Menu-driven interaction.
* Easy navigation through options.
* Simple and beginner-friendly design.

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList Collection Framework
* VS Code
* Command Line Interface (CLI)

---

## Project Structure

```text
src/
│
├── Main.java
├── Student.java
└── GradeManager.java
```

### Main.java

Handles user interaction and menu operations.

### Student.java

Represents individual student records containing:

* Student Name
* Student Grade

### GradeManager.java

Contains the core business logic for:

* Adding students
* Displaying records
* Calculating statistics
* Generating reports

---

## Functionalities

### Add Student

Users can enter:

* Student Name
* Student Grade

### View All Students

Displays every student stored in the system.

### Show Average Grade

Calculates the average grade of all students.

### Show Highest Grade

Displays the student with the highest score.

### Show Lowest Grade

Displays the student with the lowest score.

### Summary Report

Provides:

* Student List
* Average Grade
* Highest Grade
* Lowest Grade

---

## Sample Output

```text
STUDENT GRADE TRACKER

1. Add Student
2. View All Students
3. Show Average Grade
4. Show Highest Grade
5. Show Lowest Grade
6. Show Summary Report
7. Exit
```

### Example Summary Report

```text
STUDENT SUMMARY REPORT

Name: Thanusrree    Grade: 85.00
Name: Arjun         Grade: 90.00
Name: Shraddha      Grade: 80.00
Name: Aayush        Grade: 60.00

Average Grade: 78.75
Highest Grade: 90.00 (Arjun)
Lowest Grade: 60.00 (Aayush)
```

---

## How to Run

### Compile

```bash
javac *.java
```

### Execute

```bash
java Main
```

---

## Concepts Demonstrated

* Classes and Objects
* Constructors
* Encapsulation
* Collections Framework
* Method Design
* Data Processing
* User Input Handling
* Modular Programming
* Java Console Applications

---

## Future Enhancements

* Grade Categorization (A, B, C, D)
* Student Search Functionality
* Student Record Editing
* File-Based Data Storage
* Database Integration
* GUI Version using JavaFX or Swing
* Graphical Performance Analysis

---

## Project Significance

This project demonstrates the implementation of a real-world academic record management system using Java. It highlights problem-solving skills, software design principles, and the practical use of data structures for managing and analyzing information.

The project serves as a strong beginner-level portfolio project and showcases foundational software engineering skills including coding, debugging, testing, and project organization.

---

## Author

**Thanusrree V R**

Engineering Student

Areas of Interest:

* Java Development
* Software Engineering
* Artificial Intelligence
* Problem Solving
* Application Development

---

## License

This project is intended for educational and learning purposes.
