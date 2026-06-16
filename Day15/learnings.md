# Greedy Algorithms Learnings

## 1. N Meetings in One Room

### Core Pattern

Sort by End Time

### Why?

Meeting that finishes earliest leaves maximum room for future meetings.

### Recognition Pattern

If question asks:

* Maximum activities
* Maximum meetings
* Schedule tasks without overlap

Think:

Sort by Ending Time

### Key Learning

Never sort by start time.

Always prioritize the meeting that finishes first.

---

## 2. Minimum Number of Platforms

### Core Pattern

Arrival and Departure Events

### Why?

Platform count increases on arrival and decreases on departure.

### Recognition Pattern

If question contains:

* Trains
* Platforms
* Overlapping intervals
* Concurrent events

Think:

Sort Arrivals + Sort Departures

### Key Learning

This is an interval overlap problem.

You are not assigning platforms.

You are finding maximum overlap.

---

## 3. Job Sequencing Problem

### Core Pattern

Profit First + Latest Available Slot

### Why?

Higher profit jobs should be considered first.

Schedule them as late as possible before deadline.

### Recognition Pattern

If question contains:

* Deadline
* Profit
* One unit time jobs

Think:

Sort by Profit Descending

### Key Learning

For every job:

Try to place it in the latest available slot.

This preserves earlier slots for future jobs.

---

## 4. Fractional Knapsack

### Core Pattern

Value Per Unit Weight

### Formula

value / weight

### Why?

Take the item that gives maximum profit per unit weight.

### Recognition Pattern

If question contains:

* Fraction allowed
* Partial selection allowed

Think:

Ratio = Value / Weight

### Key Learning

Greedy works only because fractions are allowed.

For 0/1 Knapsack:

Greedy fails.

DP is required.

---

# Important Greedy Patterns

## Earliest Finish Time

Used in:

* Activity Selection
* N Meetings in One Room
* Interval Scheduling

Key Idea:

Finish early, leave room for others.

---

## Event Sweep

Used in:

* Platforms
* Meeting Rooms
* Maximum Overlapping Intervals

Key Idea:

Track arrivals and departures separately.

---

## Profit Based Scheduling

Used in:

* Job Sequencing
* Task Scheduling
* Deadline Scheduling

Key Idea:

Highest reward gets priority.

---

## Ratio Based Greedy

Used in:

* Fractional Knapsack
* Resource Allocation
* Cost Optimization

Key Idea:

Choose best return per unit resource.

---

# Interview Revision Notes

N Meetings
→ Sort by End Time

Platforms
→ Arrival/Departure Sweep

Job Sequencing
→ Profit Descending + Latest Slot

Fractional Knapsack
→ Value/Weight Ratio

---

# Today's Takeaway

When solving Greedy problems always ask:

1. What should I sort on?
2. Why is that choice locally optimal?
3. Does making the best local choice lead to a global optimum?

For these four problems:

Meeting Room
→ Earliest Finish

Platforms
→ Maximum Overlap

Job Sequencing
→ Highest Profit

Fractional Knapsack
→ Highest Value Density
