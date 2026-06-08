# Striver SDE Sheet Challenge - Day 8

## Problems Solved

1. Longest Substring Without Repeating Characters
2. Largest Subarray With Sum K
3. Count Subarrays With Given XOR K

---

# 1. Longest Substring Without Repeating Characters

## Pattern

Sliding Window + HashMap

## Key Observation

When a duplicate character appears, we don't need to restart the window.

Instead:

* Store the last occurrence of every character.
* Move the left pointer to one position after the duplicate.
* Keep expanding the right pointer.

## Important Formula

```java
left = Math.max(left, map.get(ch) + 1);
```

This prevents the window from moving backward.

## Complexity

* Time: O(N)
* Space: O(256) ≈ O(1)

---

# 2. Largest Subarray With Sum K

## Pattern

Prefix Sum + HashMap

## Key Observation

For a subarray to have sum K:

```text
Current Prefix Sum - Previous Prefix Sum = K
```

Therefore:

```text
Previous Prefix Sum = Current Prefix Sum - K
```

If `(currentSum - K)` exists in the map, then a valid subarray is found.

## Important Trick

Store only the FIRST occurrence of every prefix sum.

```java
if(!map.containsKey(sum))
    map.put(sum, i);
```

This helps maximize the subarray length.

## Complexity

* Time: O(N)
* Space: O(N)

---

# 3. Count Subarrays With XOR K

## Pattern

Prefix XOR + HashMap

## Key Observation

For a subarray XOR equal to K:

```text
PrefixXOR(i) XOR PrefixXOR(j) = K
```

Rearranging:

```text
Required Prefix XOR = CurrentXOR XOR K
```

If this value exists in the map, then valid subarrays exist.

## Important Trick

Initialize:

```java
map.put(0, 1);
```

This handles cases where the XOR from index 0 itself equals K.

## Complexity

* Time: O(N)
* Space: O(N)

---

# Overall Learnings

### Sliding Window

Used when:

* Longest substring
* Distinct characters
* Consecutive elements
* Window optimization

### Prefix Sum

Used when:

* Subarray Sum K
* Longest subarray
* Count of subarrays
* Running totals

### Prefix XOR

Used when:

* XOR subarray problems
* Count subarrays with XOR K
* XOR range queries

### Interview Takeaway

Many O(N²) subarray problems can be optimized to O(N) using:

* HashMap
* Prefix Sum
* Prefix XOR
* Sliding Window

The key is recognizing the pattern rather than memorizing the solution.
