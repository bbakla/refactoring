# Extract Function

Tags: basics
Inverse: [Inline Function](../Inline%20Function/Inline%20Function.md)

[Image](img.png)

# Motivation

If you have to spend effort looking at a fragment of code and figuring out what it’s doing, then you should extract it into a function and name the function after the “what.” Then, when you read it again, the purpose of the function leaps right out at you, and most of the time you won’t need to care about how the function fulfills its purpose (which is the body of the function).

Once I accepted this principle, I developed a habit of writing very small functions—
typically, only a few lines long. To me, any function with more than half a dozen lines of code starts to smell, and it’s not unusual for me to have functions that are a single line of code.

Small functions like this only work if the names are good, so you need to pay good attention to naming. This takes practice—but once you get good at it, this approach can make code remarkably self documenting. Often, I see fragments of code in a larger function that start with a comment to say what they do. The comment is often a good hint for the name of the function when I extract that fragment.

# Mechanics

- Create a new function, and name it after the intent of the function (name it by what it does, not by how it does it).
    
    If I can’t come up with a more meaningful name, that’s a sign that I shouldn’t extract the code. However, I don’t have to come up with the best name right away; sometimes a good name only appears as I work with the extraction. It’s OK to extract a function, try to work with it, realize it isn’t helping, and then inline it back again.
    
- Scan the extracted code for references to any variables that are local in scope to the
source function and will not be in scope for the extracted function. Pass them as
parameters.
    
    Sometimes, I find that too many local variables are being assigned by the extracted code. It’s better to abandon the extraction at this point. When this happens, I consider other refactorings such as `Split Variable`or `Replace Temp with Query`