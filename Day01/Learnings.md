# 📅 Day 1

## Problems Solved

1. Set Matrix Zeroes
2. Pascal's Triangle
3. Next Permutation

---

# 1️⃣ Set Matrix Zeroes

## Intuition

A naive approach would immediately set an entire row and column to zero whenever a zero is encountered. However, this introduces new zeros that may incorrectly affect subsequent computations.

To avoid this, we first identify all rows and columns that need to be zeroed and then update the matrix in a separate pass.

## Approach

1. Traverse the matrix and mark rows and columns containing a zero.
2. Store row information in a `row[]` array and column information in a `col[]` array.
3. Traverse the matrix again.
4. If either the corresponding row or column is marked, set the cell to zero.

## Complexity Analysis

**Time Complexity:** `O(M × N)`

**Space Complexity:** `O(M + N)`

### Key Learning

Separate the **observation phase** from the **modification phase** to avoid unintended updates.

---

# 2️⃣ Pascal's Triangle

## Intuition

Each row of Pascal's Triangle can be generated using the previous row.

The first and last element of every row is always `1`.

Every middle element is obtained by adding the two elements directly above it.

## Approach

1. Generate rows one by one.
2. Insert `1` at the beginning and end of each row.
3. For middle positions:

```java
current[j] = previous[j - 1] + previous[j];
```

4. Continue until all rows are generated.

## Complexity Analysis

**Time Complexity:** `O(N²)`

**Space Complexity:** `O(N²)`

### Key Learning

Many problems can be solved by building the current state from previously computed information.

---

# 3️⃣ Next Permutation

## Intuition

The goal is to find the next lexicographically greater arrangement of the given numbers.

The suffix of the array is often in decreasing order, meaning it already represents the largest possible arrangement for those positions.

To obtain the next permutation:

* Find the first position that can be increased.
* Increase it by the smallest possible amount.
* Make the remaining suffix as small as possible.

## Approach

1. Traverse from right to left and find the first index where:

```java
nums[i] < nums[i + 1]
```

This index is called the **pivot**.

2. Find the first element greater than the pivot from the right side and swap them.

3. Reverse the suffix after the pivot.

4. The resulting array becomes the immediate next permutation.

## Complexity Analysis

**Time Complexity:** `O(N)`

**Space Complexity:** `O(1)`

### Key Learning

Understanding **lexicographical ordering** is more important than memorizing the algorithm. The pivot and suffix reversal technique appears in several permutation-related problems.

---

# 🚀 Day 1 Summary

### Problems Solved

✅ Set Matrix Zeroes

✅ Pascal's Triangle

✅ Next Permutation

### Concepts Reinforced

* Matrix Traversal
* Auxiliary Arrays
* Pattern Recognition
* Lexicographical Ordering
* In-place Array Manipulation

### Overall Takeaway

Today's problems emphasized the importance of identifying patterns and understanding the reasoning behind an algorithm rather than memorizing solutions.
