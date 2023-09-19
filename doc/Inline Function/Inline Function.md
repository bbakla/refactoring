# Inline Function

Tags: refactor
Inverse: Extract Function (../Extract%20Function/Extract%20Function.md)

[](img.png)

# Motivation

Sometimes, I do come across a function in which the body is as clear as the name. Or, I refactor the body of the code into something that is just as clear as the name. When this happens, **I get rid of the function**. Indirection can be helpful, but needless indirection is irritating.

# Mechanics

- Find all the callers of the function.
- Test after each replacement