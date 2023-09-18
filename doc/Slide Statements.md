# Slide Statements

Tags: moving features, refactor

# Motivation

If several lines of code access the same data structure, it’s best for them to be together
rather than intermingled with code accessing other data structures. At its simplest, I use Slide Statements to keep such code together. A very common case of this is declaring and using variables. Some people like to declare all their variables at the top of a function. I prefer to declare the variable just before I first use it.