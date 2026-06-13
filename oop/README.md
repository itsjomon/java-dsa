# Object-oriented Programming

It is a software design approach and programming paradigm that organizes code around "objects" (data and behaviors) rather than pure logic and functions. This method models real-world entities to make code more reusable, scalable, and manageable.

## Objects & Classes

- Objects are entities in the real world
- Classes are group of these entities
- Classses = Attributes (Properties) + Functions ( Behaviors)

## Access Modeifiers / Access Specifiers

| Access modifier | Within class | within package | Outside package by subclass only | Outside package |
|-----------------|--------------|----------------|----------------------------------|-----------------|
| Private         | Yes          | No             | No                               | No              |
| Default         | Yes          | Yes            | No                               | No              |
| Protected       | Yes          | Yes            | Yes                              | No              |
| public          | Yes          | Yes            | Yes                              | Yes             |

## Gatters & Setters

- get : to return the value
- set : to modify the value
- this : refers to the current object of the class.

## Encapsulation

Encapsulation binds data and methods into a single unit, typically a class. It restricts direct access to data by hiding implementation details. This ensures controlled interaction with the data through defined methods.

Encapsulation in Java is achieved using:

- Private data members
- Public getter and setter methods

## Constructor

Constructor is a special method which is invoked automatically at the time of object creation.

- Constructors have the same as class or structure.
- Constructors don't have a return type. (Not even void)
- Constructors are only called once, at object creation.
- momory allocation happens when constructors is called

### Type of constructors

- Non-parameterized constructor
- Parameterized constructor
- Copy constructor 

## Destructors

**Java does not have destructors**. Java uses **Garbage Collector (GC)** to automatically destroy objects when they are no longer needed.

```java
public class Main {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("World");
        
        System.out.println(a);  // Hello
        System.out.println(b);  // World
        
        a = null;  // "Hello" object lost its reference
        
        System.out.println(a);  // null
        System.out.println(b);  // World
        
        // Garbage Collector will destroy "Hello" object automatically
    }
}
```

## Inheritance

Inheritance is an OOP concept where a **child class** (subclass) acquires all the properties (fields) and behaviors (methods) of a **parent class** (superclass).

### Types of Inheritance

- Single level inheritance
- Multi level inheritance
- Hierarchichial inheritance
- Hybrid inheritance


## Final Keyword

Final keyword restricts modification:

- **final variable** -> Value cannot be changed (constant)
- **final method** -> Cannot be overridden
- **final class** -> Cannot be inherited

```java
// Example
final class Animal {     // Can't inherit
    final int MAX = 100; // Can't change
    
    final void eat() { } // Can't override
}
```

## Polymorphism

Polymorphism allows objects to behave differently based on their specific class type.

The word polymorphism means having many forms, and it comes from the Greek words poly (many) and morph (forms). This means one entity can take many forms.

### Compile-Time Polymorphism (Static Polymorphism)

Method to be called is decided by the **compiler** at **compile time**.

**Achieved by:** Method Overloading

### Method Overloading

Multiple functions with the same name but different parameters.

### Runtime polymorphism  (Dynamic Polymorphism)

Method to be called is decided by **JVM at runtime**.

**Achieved by:** Method Overriding

### Method Overriding

Parent and child classes have the **same method** with **different implementation**.


## Packages in Java

Packages is a group of similar types of classes, interfaces and sub-packages.

## Abstraction

Abstraction is the process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.

Ways to Achieve Abstraction:

- Abstract Classes (Partial Abstraction)
- Interface (provides abstraction for behavior, may contain default or static methods)


### Abstract Class

- Cannot create an instance of abstract class
- Can have abstract/non-abstract methods
- Can have constructors


### Interface

Interface is a blueprint of a class

- All Methods are public, abstract & without implementaion
- Used to achieve total abstraction
- variables in the interface are final, public and static

## Static Keyword

`static` keyword in Java is used to share the same variable or method of a given class.

- properties
- Functions
- Blocks
- Nested classes

## Super keyword

`super` keyword is used to refer immediate parent class object.

- To access parent's properties
- To access parent's functions
- To access parent's constructor