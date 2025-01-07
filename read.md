Here is the complete markdown for usage and API endpoints:

```markdown
## Usage

### Running the Application

To run the application locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/deepak2testing/translator.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd translator
   ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the Application**:
   - Open your browser and go to `http://localhost:8080`.

## API Endpoints

### 1. Register User
- **URL**: `/register`
- **Method**: POST
- **Request Body**:
  ```json
  {
    "username": "testuser",
    "password": "password",
    "email": "test@example.com"
  }
  ```
- **Response**:
  ```json
  {
    "message": "User registered successfully"
  }
  ```

### 2. Login User
- **URL**: `/login`
- **Method**: GET
- **Response**:
  - Returns the login page.

### 3. Show Register Page
- **URL**: `/register`
- **Method**: GET
- **Response**:
  - Returns the registration page.

### 4. Translator Page
- **URL**: `/translator`
- **Method**: GET
- **Response**:
  - Returns the translator page where users can input text for translation.

### 5. Translate Text
- **URL**: `/translate`
- **Method**: POST
- **Request Body**:
  ```json
  {
    "text": "Hello",
    "fromLang": "en",
    "toLang": "es"
  }
  ```
- **Response**:
  ```json
  {
    "translatedText": "Hola"
  }
  ```

### 6. Error Handling
- **Validation Error**:
  - **Status**: 400 Bad Request
  - **Response**:
    ```json
    {
      "error": "Validation failed: [error message]"
    }
    ```

- **Internal Server Error**:
  - **Status**: 500 Internal Server Error
  - **Response**:
    ```json
    {
      "responseStatus": "500",
      "responseData": {
        "translatedText": "Translation service error: [error message]"
      }
    }
    ```
```

Feel free to copy and paste this into your `README.md` file!
