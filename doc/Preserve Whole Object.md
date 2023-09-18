# Preserve Whole Object

Tags: refactor, refactoring api

![Untitled](Preserve%20Whole%20Object%2020304154d53a4b02b236fba0d51c2021/Untitled.png)

# Motivation

If I see code that derives a couple of values from a record and then passes these values into a function, I like to replace those values with the whole record itself, letting the function body derive the values it needs.

Pulling several values from an object to do some logic on them alone is a smell [Feature Envy](Feature%20Envy%20215c8ca14f694d72b1c86c7584c851fe.md) , and usually a signal that this logic should be moved into the whole itself. Preserve Whole Object is particularly common after I’ve done Introduce [Parameter Object](Parameter%20Object%209c61c207ea854b72ace6a27d786a1804.md) , as I hunt down any occurrences of the original data clump to replace them
with the new object.

If several bits of code only use the same subset of an object’s features, then that may indicate a good opportunity for [Extract Class](Extract%20Class%20fea5405508154970a17c9559af87a4a0.md).