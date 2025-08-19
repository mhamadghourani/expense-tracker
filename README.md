# Expense Tracker

A simple **Expense Tracker** built with **Spring Boot**, **JWT authentication**, and **H2 database**. Users can register, log in, and manage their expenses securely.

## Features
- User Registration & Login with JWT authentication
- Add and view expenses for each user
- Password encryption using BCrypt
- Stateless security with JWT tokens
- In-memory H2 database for testing

## Technologies
- Java 17
- Spring Boot 3
- Spring Security
- JWT (JSON Web Token)
- H2 Database
- Maven

## Getting Started

### Prerequisites
- Java 17
- Maven 3.8+
- Git

### Clone the Repository
git clone https://github.com/mhamadghourani/expense-tracker.git
cd expense-tracker

### Build the Project
mvn clean install

### Run the Project
mvn spring-boot:run

### Usage

#### Register a User
POST /auth/register  
JSON body:
{
  "username": "mario",
  "password": "password123"
}

#### Login
POST /auth/login  
JSON body:
{
  "username": "mario",
  "password": "password123"
}

Response:
{
  "token": "<JWT_TOKEN>"
}

#### Access Expenses
Include the token in the Authorization header:
Authorization: Bearer <JWT_TOKEN>

GET /expenses - Retrieve all expenses for the logged-in user  
POST /expenses - Add a new expense (JSON body required)

### Notes
- The /expenses endpoints require JWT authentication.
- The project uses an in-memory H2 database. Data is temporary and will be lost when the application stops.


