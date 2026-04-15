# 🚀 JDBC In Action

A comprehensive Java project demonstrating core concepts of **JDBC (Java Database Connectivity)** with MySQL. This project covers CRUD operations, different `Statement` types, and `ResultSet` behaviors.

---

## 📌 Features

* 🔹 Basic JDBC connection setup
* 🔹 CRUD Operations (Create, Read, Update, Delete)
* 🔹 Usage of `Statement` and `PreparedStatement`
* 🔹 Demonstration of `ResultSet` types:

  * TYPE_FORWARD_ONLY
  * TYPE_SCROLL_INSENSITIVE
  * TYPE_SCROLL_SENSITIVE *(MySQL treats it as insensitive)*
* 🔹 Read-only concurrency mode

---

## 🗂️ Project Structure

```
src/
 ├── JDBCDemo.java
 ├── JDBCInsertDemo.java
 ├── JDBCUpdateDemo.java
 ├── JDBCDeleteDemo.java
 ├── InsertUsingPreparedStatement.java
 ├── CONCUR_READ_ONLYDemo.java
 ├── TYPE_SCROLL_INSENSITIVE.java
 └── TYPE_SCROLL_SENSITIVE.java
```

---

## 🛠️ Technologies Used

* Java (JDK 8+)
* JDBC API
* MySQL Database
* MySQL Connector/J

---

## ⚙️ Setup Instructions

1. Clone the repository:

```
git clone https://github.com/your-username/jdbc-in-action.git
```

2. Open the project in your IDE (IntelliJ / VS Code)

3. Add MySQL Connector JAR to classpath

4. Update database credentials in code:

```java
// Replace with your actual DB credentials
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/your_database",
    "your_username",
    "your_password"
);
```

5. Run any class from the `src` folder

---

## ⚠️ Important Notes

* 🔸 Avoid committing real database credentials
* 🔸 Use environment variables or configuration files in production
* 🔸 `TYPE_SCROLL_SENSITIVE` is not fully supported by MySQL

---

## 📚 Learning Outcomes

* Understanding JDBC workflow
* Working with different `Statement` types
* Handling `ResultSet` navigation
* Executing SQL queries from Java

---

## 🤝 Contributing

Feel free to fork this repo and improve it. Suggestions are always welcome!

---

## 📄 License

This project is for educational purposes.

---

## 👨‍💻 Author

Developed by** Motilal Gupta**
