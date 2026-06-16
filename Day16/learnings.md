

## 1. Minimum Coins

### Core Pattern

Greedy Coin Selection

### Idea

Always pick the largest coin denomination possible.

Example:

```text
Amount = 49

Take 20
Take 20
Take 5
Take 2
Take 2

Total Coins = 5
```

### Recognition Pattern

If question contains:

* Currency denominations
* Minimum coins
* Canonical coin system

Think:

Greedy

### Key Learning

This works because Indian denominations are specially designed.

```text
1,2,5,10,20,50,100,200,500,2000
```

For arbitrary denominations:

```text
1,3,4
Amount = 6
```

Greedy fails.

DP is needed.

---

## 2. Assign Cookies

### Core Pattern

Sorting + Two Pointers

### Idea

Give the smallest possible cookie that satisfies a child.

### Steps

1. Sort greed array.
2. Sort cookie array.
3. Match smallest greedy child first.

### Recognition Pattern

If question contains:

* Matching
* Assignment
* Resource allocation

Think:

Sort Both Arrays

### Key Learning

Never waste a large cookie on a less greedy child.

Always satisfy the easiest child first.

---

## 3. Subset Sums

### Core Pattern

Pick / Not Pick Recursion

### Idea

For every element:

```text
Pick
Not Pick
```

At leaf node:

```text
Store Sum
```

### Recognition Pattern

If question contains:

* Generate all sums
* All possible subset sums

Think:

Recursion Tree

### Key Learning

For n elements:

```text
2^n subsets
```

Every root-to-leaf path corresponds to one subset.

### Mental Model

```text
Pick
Not Pick

Pick
Not Pick

Pick
Not Pick
```

Eventually reaches all possible sums.

---

## 4. Subsets II

### Core Pattern

Backtracking + Sorting + Skip Duplicates

### Idea

Generate subsets while avoiding duplicate branches.

### Key Observation

For:

```text
[1,2,2]
```

These create duplicate subsets:

```text
Start with first 2
Start with second 2
```

Both generate same subset family.

### Solution

Sort first:

```text
[1,2,2]
```

Then:

```java
if(i > index && nums[i] == nums[i-1])
    continue;
```

### Recognition Pattern

If question contains:

* Unique subsets
* Duplicate elements
* Distinct combinations

Think:

Sort + Skip Duplicates

### Most Important Learning

Duplicates are skipped:

```text
Horizontally
```

Same recursion level.

Not:

```text
Vertically
```

Deeper recursion.

### Example

Wrong:

```text
[]
├── first 2
└── second 2
```

Skip second branch.

Correct:

```text
[2]
 |
 └── second 2
```

Allowed.

This generates:

```text
[2,2]
```

which is valid.

---

# Important Patterns Learned

## Greedy Choice

Used In:

* Minimum Coins
* Fractional Knapsack
* Job Sequencing

Question:

```text
What is the best local decision?
```

---

## Sorting + Two Pointers

Used In:

* Assign Cookies
* Remove Duplicates
* 3 Sum

Question:

```text
Can sorting simplify matching?
```

---

## Pick / Not Pick Recursion

Used In:

* Subset Sums
* Subsequences
* Target Sum

Question:

```text
For every element:
Take it or Leave it?
```

---

## Backtracking + Duplicate Skipping

Used In:

* Subsets II
* Combination Sum II
* Permutations II

Question:

```text
Can identical choices generate duplicate answers?
```

---

# Interview Revision Notes

Minimum Coins
→ Largest Denomination First

Assign Cookies
→ Sort + Match Smallest First

Subset Sums
→ Pick / Not Pick

Subsets II
→ Sort + Skip Duplicate Branches

---

# Today's Takeaway

Whenever you see:

Greedy Optimization
→ Sort and make the best local choice.

All Possible Combinations
→ Recursion.

Duplicates + Backtracking
→ Sort first and skip duplicate branches.

This is the foundation for Combination Sum, Permutations, N-Queens, Sudoku Solver, and many interview-level backtracking problems.
