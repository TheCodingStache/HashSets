# HashSets
A simple representation of how equals and hashcode methods work. 
In this project I also use Set interface which extends Collection. With the use of HashSet class which implements Set interface, 
I am showing that duplicate objects cannot be stored into the Collection.

The hashCode contract
(Use JavaDoc for in-depth explanation)
Objects that are equal must have the same hash code within a running process.
Whenever you implement equals, you MUST also implement hashCode!
Common faults:
Unequal objects must have different hash codes – WRONG
Objects with the same hash code must be equal – WRONG
