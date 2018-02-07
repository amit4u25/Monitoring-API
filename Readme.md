# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Employee management application using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Create Mysql database**
create database employee_management


**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`


**2. Build and run the app using maven**

```bash
mvn package
java -jar target/employee-management-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following APIs.

    GET /test/apps => Get list of all the Apps
   
    GET /test/tiers?appName=App1 => Get list of all the tiers it will Accept AppName in url param
   
    GET /test/nodes?appName=App1 => Get list of all the nodes of a App it will Accept AppName in url param
    
    GET /test/metrics?appName=App1&webTier=''&nodeName= '' => Get metrics the App it will Accept AppName, webTier, andnodeName url param
    
     
   

You can test them using postman or any other rest client.
