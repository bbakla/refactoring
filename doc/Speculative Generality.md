# Speculative Generality

**Tags**: code smell
**Inverse:** 
[Collapse Hierarchy](./Collapse%20Hierarchy/Collapse%20Hierarchy.md) 
[Inline Class](./Inline%20Class/Inline%20Class.md) 
[Inline Function](./Inline%20Function/Inline%20Function.md) 
[Change Function Declaration (Rename Function)](./Change%20Function%20Declaration/Change%20Function%20Declaration.md) 
[Remove Dead Code](./Remove%20Dead%20Code/Remove%20Dead%20Code.md)

You get it when people say, “Oh, I think we’ll need the ability to do this kind of thing someday”
and thus add all sorts of hooks and special cases to handle things that aren’t required.

Speculative generality can be spotted when the only users of a function or class are test cases.