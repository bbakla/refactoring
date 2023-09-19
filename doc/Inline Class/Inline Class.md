# Inline Class

Tags: encapsulation

[Picture](img.png)

# Motivation

Inline Class is the inverse of Extract Class (182). I use Inline Class if a class is no longer pulling its weight and shouldn’t be around any more. Often, this is the result of refactoring that moves other responsibilities out of the class so there is little left. At that point, I fold the class into another—one that makes most use of the runt class.