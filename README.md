### A-maze-ing
## Personel
Milan Haiman, Hui Min Wu
## Statement of Problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”

Navigate a maze form start to finish

legal means
- don’t cross the walls
- right-angle turns only

## Recursive Abstraction
Given a maze, the recursive abstraction can solve a maze with one fewer stepping stone (perhaps multiple times).

## Base Case
The explorer is on the treasure or the explorer is in the lava.

## Algorithm
```
if "E" is in the lava, return false.

if "E" is on the treasure, return true.

otherwise, "E" is on a stepping stone.

for each direction (up, down, left, right) from "E":
  
   remove the stepping stone that "E" is on and move the "E" one step in that direction
  
   invoke the recursive abstraction: if the maze can be solved, return true
  
   recover the stepping stone and put the "E" back

return false
```

## Classes
## Version *n* Wish List
