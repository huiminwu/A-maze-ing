### A-maze-ing
## Personel
Milan Haiman, Hui Min Wu
## Statement of Problem
Returns the Boolean value of the statement “the maze is navigable, having a legal travel path that is continuous from start point to existing treasure”

Navigate a maze form start to finish

legal means
- don’t cross the walls
- right-angle turns only
- a path cannot go through the same point twice
## Recursive Abstraction
Given a maze, the recursive abstraction can solve a maze with one less stepping stone (perhaps multiple times) and the "E" moved over.
## Base Case
The treasure and explorer are next to each other or the explorer has nowhere to go.
## Algorithm
```
if "E" is in a wall, return false.

if "E" and "0" are adjacent, return true.

check the four directions for stepping stones next to "E".

for each stepping stone next to "E":
  
   replace the stepping stone with the "E"
  
   if the maze can be solved, return true
  
   recover the stepping stone and put the "E" back

return false
```

## Classes
## Version *n* Wish List
