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
---
*Developed by Nehir - 2025*
