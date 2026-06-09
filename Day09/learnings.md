# Day 9 - Linked List Fundamentals

## 1. Reverse Linked List

### Problem

Reverse a singly linked list and return the new head.

### Approach

Use three pointers:

* `prev` → Previous node
* `curr` → Current node
* `next` → Stores the next node before reversing

### Key Pattern

```java
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
```

### Learning

* Never lose the next node before reversing links.
* Pointer manipulation is the foundation of many Linked List problems.
* This pattern is reused in:

  * Reverse Linked List II
  * Reverse Nodes in K Group
  * Palindrome Linked List
  * Reorder List

### Complexity

* Time: O(n)
* Space: O(1)

---

## 2. Middle of the Linked List

### Problem

Find the middle node of a linked list.

### Approach

Use the Fast & Slow Pointer technique.

```java
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
```

### Key Insight

* Slow moves one step.
* Fast moves two steps.
* When Fast reaches the end, Slow reaches the middle.

### Learning

* Also known as the Tortoise and Hare Algorithm.
* Used in:

  * Cycle Detection
  * Find Start of Cycle
  * Palindrome Linked List
  * Reorder List

### Complexity

* Time: O(n)
* Space: O(1)

---

## 3. Merge Two Sorted Lists

### Problem

Merge two sorted linked lists into one sorted linked list.

### Approach

Compare the current nodes of both lists and attach the smaller node to the result list.

```java
if (list1.val <= list2.val) {
    temp.next = list1;
    list1 = list1.next;
} else {
    temp.next = list2;
    list2 = list2.next;
}

temp = temp.next;
```

### Key Pattern

```text
Compare → Attach → Move
```

### Learning

* Dummy nodes simplify implementation.
* Efficiently merges two sorted sequences.
* Forms the basis of Merge Sort on Linked Lists.

### Complexity

* Time: O(n + m)
* Space: O(1)

---

# Overall Takeaways

### Reverse Linked List

Pattern:

```text
Next → Link → Prev → Curr
```

### Middle of Linked List

Pattern:

```text
Slow = 1 step
Fast = 2 steps
```

### Merge Two Sorted Lists

Pattern:

```text
Compare → Attach → Move
```

## Key Learnings

* Mastered Linked List pointer manipulation.
* Understood Fast & Slow Pointer techniques.
* Learned how to merge sorted linked structures efficiently.
* Improved handling of edge cases such as empty lists and even-length lists.
* Built a strong foundation for advanced Linked List problems.
