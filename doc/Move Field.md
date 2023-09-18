# Move Field

Tags: moving features, refactor

![Untitled](Move%20Field%20836725c17d7c477faf66209080fcb4cb/Untitled.png)

# Motivation

I may  move data when I always need to pass a field from one record/class whenever I pass another record/class to a function. Pieces of data that are always passed to functions together are usually best put in a single record in order to clarify their relationship. 

Change is also a factor; if a change in one record/class causes a field in another record/class to change too, that’s a sign of a field in the wrong place. If I have to update the same field in multiple structures, that’s a sign that it should move to another place where it only needs to be updated once.

The field to be moved can also be an object.