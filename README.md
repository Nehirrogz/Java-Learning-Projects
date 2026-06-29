# Java Learning Journey & Projects

Welcome! I am a Freshman Computer Engineering student. This repository documents my progress in learning Java, containing algorithms, mini-projects, and data structure exercises.

---

## Project Index (Projelerim)

Here is the list of my practice projects. Click on the **"View Code"** link to see the source code.

| Project Name | Description | Source Code |
| :--- | :--- | :---: |
| **1. ATM Application** | A console-based banking simulation using `switch-case` and loops. | [View Code](./AtmProject.java) |
| **2. Number Guessing Game** | A game where the computer picks a random number (0-100) and guides the user. | [View Code](./GuessNumber.java) |
| **3. Geometric Calculator** | A menu-driven system using switch and Math methods to perform calculations and demonstrate control flow (break/continue). | [View Code](./GeometricCalculator.java) |
| 4. Password Checker | A comprehensive validation system using loops and Character methods to enforce multiple password security rules. | [View Code](./PasswordChecker.java) |
| 5. Caesar Cipher | An encryption tool using string manipulation and modular arithmetic to shift characters. | [View Code](./CaesarCipher.java) |
| 6. BattleShip Game | A tactical strategy game using 2D matrices to hunt down hidden ships within a grid. | [View Code](BattleShipGame.java) |
| 7. Hotel Reservation System | A management system using 2D matrices to track and book hotel rooms across multiple floors. | [View Code](./HotelReservation.java) |
| 8. Security Terminal & Logging | A security simulation featuring brute-force protection, 2D matrix logs, and time-stamped incident reporting. | [View Code](./SecurityTerminal.java) |
| 9. Popular Name Statistics | An interactive baby name popularity analyzer that processes CSV data, updates multi-class arrays, and delivers ranked statistics. | [Main Code](./BabyNameAnalyzer.java) / [Class Code](./PopularName.java) |
| 10. Geographic Place Database | A location database application utilizing OOP inheritance and interfaces to manage geographic coordinates and populations. | [Main Code](./PDConsoleIO.java) / [Database](./MyPlaceDatabase.java) / [Interface](./PlaceDB.java) / [Models](./Place.java) |
---

## Project Details

### 1. ATM Application
This project simulates basic banking operations.
* **Key Concepts:** `Scanner`, `do-while` loops, input validation.
* **Logic:** Prevents withdrawing more money than the current balance.

### 2. Number Guessing Game
A fun algorithm practice using random number generation.
* **Key Concepts:** `Math.random()`, infinite `while` loops, counters.
* **Logic:** The loop continues until the user guesses the correct number, giving "Higher/Lower" hints.

### 3. Geometric Calculator
This project simulates a menu-driven calculator, focusing on combining control structures with mathematical functions.
* **Key Concepts:** `while` loop (menu), `switch/case`, `Math.pow()`, `Math.sqrt()`, `continue`, `break` (loop control).
* **Logic:** The main `while` loop keeps the program running until the user selects 'Exit'. Inside the `switch`, it performs two main tasks: (1) Hypotenuse calculation using the `Math` class, and (2) Filtering odd numbers using a `for` loop combined with `continue` (to skip odds).
  
### 4. Password Checker
This project implements a security system that validates a user-provided password against three rules (min 8 characters, must contain at least one digit, and one letter), using a retry mechanism.
* **Key Concepts:** `while` loop (retry), `for` loop (efficient character iteration), `Character.isDigit()`, `Character.isLetter()`, boolean flags, early reporting of failures.
* **Logic:** A central `while` loop ensures the program keeps asking for a new password until all rules are met. A single, optimized `for` loop is used to check for the presence of digits and letters, ensuring the user receives feedback on every failed rule.

### 5. Caesar Cipher
This program allows users to encrypt or decrypt messages based on a numeric key.
* **Key Concepts:** `String` methods, `char` casting, modular arithmetic (`%`), method decomposition.
* **Logic:** Correctly handles alphabet wrapping (e.g., from 'z' to 'a') and validates user inputs before processing.

### 6. BattleShip Game 🚢

This project is a terminal-based implementation of the classic "Battleship" strategy game. It challenges the user to find hidden ships on a grid using coordinates.

* **Key Concepts:** `2D Arrays (Matrices)`, `Math.random()`, `Nested Loops`, `Input Validation`.
* **Logic:**
* **Dual Maps:** Uses two separate 2D arrays; one for the "backend" (hidden ships) and one for the "frontend" (player's view with `~`, `X`, `O`).
* **Random Placement:** Ships are placed randomly at the start using mathematical logic to ensure unique coordinates.
* **Game Loop:** The game continues until all ships are sunk, providing real-time feedback on "Hits" and "Misses".

* ### 7. Hotel Reservation System

This project simulates a real-world hotel management system using multi-dimensional arrays.

* **Key Concepts:** `Scanner`, `2D Arrays` (Matrices), `do-while` loops, `Nested for` loops.
* **Logic:** 
    * **Matrix Mapping:** Maps user-friendly inputs (Floor 1, Room 1) to zero-based computer indices (Index 0,0) to prevent coordinate mismatches.
    * **Availability Tracking:** Uses a `boolean` matrix where `false` represents an available room **[O]** and `true` represents an occupied room **[X]**.
    * **Boundary Protection:** Implements `(length - 2)` limiters in search algorithms to prevent `ArrayIndexOutOfBounds` errors when checking for three consecutive empty rooms.
    * **Efficient Searching:** Utilizes `return` statements to immediately stop search processes once a suitable room or block is found, optimizing performance.
 
* ### 8. Security Terminal & Logging System

This project simulates a real-world security gate. It focuses on how systems track unauthorized access attempts using structured data.

*   **Key Concepts:** `2D Arrays` (Matrices), `java.time.LocalTime`, `Method Parameters`, `Switch-Case`.
*   **Security Features:** Automatically records failed attempts with a timestamp, username, and simulated IP address.
*   **Modular Code:** Includes a dedicated printing method to render logs in a clean, professional table format using escape sequences (`\t`).

*   ### 9. Popular Name Statistics

This project processes baby name popularity data from CSV files and provides searchable statistics.

* **Key Concepts:** `Scanner`, `File` operations, Array of Objects, `bubbleSort`, `linearSearch`, Exception Handling.
* **Logic:** Reads a CSV file twice to dynamically allocate arrays, parses data into custom `PopularName` objects, sorts them alphabetically, and handles interactive name searches with percentage calculation and input validation.
---

### 10. Geographic Place Database

This project implements a modular database application to store, search, and calculate distances between different geographic locations.

* **Key Concepts:** OOP Inheritance (`extends`)[cite: 4, 9], Interface implementation (`implements`), Polymorphism (`instanceof`)[cite: 5], Downcasting[cite: 5], Array Data Storage[cite: 5].
* **Logic:** 
    * Structures data hierarchy using a base `Place` class, a `LocatedPlace` subclass for coordinates[cite: 4], and a `PopulatedPlace` subclass for population metrics[cite: 9].
    * Features custom lookup and listing algorithms by prefix matching and unique input validation to prevent duplicate zip codes[cite: 5].
    * Implements a straight-line distance algorithm by dynamically checking object types via polymorphism and computing geometric distances[cite: 5].
    * Provides a console-driven user interface framework (`PDConsoleIO`) and a standard validation test suite (`Test`)[cite: 3].
*Developed by Nehir - 2025*
