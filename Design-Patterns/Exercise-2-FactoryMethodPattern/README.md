# Exercise 2: Factory Method Pattern

## 🎯 Objective

Implement the Factory Method Design Pattern to create different types of documents without exposing object creation logic to the client.

---

## 📚 Concepts Covered

- Factory Method Design Pattern
- Abstraction
- Polymorphism
- Interfaces
- Loose Coupling

---

## Classes Implemented

- Document (Interface)
- WordDocument
- PdfDocument
- ExcelDocument
- DocumentFactory (Abstract Class)
- WordDocumentFactory
- PdfDocumentFactory
- ExcelDocumentFactory
- FactoryTest

---

## Sample Output

```
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

---

## 🧠 Interview Notes

- Factory Method delegates object creation to subclasses.
- It promotes loose coupling.
- The client does not instantiate objects directly.
- It follows the Open/Closed Principle.
- Common use cases:
  - Database Drivers
  - Notification Systems
  - Payment Gateways
  - Document Editors

---

## ✅ Key Takeaway

The Factory Method Pattern centralizes object creation and makes applications easier to extend without modifying existing client code.