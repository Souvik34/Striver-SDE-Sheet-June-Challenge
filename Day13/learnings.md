# Learnings

## 1. Rotate a Linked List

### Core Pattern

Length + Circular Linked List + Break Point

### Steps

1. Find length of LL.
2. Connect tail to head (make it circular).
3. Find new tail at (n - k % n - 1) position.
4. New head becomes newTail.next.
5. Break the circle.

### Recognition Pattern

If question asks:

* Rotate by k places
* Shift nodes
* Move last k nodes to front

Think:

Length → Circular LL → Break

### Key Learning

Most rotation problems become easy after converting the list into a circular linked list.

---

## 2. Clone Linked List with Next and Random Pointer

### Core Pattern

Interweaving Nodes

### Steps

1. Insert copied node after every original node.
2. Set random pointers of copied nodes.
3. Separate original and copied lists.

### Recognition Pattern

If question contains:

* Random pointer
* Deep copy
* Clone complex linked list

Think:

Interleave → Assign Random → Separate

### Key Learning

Normal copy:

A → B → C

After insertion:

A → A' → B → B' → C → C'

This trick allows O(1) extra space.

### Alternative Approach

HashMap

Original Node → Cloned Node

Time: O(N)

Space: O(N)

Interviewers usually prefer the O(1) space solution.

---

## 3. 3 Sum

### Core Pattern

Sorting + Two Pointers

### Steps

1. Sort the array.
2. Fix one element.
3. Use two pointers on remaining array.
4. Skip duplicates.

### Recognition Pattern

If question asks:

* Triplets
* Sum equals target
* Unique triplets

Think:

Sort + Two Pointer

### Key Learning

Without sorting:
Brute Force → O(N³)

With sorting:
Two Pointer → O(N²)

Huge optimization.

---

# Important Patterns Learned Today

## Circular Linked List Trick

Used in:

* Rotate LL
* Josephus Problem
* Circular Traversal Problems

---

## Clone / Deep Copy Pattern

Used in:

* Random Pointer LL
* Graph Cloning
* Tree Copying

Key idea:

Original Node → Copied Node Mapping

---

## Two Pointer after Sorting

Used in:

* 3 Sum
* 4 Sum
* Pair Sum
* Closest Sum
* Triplet Problems

Whenever you see:

Array + Target Sum

Ask yourself:

Can I sort and use two pointers?

---

# Interview Revision Notes

Rotate LL
→ Length + Circular LL + Break

Clone Random Pointer LL
→ Interweaving Nodes

3 Sum
→ Sort + Two Pointers

---

# Today's Takeaway

Three powerful interview patterns:

1. Circular Linked List Trick
2. Deep Copy / Cloning Pattern
3. Sorting + Two Pointers

These patterns appear repeatedly in Linked Lists, Arrays, Graphs, and System Design interviews.
