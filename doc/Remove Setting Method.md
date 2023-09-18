# Remove Setting Method

Tags: refactor, refactoring api

![Untitled](Remove%20Setting%20Method%206ac7519c45174cfdbfb24a86c3860e31/Untitled.png)

# Motivation

Providing a setting method indicates that a field may be changed. If I don’t want that field to change once the object is created, I don’t provide a setting method (and make the field immutable). That way, the field is set only in the constructor, my intention to have it not change is clear, and I usually remove the very possibility that the field will change.