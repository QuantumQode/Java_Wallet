University Java Projects
This repository contains my coursework for the Software and Programming II module, showcasing various projects completed in Java for the 2023/24 academic year.

Projects Overview
1. Self Storage Unit
This project involves creating a SelfStorageUnit class to manage and store objects of the Item class, which includes a name and weight attribute.

The SelfStorageUnit class provides functionalities such as:
- Adding items and counting the number of items.
- Calculating the average weight of stored items.
- Handling potential null entries to ensure robust functionality.
Code Structure
- SelfStorageUnit.java: Defines the SelfStorageUnit class, implementing various methods to manage and analyze the stored items.
- Coursework1Main.java: A main class for testing the functionalities of SelfStorageUnit. Tests include adding items, counting them, and verifying the output.

---------------------------------------------------------------------------------
2. Card System
This project expands a basic Card class into a more detailed hierarchy, which includes:
- CallingCard: Stores card number and PIN.
- IDCard: Stores a name and ID number.
- DriverLicence: Extends IDCard with an expiration year.
Additionally, a Wallet class is created to manage and format multiple cards.

Code Structure
- Card.java: Base class with a name attribute and common methods.
- CallingCard.java, IDCard.java, DriverLicence.java: Subclasses of Card with additional attributes and specialized methods.
- Wallet.java: Contains methods for adding and formatting cards.
- WalletTester.java: Tests the functionality of Wallet and the card subclasses.

Project Highlights
Object-Oriented Design: Applied inheritance, polymorphism, and encapsulation principles.
JavaDoc Documentation: Thorough documentation of classes, methods, and attributes.
Consistent Coding Style: Ensured uniform use of the this. prefix and structured methods to improve readability and maintainability.
