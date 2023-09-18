# Speculative Generality

Tags: code smell
Inverse: Collapse Hierarchy (Collapse%20Hierarchy%200ebbcb246ce24c0290b1f00019ac7d06.md) 
Inline Class (Inline%20Class%200bb5d903faeb496cb6c04e8acfb358ba.md) 
Inline Function (Inline%20Function%2094e470a0329a4f0395f0a2b91da7252d.md) 
Change Function Declaration (Rename Function) (Change%20Function%20Declaration%20(Rename%20Function)%20a0e908e5b91e44d68d8ef9892ff83749.md) 
Remove Dead Code (Remove%20Dead%20Code%20fa83af43a8034cc98fa63714c40e185d.md)

You get it when people say, “Oh, I think we’ll need the ability to do this kind of thing someday” and thus add all sorts of hooks and special cases to handle things that aren’t required.

Speculative generality can be spotted when the only users of a function or class are test cases.