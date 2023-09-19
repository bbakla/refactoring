# Replace Primitive With Object

Tags: encapsulation

[](img.png)

# Motivation

Often, in early stages of development you make decisions about representing simple facts as simple data items, such as numbers or strings. As development proceeds, those simple items aren’t so simple anymore. A telephone number may be represented as a string for a while, but later it will need special behavior for formatting, extracting the area code, and the like. This kind of logic can quickly end up being duplicated around the code base, increasing the effort whenever it needs to be used.

As soon as I realize I want to do something other than simple printing, I like to create a new class for that bit of data. At first, such a class does little more than wrap the primitive—but once I have that class, I have a place to put behavior specific to its needs. These little values start very humble, but once nurtured they can grow into useful tools.

# Mechanics

1. Apply [Encapsulate Variable](Encapsulate%20Variable%201e5d2a6463384ed18a9f10cfa2a4eb4f.md) if it isnt already applied
2. Create the class and then accessors for this variable