# Food-Ordering-System
This project is a food ordering application developed in Java as part of the Object-Oriented Development with Java (OODJ) coursework at my university.

# Description
The system allows different types of users to interact within a food court management system, enabling order placement, payment, tracking, and delivery services. I followed Object-Oriented Programming principles, incorporating Encapsulation, Inheritance, Polymorphism, and Abstraction. Data storage is managed using text files.

# Administrator Role (Developed by Umidjon Eshchanov)
As the Administrator, I was resposible for implementing and managing the administrative functionalities, including:

1. **User Management**:
   * Register new users (Customer, Vendors, Runners).
   * Updatre user details such as usernames and email addresses.
   * Delete users from the system, ensuring data consistency.
2. **Credit System Management**:
   * Top-up customer credit balance, allowing them to place food orders.
   * Ensure validation so that incorrect input does not corrupt stored data.
   * Update wallets.txt file in real time to reflect the correct balances.
3. **Transaction Management**:
   * Generate transaction receipts for each successful top-up or payment.
   * Store receipt details in receipts.txt to maintain financial records.
   * Send receipts to customers as confirmation of their transactions.
4. **System Security & Validation**:
   * Implement login validation with case-insensitive username checks.
   * Ensure passwords meet minimum security criteria.
   * Restrict certain functionalities to Administrator-only access.

# Technologies Used
* Java (NetBeans IDE, Swing for GUI)
* Text files for data management
* Object-Oriented Programming Concepts

# Installation & Usage
**Requirements**
* Java Development Kit 17
* NetBeans IDE

**How to Run the Project**
1. Clone the Repository
2. Open the project in NetBeans IDE or other Java IDE
3. Compile and Run Main.java

# Testing & Troubleshooting
**Testing Process**:
  * Verified user registration by attempting to add duplicate usernames and invalid email formats.
  * Checked wallet top-up functionality with various valid and invalid user IDs.
  * Tested receipt generation by processing multiple transactions and reviewing saved records.

**Common Issues & Fixes**:
  * Registration Failures: System rejects duplicate usernames or improperly formatted emails. Ensured error handling provides clear feedback to users.
  * Top-up Discrepancies: Incorrect user IDs or transaction failures led to balance mismatches. Added transaction history verification to prevent errors.
  * Receipt Errors: Missing transaction records caused failed receipt generation. Implemented log validation to ensure completeness before processing.

# Author
Umidjon Eshchanov (susefa)
