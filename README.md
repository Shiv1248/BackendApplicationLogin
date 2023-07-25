# BackendApplicationLogin
This project is a backend implementation of a Login and Signup REST API with JWT (JSON Web Token) authentication. It allows users to create new accounts, authenticate via JWT, and access protected resources. The project is built on the Spring Boot framework and uses an H2 database for storing user information.

#Installation and Setup:
1.Clone the project repository from GitHub
2.Open the project in your preferred IDE(Eclipse or STS preferred)
3.Run the application.
The Spring Boot application will start, and the API will be accessible at http://localhost:9090/api

#API Endpoints:
There are 5 REST api endpoints:
1. /auth/login - Call this endpoint for logging in the user.
2. /auth/signup - This endpoint is used to register the user and store their details in the backend.
3. /auth/login/hello - Greetings from Greenstitch for the user after logging in.
4. /auth/users - List of users is returned by this endpoint.
5. /auth/user/{emailId} - Specific user details are returned with the given email id.
