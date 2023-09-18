# Refused Request

Tags: code smell
Inverse: Push Down Method (https://www.notion.so/Push-Down-Method-6742907f6cd743b88b56f0ab75b0f025?pvs=21) 
Push down Field (Push%20down%20Field%203f4c145a1c36447d93b4f4353b75757e.md) 
Replace Subclass with Delegate (Replace%20Subclass%20with%20Delegate%20e8ae783f3884419286d2770b8961c969.md) 
Replace Superclass with Delegate (Replace%20Superclass%20with%20Delegate%20e493917ca4a841758adc9e0c84c86779.md)

Subclasses get to inherit the methods and data of their parents. But what if they don’t want or need what they are given? They are given all these great gifts and pick just a few to play with.

The traditional story is that this means the hierarchy is wrong. You need to create a new sibling class and use Push Down Method (359) and Push Down Field (361) to push all the unused code to the sibling. That way the parent holds only what is common. Often, you’ll hear advice that all superclasses should be abstract.

We do subclassing to reuse a bit of behavior all the time, and we find it a perfectly good way of doing business. There is a smell—we can’t deny it—but
usually it isn’t a strong smell. So, we say that if the refused bequest is causing confusion and problems, follow the traditional advice. However, don’t feel you have to do it all the time.