# Striver SDE Sheet Challenge – Day 10

## Problems Solved

### 1. Remove Nth Node From End of List

**Problem Link:** LeetCode 19

#### Approach

Used the Two Pointer technique to remove the Nth node from the end in a single traversal.

1. Create a dummy node pointing to the head.
2. Move the fast pointer `n` steps ahead.
3. Move both fast and slow pointers together until fast reaches the last node.
4. The slow pointer will be positioned just before the node to be deleted.
5. Update the links to remove the target node.

#### Key Learning

* Two Pointer Technique
* Single Pass Solution
* Dummy Node Usage
* Linked List Edge Cases

#### Complexity

* Time Complexity: **O(N)**
* Space Complexity: **O(1)**

---

### 2. Add Two Numbers

**Problem Link:** LeetCode 2

#### Approach

Traverse both linked lists simultaneously while maintaining a carry.

1. Add corresponding digits from both lists.
2. Include carry from the previous addition.
3. Create a new node using `sum % 10`.
4. Update carry using `sum / 10`.
5. Continue until both lists and carry are exhausted.

#### Key Learning

* Carry Handling
* Linked List Construction
* Dummy Node Pattern
* Managing Different List Lengths

#### Complexity

* Time Complexity: **O(max(N, M))**
* Space Complexity: **O(max(N, M))**

---

### 3. Delete Node in a Linked List

**Problem Link:** LeetCode 237

#### Approach

The node to be deleted is given directly, without access to the head.

1. Copy the value of the next node into the current node.
2. Skip the next node by updating pointers.
3. The current node effectively becomes the next node.

#### Key Learning

* In-place Linked List Modification
* Special Deletion Technique
* O(1) Deletion

#### Complexity

* Time Complexity: **O(1)**
* Space Complexity: **O(1)**

---

## Overall Learnings

### Linked List Concepts Revised

* Dummy Nodes
* Two Pointer Technique
* Carry Propagation
* In-place Node Deletion
* Single Traversal Solutions
* Edge Case Handling

### Interview Takeaways

These problems are frequently asked in interviews and help build a strong foundation for advanced Linked List questions such as:

* Reverse Nodes in K Group
* Copy List with Random Pointer
* LRU Cache
* Linked List Cycle II
* Merge K Sorted Lists

---

## Progress Tracker

| Day   | Topic        | Status      |
| ----- | ------------ | ----------- |
| Day X | Linked Lists | ✅ Completed |

---


