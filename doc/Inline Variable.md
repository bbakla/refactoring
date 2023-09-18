# Inline Variable

Tags: refactor
Inverse: Extract Variable (Extract%20Variable%20c38600031e1c47168f870f69f3fa2f05.md)

# Motivation

Variables provide names for expressions within a function, and as such they are usually a Good Thing. But sometimes, the name doesn’t really communicate more than the expression itself.

# Mechanics

- If the variable isn’t already declared immutable, do so and test. This checks that it’s only assigned to once.