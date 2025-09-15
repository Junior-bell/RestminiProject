RestminiProject

A simple Spring Boot REST API demonstrating basic CRUD operations and tested using Postman.

Features

RESTful endpoints for Create, Read, Update, and Delete.

Standard HTTP status codes and JSON responses.

Easy to run locally with minimal configuration.

Tech Stack

Java 17+

Spring Boot (Web, JPA, Validation)

Maven for build management

H2 / MySQL (choose your database)

Postman for API testing

Getting Started
Prerequisites

JDK 17 or higher

Maven 3.x

Any SQL database (or use in-memory H2)

Installation
git clone https://github.com/Junior-bell/RestminiProject.git
cd RestminiProject
mvn clean install

Run
mvn spring-boot:run


Application starts at http://localhost:8080/
 by default.

API Endpoints (sample)
Method	Endpoint	Description
GET	/api/items	Retrieve all items
GET	/api/items/{id}	Retrieve single item
POST	/api/items	Create new item
PUT	/api/items/{id}	Update existing item
DELETE	/api/items/{id}	Delete item by ID

(Adjust names/paths to match your actual entities)

Testing with Postman

Import the API collection or create requests manually.

Set request URL to http://localhost:8080/....

For POST/PUT, set Body → raw → JSON and send the required payload.

Check returned HTTP status codes (200, 201, 404, etc.).

project structure 

RestminiProject/
├─ src/main/java/com/example/restminiproject/
│  ├─ controller/
│  ├─ service/
│  ├─ repository/
│  └─ RestminiProjectApplication.java
├─ src/main/resources/
│  └─ application.properties
└─ pom.xml
