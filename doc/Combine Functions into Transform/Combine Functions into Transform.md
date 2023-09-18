# Combine Functions into Transform

Tags: refactor
Related: Combine Functions into Class (Combine%20Functions%20into%20Class%20bc838c0e357a481b904e596cb0c868a1.md)

[Picture](img.png)
# Motivation

Software often involves feeding data into programs that calculate various derived information from it. These derived values may be needed in several places, and those calculations are often repeated wherever the derived data is used. I prefer to bring all of these derivations together, so I have a consistent place to find and update them and avoid any duplicate logic.

The idea is to combine the functions that work on the same source data and return a final output from the combined function.

Prefer [Combine Functions into Class](Combine%20Functions%20into%20Class%20bc838c0e357a481b904e596cb0c868a1.md) when possible as it can prevent inconsistencies source data changes, since they will be instance variables and will belong to new instances.