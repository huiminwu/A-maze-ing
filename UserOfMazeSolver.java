/*
 * Tests MazeSolver.java
 */
public class UserOfMazeSolver {
    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());
        Displayer displayer = new Displayer( Integer.parseInt( commandLine[3]));

        MazeSolver solver = new MazeSolver( displayer);
        System.out.println(solver.solve(maze));

        
        

    }
}
