# Separate Query From Modifier

Tags: refactor, refactoring api

![Untitled](Separate%20Query%20From%20Modifier%20c4e93e1969ed4e9d9162c6382bfbe8f6/Untitled.png)

# Motivation

When I have a function that gives me a value and has no observable side effects, I have a very valuable thing. I can call this function as often as I like. I can move the call to other places in a calling function. It’s easier to test. In short, I have a lot less to worry about.

It is a good idea to clearly signal the difference between functions with side effects and those without. A good rule to follow is that any function that returns a value should not have observable side effects—the command-query separation. If I come across a method that returns a value but also has side effects, I always try to separate the query from the modifier.