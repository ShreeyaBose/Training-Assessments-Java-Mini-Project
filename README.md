# Training-Assessments-Java-Mini-Project
FinSafe – Transaction Processor 

FinSafe is a console-based Java application that simulates a digital wallet system. It ensures secure and validated transactions by preventing overdrafts and handling invalid inputs with proper error handling.

Problem Statement: Transaction Processor that validates every Spend request against the user's current balance and logs every action for auditing purposes.


FinSafe provides a robust Transaction Processor that:
1. Validates every transaction before execution
2. Prevents overdraft (no negative balance allowed)
3. Throws custom exceptions for insufficient funds
4. Maintains last 5 transactions
5. Ensures proper error handling

Features:
1. Deposit Money
2. Withdraw Money (with validation)
3. View Mini Statement (last 5 transactions)
4. Check Current Balance
5. Error Handling
   a. Negative amount → `IllegalArgumentException`
   b. Insufficient balance → Custom Exception

Concepts Used:

| Concept          | Description                                   |
| ---------------- | --------------------------------------------- |
| Encapsulation    | Protects account data using private variables |
| Custom Exception | Handles insufficient funds scenario           |
| Validation Logic | Ensures correct transaction processing        |
| ArrayList        | Stores last 5 transactions                    |
| OOP              | Models real-world banking system              |


System Flow:
1. User selects an option:
   a. Deposit
   b. Withdraw
   c. View History
   d. Check Balance
2. System:
   a. Validates input
   b. Processes transaction
   c. Updates balance
   d. Stores transaction
   e. Displays output or error

Tech Stack: Java

Project Structure:

```id="4s4frc"
FinSafe/
│── FinSafeApp.java   # Main application file
```

How to Run:
1. Compile the program

```bash id="6v7tt9"
javac FinSafeApp.java
```

2. Run the program

```bash id="qczdqm"
java FinSafeApp
```
Output:

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/5f8dd558-057e-4992-93df-712ba926a5e7" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/7ed99492-c3c2-4dbe-9d86-0c9a4150e2dc" />



