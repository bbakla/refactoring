# Divergent Change

Tags: code smell
Inverse: Split Phase (Split%20Phase%2096437a3582a344058e0c2255109ab6b4.md) 
Move Function (Move%20Function%20b296fdf48e6a42039e56c135f4825f68.md) 
Extract Function (Extract%20Function%20f20e8d100df7460e85563310e63c8312.md) 
Extract Class (Extract%20Class%20fea5405508154970a17c9559af87a4a0.md)

Divergent change occurs when one module is often changed in different ways for different reasons. If you look at a module and say, “Well, I will have to change these three functions every time I get a new database; I have to change these four functions every time there is a new financial instrument,” this is an indication of divergent change. The database interaction and financial processing problems are separate contexts, and we can make our programming life better by moving such contexts into separate modules. That way, when we have a change to one context, we only have to understand that one context and ignore the other.