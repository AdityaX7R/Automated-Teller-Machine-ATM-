# Automated-Teller-Machine-ATM-
OOPS project
## Implementation

The ATM Simulation System is developed using Java and Object-Oriented Programming (OOP) concepts. The project consists of three main classes: Account, ATM, and Main.

### Account Class

The Account class is responsible for managing account-related operations. It contains a private balance variable, demonstrating the concept of encapsulation. The class provides methods to check the current balance and withdraw money. Before processing a withdrawal, the system verifies that the entered amount is valid and that sufficient balance is available.

### ATM Class

The ATM class handles user authentication and menu operations. A static PIN is used for authentication, ensuring that only authorized users can access the system. After successful authentication, a menu-driven interface allows users to withdraw money, check account balance, or exit the program.

### Main Class

The Main class acts as the entry point of the application. It creates objects of the ATM and Account classes, accepts user input, and controls the overall program flow.

### Exception Handling

The project uses exception handling to manage invalid inputs and prevent program crashes. Errors such as non-numeric input, invalid withdrawal amount, and insufficient balance are handled using try-catch blocks, ensuring smooth execution.

### OOP Concepts Used

➤ Classes and Objects
➤ Constructors
➤ Methods
➤ Encapsulation
➤ Static Variables
➤ Exception Handling
➤ Control Structures (Loops and Conditionals)

The system successfully simulates basic ATM operations while maintaining security, reliability, and user-friendly interaction.
