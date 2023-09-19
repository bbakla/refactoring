# Replace Derived Variable with Query

Tags: organizing data
[](img.png)

# Motivation

One of the biggest sources of problems in software is mutable data. Data changes can
often couple together parts of code in awkward ways, with changes in one part leading
to knock-on effects that are hard to spot. In many situations it’s not realistic to entirely
remove mutable data—but I do advocate minimizing the scope of mutable data at much
as possible.

One way I can make a big impact is by removing any variables that I could just as easily
calculate. A calculation often makes it clearer what the meaning of the data is, and it is
protected from being corrupted when you fail to update the variable as the source data
changes.