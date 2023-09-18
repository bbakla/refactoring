# Change Value to Reference

Tags: organizing data, refactor
Inverse: Change Reference to Value (Change%20Reference%20to%20Value%200547c0e787534920a414d53360094d55.md)

[Picture](img.png)

# Motivation

A data structure may have several records linked to the same logical data structure. I
might read in a list of orders, some of which are for the same customer. When I have sharing like this, I can represent it by treating the customer either as a value or as a reference. With a value, the customer data is copied into each order; with a reference, there is only one data structure that multiple orders link to.

If the customer never needs to be updated, then both approaches are reasonable. It is, perhaps, a bit confusing to have multiple copies of the same data, but it’s common enough to not be a problem. In some cases, there may be issues with memory due to multiple copies—but, like any performance issue, that’s relatively rare.

Changing a value to a reference results in only one object being present for an entity, and it usually means I need some kind of repository where I can access these objects. I then only create the object for an entity once, and everywhere else I retrieve it from the repository.