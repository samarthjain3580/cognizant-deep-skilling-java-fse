# Exercise 2: E-commerce Platform Search Function

## 🎯 Objective

Implement Linear Search and Binary Search algorithms for searching products in an e-commerce platform and compare their performance.

---

## 📚 Concepts Covered

- Big O Notation
- Linear Search
- Binary Search
- Arrays
- Time Complexity
- Best, Average and Worst Case

---

## Project Structure

```
SearchAlgorithmExample
│
└── src
    └── search
        ├── Product.java
        └── SearchTest.java
```

---

## Sample Output

```
===== Linear Search =====
Product ID : 104
Product Name : Watch
Category : Accessories

===== Binary Search =====
Product ID : 104
Product Name : Watch
Category : Accessories
```

---

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Interview Notes

- Linear Search works on both sorted and unsorted arrays.
- Binary Search requires a sorted array.
- Binary Search is much faster for large datasets.
- Big O notation measures algorithm efficiency.

---

## Key Takeaway

Binary Search is preferred for large sorted datasets because it repeatedly divides the search space into halves, making it significantly faster than Linear Search.