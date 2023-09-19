# Extract Superclass

Tags: dealing with inheritance, refactor

(Untitled.png)

# Motivation

If I see two classes doing similar things, I can take advantage of the basic mechanism of inheritance to pull their similarities together into a superclass. I can use [Pull up Field](Pull%20up%20Field%203179dccab395439bbe6ed384c7422f30.md)  to move common data into the superclass, and [Pull up Method](Pull%20up%20Method%2085b731771ff546bd9511d54d927a9d96.md)  to move the common behavior.