# Hide Delegate

Tags: encapsulation, refactor
Inverse: [Remove Middle Man](../Remove%20Middle%20Man/Remove%20Middle%20Man.md)

[](img.png)

# Motivation

If I have some client code that calls a method defined on an object in a field of a server object, the client needs to know about this delegate object. If the delegate changes its interface, changes propagate to all the clients of the server that use the delegate. I can remove this dependency by placing a simple delegating method on the server that hides the delegate. Then any changes I make to the delegate propagate only to the server and not to the clients.