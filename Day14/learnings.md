# Learnings

## 1. Trapping Rain Water

### Core Pattern

Prefix Maximum + Suffix Maximum

OR

Two Pointers Optimization

### Intuition

Water stored at a position depends on:

min(leftMax, rightMax) - height[i]

### Steps (Two Pointer Approach)

1. Maintain left and right pointers.
2. Keep track of leftMax and rightMax.
3. Move the smaller side.
4. Calculate trapped water.

### Recognition Pattern

If question contains:

* Buildings
* Heights
* Water storage
* Rain water

Think:

Left Max + Right Max

### Key Learning

Water at a position is determined by the smaller boundary.

Not:

max(leftMax, rightMax)

But:

min(leftMax, rightMax)

### Common Mistake

Using current height instead of boundary heights.

Always think:

Water Level = Smaller Boundary

---

## 2. Remove Duplicates from Sorted Array

### Core Pattern

Two Pointers

### Steps

1. One pointer tracks unique elements.
2. Another pointer scans the array.
3. When a new unique value is found:

   * Place it at the next valid position.
4. Return count of unique elements.

### Recognition Pattern

If question contains:

* Sorted array
* In-place modification
* Remove duplicates

Think:

Slow Pointer + Fast Pointer

### Key Learning

The array is already sorted.

Therefore:

All duplicates are adjacent.

No HashSet needed.

### Common Mistake

Using extra space when the problem explicitly asks for in-place modification.

---

## 3. Maximum Consecutive Ones

### Core Pattern

Linear Traversal + Counter

### Steps

1. Traverse array.
2. If current element is 1:

   * Increment count.
3. Else:

   * Reset count.
4. Maintain maximum count.

### Recognition Pattern

If question asks:

* Longest streak
* Consecutive occurrences
* Continuous segment

Think:

Running Count

### Key Learning

Not every problem needs sliding window.

Sometimes a simple counter is enough.

### Common Mistake

Trying to use extra arrays or nested loops.

One pass is sufficient.

---

# Important Patterns Learned Today

## Prefix and Suffix Information

Used in:

* Trapping Rain Water
* Product Except Self
* Equilibrium Index
* Range Queries

Key Idea:

Store information from left and right.

---

## Two Pointer Technique

Used in:

* Remove Duplicates
* Move Zeroes
* 3 Sum
* Container With Most Water
* Sorted Array Problems

Key Idea:

One pointer processes.
One pointer explores.

---

## Running Count Pattern

Used in:

* Maximum Consecutive Ones
* Longest Increasing Streak
* Consecutive Characters
* Binary Array Problems

Key Idea:

Track current streak and update answer.

---

# Interview Revision Notes

Trapping Rain Water
→ Left Max + Right Max

Remove Duplicates
→ Slow Fast Pointer

Maximum Consecutive Ones
→ Running Count

---

# Today's Takeaway

Three highly reusable patterns:

1. Prefix/Suffix Information
2. Two Pointers
3. Running Streak Counter

Whenever you see:

Array + Consecutive Elements
→ Running Count

Sorted Array
→ Two Pointers

Left Boundary + Right Boundary
→ Prefix/Suffix Thinking
