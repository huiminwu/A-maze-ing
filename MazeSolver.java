/*
 * This class should solve the maze
 */
public class MazeSolver {
    private Displayer displayer;
    public MazeSolver( Displayer displayer) {
        this.displayer = displayer;
    }
    public boolean solve(Maze maze) {
        if (maze.explorerIsOnA() == maze.LAVA) {
            return false;
        } else if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
        }
        Maze snapshot = new Maze(maze);
        // displayer.atTopOfWindow(snapshot.toString() + "snapshot initial"); // debugging
        for(Direction direction : Direction.values()) {
            maze.dropA(maze.LAVA);
            // displayer.atTopOfWindow(maze.toString() + "drop LAVA"); // debugging
            // displayer.atTopOfWindow(snapshot.toString() + "snapshot after drop LAVA"); // debugging
            maze.go(direction);
            // displayer.atTopOfWindow(maze.toString() + "went " + direction); // the real one

            // displayer.atTopOfWindow(snapshot.toString() + "snapshot after went " + direction); // debugging
            if(solve(maze)) {
                return true;
            }
            maze = new Maze(snapshot);
            // displayer.atTopOfWindow(maze.toString() + "restored snapshot"); // debugging
            // displayer.atTopOfWindow(snapshot.toString() + "snapshot after restored snapshot"); // debugging
        }
        return false;
    }
}
