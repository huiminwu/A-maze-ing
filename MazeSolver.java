/*
 * This class should solve the maze
 */
public class MazeSolver {
    private Displayer displayer;
    public MazeSolver( Displayer displayer) {
        this.displayer = displayer;
    }
    public boolean solve(Maze maze) {
        if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        } else if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
        }
        Maze snapshot = new Maze(maze);
        for(Direction direction : Direction.values()) {
            maze.dropA(maze.WALL);
            maze.go(direction);
            if(solve(maze)) {
                return true;
            }
            maze = snapshot;
        }
        return false;
    }
}
