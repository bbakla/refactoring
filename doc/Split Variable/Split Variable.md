# Split Variable

Tags: organizing data, refactor

[](img.png)

# Motivation

Many other variables are used to hold the result of a longwinded bit of code for easy
reference later. These kinds of variables should be set only once. If they are set more than once, it is a sign that they have more than one responsibility within the method. Any variable with more than one responsibility should be replaced with multiple variables, one for each responsibility. Using a variable for two different things is very confusing for the reader.