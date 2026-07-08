# Exercise 1: Singleton Pattern

## 🎯 Objective

Implement the Singleton Design Pattern to ensure that only one instance of the `Logger` class exists throughout the application.

---

## 📚 Concepts Covered

- Singleton Design Pattern
- Private Constructor
- Static Instance Variable
- Static Factory Method (`getInstance()`)
- Object Reuse

---

## 📁 Project Structure

```
Exercise-1-SingletonPattern
│
├── README.md
└── SingletonPatternExample
    ├── src
    │   └── singleton
    │       ├── Logger.java
    │       └── TestLogger.java
    └── ...
```

---

## ▶️ Sample Output

```text
Logger Instance Created
LOG: Application Started
LOG: Singleton Pattern Working
Logger 1: singleton.Logger@4783da3f
Logger 2: singleton.Logger@4783da3f
Same Instance: true
```

---

## 🧠 Interview Notes

- Singleton ensures that only one object of a class is created.
- The constructor must be `private`.
- The instance is stored in a `static` variable.
- The object is accessed using the `getInstance()` method.
- Common real-world examples:
  - Logger
  - Database Connection
  - Configuration Manager
  - Cache Manager

---

## ✅ Key Takeaway

The Singleton Pattern is used when exactly one object is required throughout the application's lifecycle. It helps save memory, provides a global access point, and ensures consistent behavior across the application.