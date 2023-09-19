# Middle Man

**Tags:** code smell
**Inverse:** </br>
[Replace Subclass with Delegate](../Replace%20Subclass%20with%20Delegate/Replace%20Subclass%20with%20Delegate.md)</br>
[Superclass with Delegate](./Replace%20Superclass%20with%20Delegate/Replace%20Superclass%20with%20Delegate.md)</br>

One of the prime features of objects is encapsulation—hiding internal details from the rest of the
world. Encapsulation often comes with delegation. You ask a director whether she is free for a
meeting; she delegates the message to her diary and gives you an answer. All well and good. There 
is no need to know whether the director uses a diary, an electronic gizmo, or a secretary to keep
track of her appointments. 

However, this can go too far. You look at a class’s interface and find half the methods are 
delegating to this other class.