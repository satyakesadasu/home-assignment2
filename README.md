# ASSIGNMENT2
-----------
Below you will find a set of problems that you can solve in any language, though Java is preferred. The only requirements is that you need to provide a
README file on how to build and run your solutions. The end result should be provided in the form of a single public GitHub repository that contains the
solutions to all the problems.
Unless explicitly stated otherwise; input will be provided through stdin and output should be printed to stdout. Lines should be delimited by the line feed
(\n) character only.

Problem 1
You are given an array of n unique integers a = a[0], a[1], ... , a[n - 1] and an integer value k. Find and print the number of pairs (a[i], a
[j]) where i < j and a[i] + a[j] = k.
Input
The values k, a[0], a[1], ... a[n - 1], one value per line. Empty lines should be ignored.
Output
Print the number of pairs matching the criteria.
Constraints
All values are 32-bit signed integers
2 <= n < 10e6
Example
Given k = 6 and a = [2, 1, 4, 5, 3]. The pairs matching the criteria are (2, 4) and (1, 5).
Input
6
2
1
4
5
3
The expected output is:
Output
2
Problem 2
Create a program that evaluates arithmetic expressions written in Polish notation. Expressions can contain double-precision floating point numbers and the
following operations: addition, subtraction, division and multiplication.
Input
A list of expressions to evaluate, one expression per line.
Output
Print the result of the evaluation for each expression on separate lines. The result should be given with 2 digits of precision or "error" in the case that the
expression was invalid.
Constraints
Expressions can contain up to 100k operations
Example
Given the following list of expressions:
Input
+ + 0.5 1.5 * 4 10
- 2e3 - 700 + 7 * 2 15
- -1.5 * 3.1415 / -7 -2
100500
1 2
+ 1
The expected output is:
Output
42.00
1337.00
-12.50
100500.00
error
error
Problem 3
Implement a REST API for the solution to problem 2 that evaluates expressions that are supplied in the requests. Even though it may be a tiny API, be
sure to provide everything you would expect from a production grade API.
-----------

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
