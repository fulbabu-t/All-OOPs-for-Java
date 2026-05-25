# 📘 Java OOP Concepts Implementation

## 📖 What I Learned

This project helped me understand and practice the core concepts of **Object-Oriented Programming (OOP) in Java** through hands-on class implementations and compiled examples.

---

# 🧠 Concepts Learned

## 1️⃣ Classes & Objects

I learned how to create classes and instantiate objects in Java.

### Example
```java
class Car {
    void drive() {
        System.out.println("Car is moving");
    }
}
```

### ✅ Key Understanding
- A class is a blueprint
- An object is an instance of a class
- Methods define behavior

---

## 2️⃣ Encapsulation

Encapsulation means wrapping data and methods together inside a class and restricting direct access using access modifiers.

### Example
```java
class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

### ✅ What I Learned
- Use `private` variables for security
- Access data using getter/setter methods
- Helps protect object data

---

## 3️⃣ Inheritance

Inheritance allows one class to acquire properties and methods of another class.

### Example
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

### ✅ What I Learned
- Code reusability
- Parent-child relationship
- `extends` keyword usage

---

## 4️⃣ Polymorphism

Polymorphism allows methods to behave differently based on context.

### 🔹 Types Practiced
- Method Overloading
- Method Overriding

### Example (Overriding)
```java
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Class B");
    }
}
```

### ✅ What I Learned
- Runtime polymorphism using overriding
- Compile-time polymorphism using overloading
- Dynamic method dispatch

---

## 5️⃣ Abstraction

Abstraction hides internal implementation details and shows only required functionality.

### Example
```java
abstract class Shape {
    abstract void draw();
}
```

### ✅ What I Learned
- Use abstract classes/interfaces
- Focus on functionality instead of implementation
- Improves code maintainability

---

## 6️⃣ Inner Classes

Inner classes are classes defined inside another class.

### Example
```java
class Outer {
    class Inner {
        void display() {
            System.out.println("Inner class");
        }
    }
}
```

### ✅ What I Learned
- Nested class behavior
- Better logical grouping
- Access outer class members easily

---

# ⚙️ Project Execution Knowledge

## Running Compiled `.class` Files

### Command Used
```bash
java Demo
```

### ✅ What I Learned
- `.class` files contain compiled Java bytecode
- JVM executes bytecode
- A class must contain the `main()` method to run

---

# 🛠 Skills Improved

- Java syntax understanding
- OOP design thinking
- Class relationships
- JVM execution basics
- Command-line Java execution
- Debugging simple Java programs

---

# 🚀 Future Learning Goals

- Add original `.java` source files
- Build mini Java console applications
- Learn Collections Framework
- Practice Exception Handling
- Explore Multithreading
- Learn JDBC and Spring Boot

---

# 📌 Final Takeaway

This project strengthened my understanding of Java Object-Oriented Programming by giving practical exposure to real class structures, inheritance relationships, encapsulation techniques, polymorphism behavior, abstraction concepts, and Java execution flow.

It serves as a foundational step toward advanced Java development and backend engineering.
