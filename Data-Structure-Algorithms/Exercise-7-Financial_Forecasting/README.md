# Exercise 7: Financial Forecasting

## 🎯 Objective

Implement a recursive algorithm to forecast future financial values based on an annual growth rate.

---

## 📚 Concepts Covered

- Recursion
- Base Case
- Recursive Case
- Time Complexity
- Space Complexity

---

## Project Structure

```
FinancialForecastingExample
│
└── src
    └── forecast
        └── FinancialForecast.java
```

---

## Algorithm

```
forecast(amount, rate, years)

if years == 0
    return amount

return forecast(amount × (1 + rate), rate, years - 1)
```

---

## Sample Output

```
Current Value : ₹10000.0
Growth Rate : 10.0%
Years : 5
Future Value : ₹16105.10
```

---

## Time Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## Advantages

- Simple implementation
- Demonstrates recursion clearly
- Easy to understand for beginners

---

## Limitations

- Uses additional stack memory because of recursive calls.
- For very large values of `years`, an iterative approach is more memory efficient.

---

## Optimization

The recursive solution can be optimized by using an iterative approach, which avoids recursive call stack overhead while maintaining the same O(n) time complexity.

---

## Key Takeaway

Recursion solves a problem by breaking it into smaller subproblems until a base case is reached. This exercise demonstrates how recursion can be applied to financial forecasting.