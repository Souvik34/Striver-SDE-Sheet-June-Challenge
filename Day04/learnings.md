# Day 4 - Striver's SDE Sheet

## Problems Solved

1. Find the Duplicate Number
2. Find the Repeating and Missing Number
3. Count Inversions in an Array

---

# 1. Find the Duplicate Number

## Approach
Used **Floyd's Cycle Detection Algorithm (Tortoise and Hare)**.

Since the array contains numbers in the range `[1, n]`, each value can be treated as a pointer to the next index, forming a linked list. The duplicate number creates a cycle.

### Steps
1. Use slow and fast pointers to find the meeting point inside the cycle.
2. Reset one pointer to the start.
3. Move both pointers one step at a time.
4. The point where they meet again is the duplicate number.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

## Key Learning
A problem that looks like an array problem can sometimes be transformed into a linked list cycle detection problem.

---

# 2. Find the Repeating and Missing Number

## Approach
Used the **Mathematical Formula Method**.

Let:
- Repeating number = x
- Missing number = y

Using:

Sum Difference:
```text
x - y = Actual Sum - Expected Sum
```
Square Sum Difference:

x² - y² = Actual Square Sum - Expected Square Sum

From:

x² - y² = (x - y)(x + y)

we can calculate:

x + y

and solve for both x and y.

Time Complexity
O(n)
Space Complexity
O(1)
Key Learning

Mathematical observations can eliminate the need for extra data structures and lead to optimal solutions.

---

# 3. Count Inversions in an Array
## Approach

Used Merge Sort.

During the merge step:

If left[i] <= right[j], continue normally.
If left[i] > right[j], then all remaining elements in the left subarray will also be greater than right[j].

Number of inversions added:

(mid - i + 1)

This allows counting inversions while sorting.

Time Complexity
O(n log n)
Space Complexity
O(n)
Key Learning

Merge Sort is not only used for sorting but can also solve counting and range-based problems efficiently.

Overall Learnings
Floyd's Cycle Detection can solve array problems with constant space.
Mathematical formulas can simplify problems involving missing and duplicate elements.
Merge Sort is a powerful technique beyond sorting and frequently appears in interview questions.
Always look for opportunities to optimize brute-force solutions from O(n²) to O(n log n) or O(n).
Topics Covered
Arrays
Two Pointers
Floyd's Cycle Detection
Mathematics
Bit Manipulation (Alternative Approach)
Merge Sort
Divide and Conquer