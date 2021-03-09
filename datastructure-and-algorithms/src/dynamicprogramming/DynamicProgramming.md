This is an optimization of recursion, instead of recalculating solutions we store solutions for use later.

There is two steps for Dynamic Programming:
1. Find the section of a recursive algorithm where it redundantly solves sub problems many times.
2. Eliminate this by storing the solved value (Tabulation or Memoization). Iterating through the solved array to solve the current problem. 

Tabulation vs Memoization
Tabulation -> Bottom Up
Memoization -> Top Down

find solution for Fibonacci Tabulation vs Memoization
int fibTab(int n)

int fibMemo(int n, int[] memo)

