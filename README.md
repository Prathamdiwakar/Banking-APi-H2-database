# Banking API with H2 Database 🚀

A simple **Spring Boot REST API** project demonstrating CRUD operations using an **H2 in-memory database**.
This project is built for **learning, practice, and backend fundamentals**.

---

## 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **H2 Database**
* **Maven**
* **REST API**

---

## 📌 Features

* RESTful API architecture
* H2 in-memory database integration
* CRUD operations
* JPA & Hibernate usage
* Clean layered structure (Controller, Service, Repository)
* Easy to run & test

---

## 🔗 API Endpoints (Sample)

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/customers`      | Get all customers   |
| GET    | `/customers/{id}` | Get customer by ID  |
| POST   | `/customers`      | Create new customer |
| PUT    | `/customers/{id}` | Update customer     |
| DELETE | `/customers/{id}` | Delete customer     |

---

## 🧪 H2 Database Console

* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **Username:** `sa`
* **Password:** *(leave blank)*

---

## ⚙️ How to Run the Project

1. Clone the repository

   ```bash
   git clone https://github.com/Prathamdiwakar/Banking-APi-H2-database.git
   ```

2. Open in IDE (IntelliJ / Eclipse)

3. Run the Spring Boot application

4. Test APIs using **Postman / Browser**

---

## 📂 Project Structure

```
src/main/java
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── BankingApiApplication.java
```

---

## 🎯 Purpose

This project is created to:

* Understand **Spring Boot REST APIs**
* Learn **H2 + JPA integration**
* Practice backend development fundamentals

---

## 👨‍💻 Author

**Pratham Diwakar**
GitHub: [https://github.com/Prathamdiwakar](https://github.com/Prathamdiwakar)

---

⭐ If you like this project, give it a star!
