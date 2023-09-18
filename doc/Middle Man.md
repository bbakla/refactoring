# Middle Man

Tags: code smell
Inverse: Replace Subclass with Delegate (Replace%20Subclass%20with%20Delegate%20e8ae783f3884419286d2770b8961c969.md) Replace%20Subclass%20with%20Delegate%20e8ae783f3884419286d2770b8961c969.mdReplace Superclass with Delegate (Replace%20Superclass%20with%20Delegate%20e493917ca4a841758adc9e0c84c86779.md)

One of the prime features of objects is encapsulation—hiding internal details from the rest of the world. Encapsulation often comes with delegation. You ask a director whether she is free for a meeting; she delegates the message to her diary and gives you an answer. All well and good. There is no need to know whether the director uses a diary, an electronic gizmo, or a secretary to keep track of her appointments. 

However, this can go too far. You look at a class’s interface and find half the methods are delegating to this other class.