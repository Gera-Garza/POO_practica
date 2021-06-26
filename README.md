# General info
This is the repository for the course of POO with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Resume](#Resume)
> * [Encapsulation](#encapsulation)
	
## Technologies
Project is created with:
* VS code
> * Inside VSCode Java Extension Pack

	
## Setup
Install [Vscode](https://code.visualstudio.com/download) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Resume

The four most important things in Object Oriented Programming are this ones:
1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

### Examples

#### Encapsulation
> when in your code, you repeat more than 3 times you should encapsulate it by making it more modular.
 you can acomplish this by creating functions or classes.

> Here is an example:

```java
public class Shape {

    private String name,color;
    
    public Shape(String name,String color){
        this.name = name;
        this.color = color;
    }

    public Shape(){}

    public void data(){
        System.out.println("Kind of Shape: "+name+" Color: "+color);
    }
    
}
```

#### Abstraction
> The abstraction is when you have multiple class and you can abtract some properties they have in common to make it more easy 

> Here is an example:

```java
class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passanger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        if(passanger != null)
            System.out.println("License: " + license + " Driver: " + driver.name + " Passangers: " + passanger);

    }
}
```
```
class UberX extends Car{
    String brand;
    String model;

    public UberX(String license,Account driver, String brand, String model){
        super(license,driver);
        this.brand = brand;
        this.model = model;
        
    }
}
```
