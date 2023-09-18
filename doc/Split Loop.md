# Split Loop

Tags: moving features, refactor

# Motivation

You often see loops that are doing two different things at once just because they can do
that with one pass through a loop. But if you’re doing two different things in the same
loop, then whenever you need to modify the loop you have to understand both things.
By splitting the loop, you ensure you only need to understand the behavior you need to
modify. Splitting a loop can also make it easier to use.

Many programmers are uncomfortable with this refactoring, as it forces you to execute
the loop twice. My reminder, as usual, is to separate refactoring from optimization (Refactoring and Performance (64)). Once I have my code clear, I’ll optimize it, and if the loop traversal is a bottleneck, it’s easy to slam the loops back together