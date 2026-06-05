# Day 5 - Majority Element | Pow(x, n) | Search a 2D Matrix

## Problems Solved

1. Majority Element
2. Pow(x, n)
3. Search a 2D Matrix

---

# 1. Majority Element

## Problem Statement

Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `⌊n/2⌋` times.

---

## Approach Used

### Sorting

After sorting the array, the majority element will always occupy the middle position because it appears more than half the time.

### Steps

1. Sort the array.
2. Return the element at index `n/2`.

---

## Time Complexity

* Sorting: `O(n log n)`

## Space Complexity

* `O(1)` (excluding sorting implementation details)

---

## Key Learning

* Majority element dominates more than half the array.
* After sorting, it must appear at the middle index.
* Learned about the optimal Boyer-Moore Voting Algorithm which solves the problem in `O(n)` time and `O(1)` space.

---

# 2. Pow(x, n)

## Problem Statement

Implement `pow(x, n)` which calculates `x` raised to the power `n`.

---

## Approach Used

### Built-in Function

Used Java's built-in power function to calculate the answer.

---

## Time Complexity

* Depends on library implementation.
* Generally considered efficient.

## Space Complexity

* `O(1)`

---

## Interview Learning

The important concept behind this problem is:

### Binary Exponentiation (Fast Power)

Instead of multiplying `x` by itself `n` times:

* Repeatedly square the base.
* Reduce exponent by half.

This reduces complexity from:

`O(n)` → `O(log n)`

---

## Key Learning

* Fast Power is a frequently asked interview concept.
* Useful in competitive programming and system design calculations.
* Handles very large exponents efficiently.

---

# 3. Search a 2D Matrix

## Problem Statement

Given a matrix where:

* Each row is sorted.
* The first element of each row is greater than the last element of the previous row.

Determine if a target exists in the matrix.

---

## Approach Used

### Binary Search on Entire Matrix

Treat the matrix as a virtual sorted 1D array.

Example:

1 3 5 7
10 11 16 20
23 30 34 60

Can be viewed as:

1 3 5 7 10 11 16 20 23 30 34 60

Apply Binary Search directly.

---

## Important Trick

Convert 1D index into matrix coordinates:

```java
row = mid / cols;
col = mid % cols;
```

Example:

For `mid = 6` and `cols = 4`

```java
row = 6 / 4 = 1
col = 6 % 4 = 2
```

Element = `matrix[1][2]`

---

## Time Complexity

* `O(log(m × n))`

## Space Complexity

* `O(1)`

---

## Key Learning

* A matrix can sometimes be treated as a sorted 1D array.
* Binary Search is not limited to arrays.
* Understanding index mapping is crucial for matrix problems.

---

# Overall Learnings

* Sorting can simplify frequency-based problems.
* Binary Exponentiation is an essential optimization technique.
* Binary Search can be applied to matrices using index mapping.
* Always look for ways to transform a problem into a familiar pattern.

## Patterns Revised

✅ Sorting

✅ Binary Search

✅ Matrix Index Mapping

✅ Mathematical Optimization

✅ Fast Power Technique
