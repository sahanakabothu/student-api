# Student API (Spring Boot)

## 🚀 Features
- Get all students
- Add a student
- Delete a student

## 🛠 Tech Stack
- Java 17
- Spring Boot
- REST API

## 📌 Endpoints

### GET all students
GET /students

### POST add student
POST /students

Sample JSON:
{
"id": 1,
"name": "Sahi",
"branch": "CSE"
}

### DELETE student
DELETE /students/{id}

## ▶️ How to Run
1. Run StudentapiApplication.java
2. Open browser: http://localhost:8080/students