# Divergent Change

**Tags:** code smell

**Inverse:** </br>
[Split Phase](./Split%20Phase/Split%20Phase.md)</br>
[Move Function](./Move%20Function/Move%20Function.md) </br>
[Extract Function](./Extract%20Function/Extract%20Function.md)</br>
[Extract Class](./Extract%20Class/Extract%20Class.md)</br>

Divergent change occurs when one module is often changed in different ways for different reasons. 
If you look at a module and say, “Well, I will have to change these three functions every time I
get a new database; I have to change these four functions every time there is a new financial 
instrument,” this is an indication of divergent change. The database interaction and financial 
processing problems are separate contexts, and we can make our programming life better by moving
such contexts into separate modules. That way, when we have a change to one context, we only have 
to understand that one context and ignore the other.