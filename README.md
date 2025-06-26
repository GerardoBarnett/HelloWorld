# HelloWorld
A simple Java 8 program that displays a "Hello World" message

## Description
This repository contains a Java 8 application that displays a "Hello World" message in two ways:
1. A console application (`HelloWorld.java`) that prints the message to the terminal
2. A user-friendly GUI application (`App.java`) that displays the message in a window

## Requirements
- Java 8 JDK or higher
- Maven 3.6 or higher

## Building the Application
To build the application, run:
```
mvn clean package
```

## Running the Application
### Console Application
```
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.HelloWorld
```

### GUI Application
```
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.App
```

## Running Tests
To run the tests, execute:
```
mvn test
```
