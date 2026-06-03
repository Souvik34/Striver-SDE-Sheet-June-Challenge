# Day 3 - Striver SDE Sheet Revision

## Problems Solved

1. Rotate Image
2. Merge Sorted Array
3. Merge Intervals

---

# 1. Rotate Image

### Problem

Rotate an `n x n` matrix by **90 degrees clockwise** in-place.

### Approach

Instead of creating another matrix:

1. Transpose the matrix

   * Convert rows into columns.
2. Reverse every row.

Example:

Input:

```text
1 2 3
4 5 6
7 8 9
```

After Transpose:

```text
1 4 7
2 5 8
3 6 9
```

After Reversing Rows:

```text
7 4 1
8 5 2
9 6 3
```

### Key Learning

* Matrix transformations can often be broken into smaller operations.
* Transpose + Reverse Row is a common interview trick.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

# 2. Merge Sorted Array

### Problem

Merge two sorted arrays into `nums1` in-place.

### Approach

Use three pointers:

* `i` → last valid element of nums1
* `j` → last element of nums2
* `k` → last position of nums1

Compare elements from the end and place the larger element at position `k`.

This avoids overwriting existing values.

### Example

```text
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
```

Start comparing from the end:

```text
6 > 3 → place 6
5 > 3 → place 5
3 > 2 → place 3
```

Result:

```text
[1,2,2,3,5,6]
```

### Key Learning

* Whenever extra space exists at the end of an array, consider processing from the back.
* Two-pointer techniques can eliminate the need for extra memory.

### Time Complexity

```text
O(m+n)
```

### Space Complexity

```text
O(1)
```

---

# 3. Merge Intervals

### Problem

Merge all overlapping intervals.

Example:

```text
[[1,3],[2,6],[8,10],[15,18]]
```

Output:

```text
[[1,6],[8,10],[15,18]]
```

### Approach

1. Sort intervals based on start time.
2. Add the first interval to the result.
3. Compare the current interval with the last merged interval.
4. If overlapping:

   * Update end time using max().
5. Otherwise:

   * Add a new interval to the result.

### Overlap Condition

```text
current.start <= previous.end
```

If true:

```text
Merge
```

Otherwise:

```text
Add New Interval
```

### Key Learning

* Most interval problems start with sorting.
* The overlap condition is the heart of interval-based questions.

### Time Complexity

```text
O(n log n)
```

(Sorting dominates)

### Space Complexity

```text
O(n)
```

---

# Patterns Revised Today

* Matrix Manipulation
* Two Pointers
* In-Place Algorithms
* Sorting
* Greedy
* Interval Merging

## Summary

Today's problems reinforced three important interview patterns:

* Transforming matrices using transpose operations.
* Using two pointers efficiently for in-place array manipulation.
* Solving interval problems through sorting and overlap detection.

Consistent revision of these patterns helps build strong problem-solving intuition for coding interviews.
