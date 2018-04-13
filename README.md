### A-maze-ing
## Personel
Milan Haiman, Hui Min Wu
## Statement of Problem
Returns the boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”

Navigate a maze from start to finish

legal means
- don’t go on lava
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

take a snapshot

for each direction (up, down, left, right) from the explorer:
  
   pour lava and move one step in that direction
  
   invoke the recursive abstraction: if the maze can be solved, return true
  
   return to snapshot

return false
```

## Classes
Maze Vector

UserOfMaze

Displayer

MazeSolver

UserOfMazeSolver


## Version *n* Wish List

Change all Walls to Lava

Show the path of the explorer

## Known Unsolved Bugs

None
