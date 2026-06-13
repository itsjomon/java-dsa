# Practice Questions

## Qn 1.

Find out the correct statement to assign name to object

```java
class Student {
    String name;
    int marks;
}

public class OOP {
    public static void main(String[] args) {
        Student s = new Student();
        // Fill here
    }
}
```

Options:

- [ ] a. s->name = "aman";
- [ ] b. Student.name = "aman";
- [x] c. s.name = "aman";

## Qn 2.

Which variables can be accessed by an instance of the Person class in the following code?

```java
class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}
```

Options:

- [x] a. name
- [x] b. weight
- [ ] c. rollNumber
- [ ] d. schoolName

## Qn 3. 

Which of the following modifiers are not allowed in front of a class?

Options:

- [x] a. private
- [x] b. protected
- [ ] c. public
- [ ] d. default

> ### Access Modifier Permissions Reference
> 
> |                  | private | default | protected | public |
> |------------------|---------|---------|-----------|--------|
> | **Class**        | No      | Yes     | No        | Yes    |
> | **Nested Class** | Yes     | Yes     | Yes       | Yes    |
> | **Constructor**  | Yes     | Yes     | Yes       | Yes    |
> | **Method**       | Yes     | Yes     | Yes       | Yes    |
> | **Field**        | Yes     | Yes     | Yes       | Yes    |


## Qn 4. 

Which of the following is a correct statement? (both classes are in the same package)

```java
class Vehicle { }
class Car extends Vehicle { }
```

Options:

- [x] a. Car c = new Car();
- [x] b. Vehicle v = new Vehicle();
- [x] c. Vehicle v = new Car();
- [ ] d. Car c = new Vehicle();

## Qn 5. 

What will be the output of this code? (both classes are in the same package)

```java
class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class (Car)");
    }
}

public class OOP {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}
```

Output:

```
Derived class (Car)
Base class (Vehicle)
```

## Qn 6. 

What will be the output of this code? (both classes are in the same package)

```java
class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derived class(Car)");
    }
}

public class OOP {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}
```

Output:

```
Compilation error: print1() not in Vehicle
```

## Qn 7. 

Which of the following is not an OOP component?

Options:

- [ ] a. Inheritance
- [ ] b. Encapsulation
- [ ] c. Polymorphism
- [x] d. Aggregation

## Qn 8. 

What will be the output of this code?

```java
class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class OOPS {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }
}
```

Options:

- [ ] a. Error
- [x] b. 0 2
- [ ] c. 1 2
- [ ] d. 2 2

## Qn 9. 

Which line has an error?

```java
class Test {
    static int marks;
    void set_marks(int marks) {
        this.marks = marks;             //Line 1
    }
}

class OOPS {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);                //Line 2
        System.out.print(Test.marks);   //Line 3
    }
}
```

Options:

- [ ] a. Line 1
- [ ] b. Line 2
- [ ] c. Line 3
- [x] d. None of the lines have an error

## Qn 10. 

What would be the output of the following code?

```java
class Test {
    static int a = 10;
    static int b;
    static void changeB() {
        b = a * 3;
    }
}

class OOPS {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.print(Test.a + Test.b);
    }
}
```

Options:

- [ ] a. 10
- [ ] b. 30
- [x] c. 40
- [ ] d. Compilation Error


## Qn 11.

Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.

Ans: [Complex.java](Complex.java)

## Qn 12.

What is the output of the following program?

```java
class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }
    
    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}
```

Options:

- [ ] a. Driving vehicle
- [x] b. Driving electric car
- [ ] c. Driving car
- [ ] d. The code does not compile

## Qn 13.

Look at the following code and choose which access modifiers can be used in place of `___`:

```java
// Shape.java
public class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

// Circle.java
public class Circle extends Shape {
    ___ void display() {
        System.out.println("Display-derived");
    }
}
```

Options:

- [ ] a. Only protected can be used.
- [x] b. public and protected both can be used.
- [ ] c. public, protected, and private can be used.
- [ ] d. Only public can be used.

## Qn 14.

What is the output of the following program?

```java
abstract class Car {
    static {
        System.out.print("1");
    }
    
    public Car(String name) {
        super();
        System.out.print("2");
    }
    
    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }
    
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }
    
    public static void main (String[] gears) {
        new BlueCar();
    }
}
```

Options:

- [ ] a. 23451
- [ ] b. 12354
- [x] c. 13245
- [ ] d. The code does not compile.

## Qn 15.

Read about basics of exception handling: [https://www.w3schools.com/java/java_try_catch.asp](https://www.w3schools.com/java/java_try_catch.asp)
