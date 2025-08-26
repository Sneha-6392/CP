package BridgeLabz.day2;
// 1. Create a class Car with instance variables model and year. Create two car objects and display their details.

// class Car {
//     String model;
//     int year;
// }
// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.model = "Honda City";
//         c1.year = 2020;
//         Car c2 = new Car();
//         c2.model = "Hyundai i20";
//         c2.year = 2022;
//         System.out.println(c1.model + " - " + c1.year);
//         System.out.println(c2.model + " - " + c2.year);
//     }
// }

// 2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.

// class Car {
//     String model;
//     int year;
//     static int numberOfCars = 0;
//     Car() {
//         numberOfCars++;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.model = "Honda City";
//         c1.year = 2020;
//         Car c2 = new Car();
//         c2.model = "Hyundai i20";
//         c2.year = 2022;
//         System.out.println("Number of cars created: " + Car.numberOfCars);
//     }
// }

// 3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?

// class Car {
//     void method() {
//         int localVariable = 10;
//         System.out.println("Local variable inside method: " + localVariable);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.method();
//         // System.out.println("Local variable outside method: " + localVariable);
//         // localVariable cannot be resolved to a variable
//         // The above print statement will cause compilation error because localVariable is not accessible outside its method.
//     }
// }

// 4. Create a class Student with name (String) and marks (int). Use a constructor to initialize values. Create two objects and print their data.

// class Student {
//     String name;
//     int marks;
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Sneha Maurya";
//         s1.marks = 85;
//         Student s2 = new Student();
//         s2.name = "Vanshika Parashar";
//         s2.marks = 90;   
//         System.out.println("Student 1: " + s1.name + ", Marks: " + s1.marks);
//         System.out.println("Student 2: " + s2.name + ", Marks: " + s2.marks);
//     }
// }

// 5. Write a program where you modify a static variable using one object, and access it from another object. Show how it reflects the change.

// class Demo {
//     static int count = 0;
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo d1 = new Demo();
//         d1.count = 5;
//         Demo d2 = new Demo();
//         System.out.println("Value from d2: " + d2.count); 
//         // The static field Demo.count should be accessed in a static way
//     }
// }

// 6. Create a class Demo where you declare a local variable with the same name as an instance variable. Use this keyword to differentiate.

// class Demo {
//     int num;
//     void setNum(int num) {
//         this.num = num;  // differentiate between local and instance
//     }
//     void display() {
//         System.out.println(num);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.setNum(20);
//         d.display();
//     }
// }

// 7. Create a final variable inside a class. Try changing its value later. What error do you get?

// class Demo {
//     final int a = 234;
//     void change() {
//         a = 450; // This will cause a compilation error
//     }
// }

// 8. Add a static block in a class to initialize a static variable. Print its value from the main() method.

// class Demo {
//     static int a;
//     static {
//         a = 500;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Value of static variable a: " + Demo.a);
//     }
// }

// 9. Create a class Account with instance variables: accountHolder, balance. Use default values. Print them without setting any values.

// class Account {
//     String accountHolder;
//     double balance;
// }
// public class Main {
//     public static void main(String[] args) {
//         Account acc = new Account();
//         System.out.println("Account Holder: " + acc.accountHolder); // null
//         System.out.println("Balance: " + acc.balance); // 0.0
//     }
// }

/* 10. Create a class that uses all three types of variables:
            Instance variable
            Static variable
            Local variable
        Print all of them in a method.
*/

// class Demo {
//     int instanceVar = 1;      // instance
//     static int staticVar = 2; // static
//     void show() {
//         int localVar = 3;     // local
//         System.out.println(instanceVar + " " + staticVar + " " + localVar);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         new Demo().show();
//     }
// }

// 11. Declare a class variable (static) without initialization. Print its default value. Then assign and print again.

// class Demo {
//     static int x; // 0
// }
// public class Main { 
//     public static void main(String[] args) {
//         System.out.println(Demo.x);
//         Demo.x = 50;
//         System.out.println(Demo.x); // 50
//     }
//}

// 12. Write a class User with a final instance variable userId. Initialize it using a constructor.

// class User {
//     final int userId;
//     User(int id) {
//         this.userId = id;
//     }
// }

// 13. Create two classes: A and B. Inside A, create a static variable x. In class B, change and print it.

// class A {
//     static int a = 20;
// }
// class B {
//     public static void main(String[] args) {
//         A.a = 50;
//         System.out.println(A.a);
//     }
// }

// 14. Create a method that accepts a parameter with the same name as a class variable. Use this keyword to assign it.

// class Demo {
//     int num;
//     void setNum(int num) {
//         this.num = num;
//     }
// }

// 15. Create a class with multiple methods accessing the same instance variable. Show how changes made in one method affect another.

// class Demo {
//     int num;
//     void setNum(int num) {
//         this.num = num;
//     }
//     void display() {
//         System.out.println("Current value of num: " + num);
//     }
//     void increment() {
//         num++;
//         System.out.println("Incremented value of num: " + num);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.setNum(10);
//         d.display();
//         d.increment();
//         d.display(); 
//     }
// }

// 16. Write a program to show that local variables must be initialized before use. Comment on what error appears otherwise.

// class Demo {
//     void method() {
//         int x;
//         // System.out.println(x);
//         // The local variable x may not have been initialized
//     }
// }

// 17. Create a class with a static final variable (a constant), e.g., PI = 3.14. Try changing it.

// class Demo {
//     static final double PI = 3.14;
//     void show() {
//         PI = 3.14159; // This will cause a compilation error because PI is a final variable and cannot be changed.
//         System.out.println("Value of PI: " + PI);
//     }
//}

// 18. Demonstrate variable shadowing using local and instance variables with the same name. Show how to access both.

// class Demo {
//     int num = 100; // instance
//     void show() {
//         int num = 50; // local
//         System.out.println("Local: " + num);
//         System.out.println("Instance: " + this.num);
//     }
// }

// 19. Create an instance variable in a class. Create two objects with different values for it. Show that each object keeps its own copy.

// class Demo {
//     int value;
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo d1 = new Demo();
//         Demo d2 = new Demo();
//         d1.value = 10;
//         d2.value = 20;
//         System.out.println("d1: " + d1.value + ", d2: " + d2.value);
//     }
// }

// 20. Create a program where you access a static variable without creating an object of the class.

// class Demo {
//     static int staticVar = 100;
// }
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Static Variable: " + Demo.staticVar);
//     }
// }











