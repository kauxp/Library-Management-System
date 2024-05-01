### Library Management System

This project implements a library management system to handle book management, patron management, and lending management.

#### Models:

1. **Book:**
    - Fields: ID (Auto Increment), title, author, genre, publication date, ISBN.
    - Relationships: Many-to-many with Author and Genre.

2. **Author:**
    - Fields: ID (Auto Increment), name.

3. **Genre:**
    - Fields: ID (Auto Increment), name.

4. **Patron:**
    - Fields: Patron ID, name, email, registration date.

5. **Lending:**
    - Fields: Lending ID, book ID, patron ID, date borrowed, due date.

#### Functionalities:

1. **Book Management:**
    - CRUD operations for Books.
    - Search books by title, author, or genre.

2. **Patron Management:**
    - CRUD operations for Patrons.
    - List all books borrowed by a specific patron.

3. **Lending Management:**
    - Check-out and check-in of books.
    - View all active lendings.

#### Project Details:

- **RESTful API:** Implemented using Spring Boot.
- **Database:** Integrated MySQL Database.
- **Cardinality Rules:** Handled between models.
- **ORM:** Used Hibernate for database interaction.
- **Logging:** Added for each CRUD operation.

#### Setup and Usage:

1. **Clone the Repository:** Clone this repository to your local machine.
2. **Set Up Database:** Create a MySQL database and configure the connection details in `application.properties`.
3. **Run the Application:** Execute the Spring Boot application.
