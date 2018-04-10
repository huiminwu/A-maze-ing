### A-maze-ing
## Personel
Milan Haiman, Hui Min Wu
## Statement of Problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”

Navigate a maze from start to finish

legal means
- don’t cross the walls
- right-angle turns only

## Recursive Abstraction
Given a maze, the recursive abstraction can solve a maze with one fewer stepping stone (perhaps multiple times).

## Base Case
The explorer is on the treasure or the explorer is in the lava.

## Algorithm
```
if the explorer is in the lava, return false.

if the explorer is on the treasure, return true.

otherwise, the explorer is on a stepping stone.

for each direction (up, down, left, right) from the explorer:
  
   remove the stepping stone that the explorer is on and move one step in that direction
  
   invoke the recursive abstraction: if the maze can be solved, return true
  
   move the explorer in the opposite direction and put back the stepping stone

return false
```

## Classes
## Version *n* Wish List
