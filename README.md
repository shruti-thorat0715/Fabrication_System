# 🛠️ Fabrication System – Spring Boot Project

This is a simple **Fabrication System** built using:
- Spring Boot (Backend)
- PostgreSQL (Database)
- HTML/CSS/JavaScript (Frontend)

It allows users to:
- Add fabrication items
- View all items
- Delete items

---

## 🔧 Technologies Used

| Layer       | Technology           |
|-------------|----------------------|
| Backend     | Spring Boot (REST API) |
| Frontend    | HTML, CSS, JavaScript |
| Database    | PostgreSQL           |
| Tools       | IntelliJ / VS Code, Postman, pgAdmin |

---

## 📁 Project Structure:

fabrication-system/

├── src/

│ ├── main/

│ │ ├── java/com/example/fabrication/

│ │ │ ├── controller/

│ │ │ ├── model/

│ │ │ ├── repository/

│ │ │ └── FabricationSystemApplication.java

│ │ ├── resources/

│ │ │ ├── static/ ← index.html, styles.css, script.js

│ │ │ ├── application.properties

├── pom.xml

└── README.md

---

## 🧪 Features:

- ✅ Add item (Name, Customer, Quantity)
- ✅ View all items in a table
- ✅ Delete item

- **🚀 Simple UI with responsive layout**

---

## PostgreSQL Setup
  
  **Create database:**
```
-CREATE DATABASE fabrication_db;
```
**Create Database Table:**

```

CREATE TABLE fabrication_item (
    id SERIAL PRIMARY KEY,
    item_name VARCHAR(255),
    customer_name VARCHAR(255),
    quantity INTEGER
);

```

## 🛠 Update Database Credentials:

```
-spring.datasource.url=jdbc:postgresql://localhost:5432/fabrication_system_db
-spring.datasource.username=postgres
-spring.datasource.password=shrutu
-spring.jpa.hibernate.ddl-auto=update

```

## 📷 Screeshots Of Output:
<img width="1366" height="768" alt="Screenshot (152)" src="https://github.com/user-attachments/assets/a4824b2c-d9b0-4c65-8ab3-af0f19d7cef4" />

<img width="1366" height="768" alt="Screenshot (157)" src="https://github.com/user-attachments/assets/7ed74fd5-1953-4b75-844e-707896fb3dcb" />

## 📞Contact:

-For any questions or feedback, feel free to reach out:

Your Name : shruti thorat

Email: shrutithorat767@gmail.com

GitHub: shruti-thorat0715







