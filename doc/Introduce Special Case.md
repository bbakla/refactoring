# Introduce Special Case

Tags: conditional logic, refactor

![Untitled](Introduce%20Special%20Case%20ba0c952054ac4622afbee216259890ae/Untitled.png)

# Motivation

A common case of duplicated code is when many users of a data structure check a specific value, and then most of them do the same thing. If I find many parts of the code base having the same reaction to a particular value, I want to bring that reaction into a single place.

A good mechanism for this is the Special Case pattern where I create a specialcase element that captures all the common behavior. This allows me to replace most of the specialcase checks with simple calls.

A common value that needs specialcase processing is null, which is why this pattern is often called the Null Object pattern. But it’s the same approach for any special case—I like to say that Null Object is a special case of Special Case.