# Linked List Learnings

## 1. Check if Linked List is Palindrome

### Core Pattern

Middle + Reverse + Compare

### Steps

1. Find middle using slow and fast pointers.
2. Reverse the second half.
3. Compare first half and second half node by node.

### Recognition Pattern

If the question asks:

* Check palindrome
* Compare first half with second half
* O(1) extra space

Think:

Middle → Reverse → Compare

### Key Learning

Reversing part of a linked list is a very common interview trick.

---

## 2. Find Starting Point of Loop

### Core Pattern

Floyd Cycle Detection Algorithm

### Steps

1. Detect cycle using slow and fast pointers.
2. Once they meet, place one pointer at head.
3. Move both one step at a time.
4. Their meeting point is the start of the loop.

### Recognition Pattern

If the question contains:

* Cycle
* Loop
* Circular traversal
* Find where cycle begins

Think:

Slow Fast Pointer (Floyd Algorithm)

### Key Learning

There are two common cycle questions:

1. Detect whether a cycle exists.
2. Find the starting node of the cycle.

Both use the same algorithm.

---

## 3. Flattening a Linked List

### Core Pattern

Recursion + Merge Two Sorted Lists

### Steps

1. Flatten the right side recursively.
2. Merge current list with the flattened list.
3. Return merged result.

### Recognition Pattern

If the structure contains:

* next pointer
* bottom pointer
* multiple sorted lists

Think:

Merge K Sorted Lists

### Key Learning

This problem is essentially a Linked List version of Merge K Sorted Lists.

---

# Important Linked List Building Blocks

## Reverse Linked List

Used in:

* Palindrome LL
* Reverse in K groups
* Reverse between positions
* Reorder List

---

## Slow and Fast Pointer

Used in:

* Find Middle
* Detect Cycle
* Find Start of Cycle
* Happy Number
* Remove Nth Node

---

## Merge Two Sorted Lists

Used in:

* Merge Sorted Lists
* Flatten LL
* Merge K Sorted Lists
* Sort List

---

# Interview Revision Notes

Whenever you see:

Palindrome
→ Middle + Reverse + Compare

Cycle
→ Floyd Algorithm

Bottom Pointer + Sorted Lists
→ Merge Lists

Middle Node
→ Slow Fast Pointer

Sorted Linked Lists
→ Merge Technique

---

# Today's Takeaway

Most Linked List problems are combinations of only three concepts:

1. Reverse Linked List
2. Slow Fast Pointer
3. Merge Two Sorted Lists

Master these three patterns and a large portion of Linked List interview questions become straightforward.
