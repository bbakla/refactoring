# Replace Query with Parameter

Tags: refactor, refactoring api
Inverse: Replace Parameter with Query (Replace%20Parameter%20with%20Query%20e8bf474aabb4481e99983b16e80ce9b5.md)

![Untitled](Replace%20Query%20with%20Parameter%2087d0237d295e4a5d9ffafd51c82d3dac/Untitled.png)

# Motivation

When looking through a function’s body, I sometimes see references to something in the function’s scope that I’m not happy with. This might be a reference to a global variable, or to an element in the same module that I intend to move away. To resolve this, I need to replace the internal reference with a parameter, shifting the responsibility of resolving the reference to the caller of the function.