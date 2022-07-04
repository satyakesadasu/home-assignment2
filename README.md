# Home assignment2 ASSIGNMENT

---

## Technologies Used:

1. Spring boot 2.4.4
2. Maven as build tool
3. Junit for unit test cases

# Problem 1:

## How to run the Application

1. Find the Java File in the path "src/main/java/com/homeassn/assignment/problem/FirstProblem.java"
2. Run the file as java application
3. You will be prompted in the console to enter length of array, please enter the number and click
   enter
4. Then you will be asked to enter k value, please enter the k value and click enter
5. Then you will be asked to enter elements of array, please enter the elements of size mentioned in
   step 3 , one after another by clicking enter
6. Output will be shown in the console
6. Please find below sample console output

## Sample console output:

Enter the value of n , the size of the array that is to be created:
5 Enter K value 6 Enter elements of array 2 1 4 5 3

## Output will be shown as below

2

Problem 2:

## Rest API Services:

### 1. Evaluates the expressions

### Description:

Program that evaluates arithmetic expressions written in Polish notation. Expressions can contain
double-precision floating point numbers and the following operations: addition, subtraction,
division and multiplication.

`POST http://localhost:8088/rest/evaluateExpression`

### Request:

[  
"+ 1 2",
"+ + 0.5 1.5 * 4 10",
"+ + 0.5 t * 4 10",
"1",
"te",
"",
"- 2e3 - 700 + 7 * 2 15",
"100500",
"1 2"
]

#### Response:

[
"3.0",
"42.0",
"error",
"1",
"error",
"error",
"1337.0",
"100500",
"error"
]

#### Pre Requisite

* Make sure port 8088 is free , if not please change the port number in
  src/main/resources/application.properties

---

## How to run the Application

1. Import the project as maven project into an IDE and run mvn clean install command to download
   dependencies.
2. After build is successful, run the application as a java application
3. In the browser, open "http://localhost:8088/swagger-ui/index.html"
4. you can also test the rest api as you prefer, you can test using postman or any other tool
5. Please find below steps to run in Swagger UI

---

### How to run in Swagger UI

1. In the browser, open "http://localhost:8088/swagger-ui/index.html"
2. Click on problem-controller
3. You will find "POST: /rest/evaluateExpression",click on the api
4. Please click on try it out button
5. Enter the input as list of strings, please find the sample request above and click on execute.
6. You will find the response in the response area.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.0/maven-plugin/reference/html/)
* [Swagger Documentation](https://swagger.io/)
# home-assignment2
