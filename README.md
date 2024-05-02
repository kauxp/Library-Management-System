### Library Management System

This project implements a comprehensive library management system to efficiently handle book management, patron management, and lending management tasks. Below are the detailed specifications and functionalities of the system.

#### Models:

1. **Book:**
   - **Fields:**
      - ID (Auto Increment)
      - Title
      - Author
      - Genre
      - Publication Date
      - ISBN
   - **Relationships:**
      - Many-to-many with Author and Genre.

2. **Author:**
   - **Fields:**
      - ID (Auto Increment)
      - Name

3. **Genre:**(enum)
   

4. **Patron:**
   - **Fields:**
      - Patron ID
      - Name
      - Email
      - Registration Date

5. **Lending:**
   - **Fields:**
      - Lending ID
      - Book ID
      - Patron ID
      - Date Borrowed
      - Due Date
#### Requests:

1. **Book Management:** \
   - GET:\
         - By Title: `/book/title/{title}`\
         - By Author: `/book/author/{author}`\
         - By Genre: `/book/genre/{genre}`\
         - All: `/book`\
   
   - POST: `/book`\
   
   - PUT: `/book/{id}`\
   
   - DELETE: `/book/{id}`
   
2. **Author Management:**\
   - GET:\
      - All: `/author`\
   
   - POST: `/author`\
   
   - PUT: `/author/id`\
   
   - DELETE: `/author/id`
   
4. **Patron Management:**\
   - GET:\
      - By Id: `/patron/id`\
      - All: `/patron`\
   
   - POST: `/patron`\
   
   - PUT: `/patron/{id}`\
   
   - DELETE: `/patron/{id}`
   
6. **Lending Management:**\
   - GET:\
      - By Id: `/lending`\
      - By Patron ID: `/lending/patron/{patronId}`\
      - By Book Title: `/lending/book/{bookTitle}`\
      - By Lending Date: `/lending/lendingDate/{lendingdate}`\
      - By Due Date: `/lending/dueDate/{dueDte}`\
      - By Status: `/lending/status/{status}`\
      - All: `/lending`\
   
   - POST: `/lending`\
   
   - PUT: `/lending/{id}`\

   - DELETE: `/lending/{id}`

#### Functionalities:

1. **Book Management:**
   - CRUD operations for Books.
   - Ability to search books by title, author, or genre.

2. **Patron Management:**
   - CRUD operations for Patrons.
   - List all books borrowed by a specific patron.

3. **Lending Management:**
   - Check-out and check-in of books.
   - View all active lendings.

#### Project Details:

- **RESTful API:** Implemented using Spring Boot framework to facilitate easy integration and communication with other systems.
- **Database:** Utilizes MySQL Database to store and manage data effectively.
- **Cardinality Rules:** Handled between models to ensure consistency and integrity of data relationships.
- **ORM (Object-Relational Mapping):** Utilizes Hibernate for seamless interaction between Java objects and relational database tables.
- **Logging:** Logging functionality is added for each CRUD operation to maintain an audit trail and facilitate debugging.

#### Setup and Usage:

1. **Clone the Repository:** Clone this repository to your local machine.
2. **Set Up Database:** Create a MySQL database and configure the connection details in `application.properties` file.
3. **Run the Application:** Execute the Spring Boot application to start using the library management system.
