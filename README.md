# Inventory Management System Project

This project demonstrates the development of an inventory management application using both procedural and object-oriented programming approaches. It provides functionalities to manage product inventory, including adding, modifying, deleting, searching for products, and calculating the total stock value.

## Table of Contents
1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Features](#features)
4. [Technologies Used](#technologies-used)
5. [Examples](#examples)
    - [Procedural Programming Implementation](#procedural-programming-implementation)
    - [Object-Oriented Programming Implementation](#object-oriented-programming-implementation)
6. [Future Enhancements](#future-enhancements)



## Introduction

The **Inventory Management System** is a menu-driven console application designed to simplify inventory operations. This project was developed in two stages:

1. **Procedural Programming**:  
   The initial implementation used static methods and arrays to manage data and operations.


2. **Object-Oriented Programming (OOP)**:  
   The application was refactored to follow OOP principles, introducing better modularity, scalability, and maintainability.

---

## Project Structure

The OOP version of the project includes the following files:

- **`Product.java`**: Defines the `Product` class, encapsulating product attributes and providing methods to manage individual product objects.


- **`App_Manager.java`**: Manages the inventory operations (add, modify, delete, display, etc.) using a list of `Product` objects.


- **`Inventory_Management_Main.java`**: Serves as the entry point, initializing the system and facilitating user interactions through a menu.


- **`Layout.java`**: Provides a structured menu interface for interaction and organizes outputs.

---

## Features

1. **Add Product**:  Add a new product with attributes such as ID, Name, Quantity, and Price.


2. **Modify Product**: Update specific attributes (ID, Name, Quantity, or Price) of an existing product.


3. **Delete Product**: Remove a product from the inventory .


4. **Display Product List**: View all products in a tabular format.


5. **Search Product**: Search for a product  and display its details.


6. **Calculate Stock Value**: Compute and display the total monetary value of all products in stock.

---

## Technologies Used

- **Programming Language**: Java
- **Development Tools**: IntelliJ IDEA (or any preferred IDE)

---


## Examples

### Procedural Programming Implementation

Here is an example of the initial procedural approach:

- Adding a product:

```bash
    Enter Product ID: P001
    Enter Product Name: Laptop
    Enter Product Quantity: 10
    Enter Product Price: 1500.0
```

- Displaying product list:

```bash
    | ID     | Name   | Quantity | Price   |
    | P001   | Laptop | 10       | 1500.00 |
```

### Object-Oriented Programming Implementation

In the OOP version:

- Each product is represented as an object.
- Operations are modularized using separate methods in dedicated classes.

--- 

## Future Enhancements

- **Persistent Storage**: Store inventory data in a database or a file for future retrieval.


- **GUI Integration**: Develop a graphical user interface for enhanced user experience.


- **User Authentication**: Add login and user management features.


- **REST API**: Expose inventory operations as REST APIs for broader integration.
