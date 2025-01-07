# 🌐 Language Translator Application

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-green.svg)
![Java](https://img.shields.io/badge/Java-17-orange.svg)
![HTML](https://img.shields.io/badge/HTML-56.1%25-red.svg)
![JavaScript](https://img.shields.io/badge/JavaScript-22.2%25-yellow.svg)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.0-purple.svg)

A modern, secure, and user-friendly language translation application built with Spring Boot and powered by MyMemory Translation API.

[Features](#-features) •
[Tech Stack](#-tech-stack) •
[Getting Started](#-getting-started) •
[API Usage](#-api-usage) •
[Live Demo](#-live-demo)

</div>

## ✨ Features

- **🔐 Secure Authentication System**
  - User registration with validation
  - Secure login functionality
  - Password encryption
  - Session management

- **🔄 Translation Capabilities**
  - Support for multiple languages
  - Real-time translation
  - Both GET and POST request handling
  - Error handling and recovery

- **💻 User Interface**
  - Clean, responsive design
  - Bootstrap 5 styling
  - Form validation
  - Real-time feedback
  - Mobile-friendly layout

- **🛡️ Security Features**
  - Spring Security integration
  - Protected endpoints
  - Secure password storage
  - CSRF protection

## 🔧 Tech Stack

### Backend
- **Framework:** Spring Boot 2.7.0
- **Security:** Spring Security
- **Database:** H2 Database
- **ORM:** Spring Data JPA
- **API Integration:** MyMemory Translation API

### Frontend
- **Template Engine:** Thymeleaf
- **Styling:** Bootstrap 5
- **Scripting:** JavaScript
- **CSS:** Custom styling

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Git

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/deepak2testing/translator.git
   cd translator
Build the Project

bash
mvn clean install
Run the Application

bash
mvn spring-boot:run
Access the Application
Open your browser and go to http://localhost:8080

📚 API Usage
Translation API
Endpoint: /translate
Method: POST
Request Body: JSON
JSON
{
  "text": "Hello",
  "fromLang": "en",
  "toLang": "es"
}
Response Body: JSON
JSON
{
  "responseData": {
    "translatedText": "Hola"
  }
}
