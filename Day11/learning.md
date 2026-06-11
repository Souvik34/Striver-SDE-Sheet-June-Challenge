# Striver SDE Sheet Challenge – Linked List Mastery

## Day 11: Solved 3 Important Linked List Problems

Today I focused on strengthening my understanding of pointer manipulation, cycle detection, and advanced linked list transformations.

---

## 1. Intersection of Two Linked Lists (LeetCode 160)

### Problem
Find the node at which two singly linked lists intersect.

### Approach
- Used the Two Pointer technique.
- Traverse both lists simultaneously.
- When a pointer reaches the end, redirect it to the head of the other list.
- Both pointers eventually travel the same distance and meet at the intersection node.

### Key Learning
- Compare nodes (`a == b`) and not values.
- Elegant O(N + M) solution with O(1) extra space.

### Complexity
- Time: O(N + M)
- Space: O(1)

---

## 2. Linked List Cycle (LeetCode 141)

### Problem
Determine whether a linked list contains a cycle.

### Approach
- Applied Floyd's Cycle Detection Algorithm (Tortoise & Hare).
- Slow pointer moves one step.
- Fast pointer moves two steps.
- If they ever meet, a cycle exists.

### Key Learning
- Fast and slow pointers are a powerful pattern for linked list problems.
- Detects cycles efficiently without extra memory.

### Complexity
- Time: O(N)
- Space: O(1)

---

## 3. Reverse Nodes in K-Group (LeetCode 25)

### Problem
Reverse nodes of a linked list in groups of size K.

### Approach
- First verify whether K nodes are available.
- Reverse exactly K nodes using standard linked list reversal.
- Connect the reversed group to the remaining processed list.
- Leave the final group unchanged if it contains fewer than K nodes.

### Key Learning
- Advanced application of linked list reversal.
- Requires careful pointer manipulation and group management.
- Frequently asked in top product-based company interviews.

### Complexity
- Time: O(N)
- Space: O(1) (Iterative Approach)

---

## Key Takeaways

- Two Pointer Technique
- Floyd's Cycle Detection Algorithm
- Linked List Reversal Patterns
- Pointer Manipulation
- In-Place Transformations
- O(1) Space Optimizations
- Interview-Oriented Problem Solving

---

## Problems Solved

| Problem | Difficulty |
|----------|------------|
| Intersection of Two Linked Lists | Easy |
| Linked List Cycle | Easy |
| Reverse Nodes in K-Group | Hard |

---

### Consistency > Intensity

Every linked list problem strengthens understanding of pointers, memory references, and core data structure concepts that frequently appear in software engineering interviews.

Happy Coding! 🚀