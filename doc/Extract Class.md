# Extract Class

Tags: encapsulation, refactor

# Motivation

Imagine a class with many methods and quite a lot of data. A class that is too big to understand easily. You need to consider where it can be split—and split it. A good sign is when a subset of the data and a subset of the methods seem to go together. Other good signs are subsets of data that usually change together or are particularly dependent on each other. A useful test is to ask yourself what would happen if you remove a piece of data or a method. What other fields and methods would become nonsense?