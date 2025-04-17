# 🚀 Spring Boot Employee Management System - Part 3

Welcome to **Part 3** of my Spring Boot learning journey!  
In this phase, I’ve focused on enhancing the backend logic and introducing new features for better interactivity and data handling.

---

## 🔧 What's New in Part 3?

### ✅ Image Upload and Gallery View
- Upload employee images and render them in a dynamic gallery.
- Stored images are displayed directly from the `/uploads` directory.

### ✅ Full CRUD for Employee Entity
- Create, update, delete, and list employees with ease.

### ✅ One-to-One Relationship
- Integrated `Address` with `Employee` using a bidirectional one-to-one relationship.

### ✅ Many-to-Many Relationship
- Connected `Employee` with `Department` entities using a join table.

### ✅ Efficient Field Updates
- Only modified fields are updated during the edit process.
- Solved `null` value issues during update using setter methods (e.g., `setFname()`, `setLname()`).

### ✅ @ElementCollection for Project Table
- Simplified implementation of `project_tbl` using `@ElementCollection` without creating a separate entity class.

### ✅ View Page for Employee Details
- Added a new UI route to view full details of each employee, including uploaded images and department info.

---

## 📂 Technologies Used
- Java 17
- Spring Boot
- Thymeleaf
- Spring Data JPA
- Tailwind CSS
- MySQL

---

## 📸 Image Upload Feature
> Image files are stored under `/uploads`, and displayed in the gallery using Thymeleaf bindings.

---

## 📁 Project Structure Highlights
- `Employee.java`, `Address.java`, `Department.java`: Entity classes
- `EmployeeController.java`: Handles CRUD and update logic
- `resources/templates`: Thymeleaf views for form, list, view, gallery

---

## 🔗 GitHub Repository
[👉 View Code on GitHub (Part 3)](https://github.com/bibekpandey0521/springProject/tree/part-3)

---

Stay tuned for Part 4 — focusing on validation, notifications, and dashboard analytics!
