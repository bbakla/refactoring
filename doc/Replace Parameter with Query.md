# Replace Parameter with Query

Tags: refactor, refactoring api
Inverse: Replace Query with Parameter (Replace%20Query%20with%20Parameter%2087d0237d295e4a5d9ffafd51c82d3dac.md)

![Untitled](Replace%20Parameter%20with%20Query%20e8bf474aabb4481e99983b16e80ce9b5/Untitled.png)

# Motivation

It’s good to avoid any duplication in the parameter list to a function, and it’s easier to understand if the parameter list is short.

If a call passes in a value that the function can just as easily determine for itself, that’s a form of duplication—one that unnecessarily complicates the caller(client) which has to determine the value of a parameter when it could be freed from that work.

The most common reason to avoid Replace Parameter with Query is if removing the parameter adds an unwanted dependency to the function body—forcing it to access a program element that I’d rather it remained ignorant of.

# Mechanism

- If necessary, use [Extract Function](Extract%20Function%20f20e8d100df7460e85563310e63c8312.md)  on the calculation of the parameter.
- Replace references to the parameter in the function body with references to the expression that yields the parameter. Test after each change.
- Use [Change Function Declaration (Rename Function)](Change%20Function%20Declaration%20(Rename%20Function)%20a0e908e5b91e44d68d8ef9892ff83749.md)  to remove the parameter.