import becker.robots.*;
import java.util.*; 
import java.awt.Color;
public class Main
{
    public static void main(String[] args)
    {
<<<<<<< Updated upstream
        //SETTING UP THE BOARD
=======
        Scanner in = new Scanner(System.in);
        
>>>>>>> Stashed changes
        //creating the walls of the board game
        City board = new City(7,7);
        board.setFrameTitle("Game");
        for (int i=1; i<=4; i++){
            Wall topWalls = new Wall (board,1,i,Direction.NORTH);
        }
        for (int i=1; i<=4; i++){
            Wall btmWalls = new Wall (board,4,i,Direction.SOUTH);
        }
        for (int i=1; i<=4; i++){
            Wall leftWalls = new Wall (board,i,1,Direction.WEST);
        }
        for (int i=1; i<=4; i++){
            Wall rightWalls = new Wall (board,i,4,Direction.EAST);
        }
        
        //COLOURS OF THE BOARD
        //Intersection road = new Intersection(board,7,7);
        //road.colorRoads(Color.BLUE);
        
        //PUTTING ROBOTS ON THE BOARD
        //p1
        Robot a = new Robot(board, 1, 1, Direction.EAST, 0);
        Robot b = new Robot(board, 3, 1, Direction.EAST, 0);
        Robot c = new Robot(board, 2, 4, Direction.WEST, 0);
        Robot d = new Robot(board, 4, 4, Direction.WEST, 0);
        //p2
        Robot A = new Robot(board, 2, 1, Direction.EAST, 0);
        Robot B = new Robot(board, 4, 1, Direction.EAST, 0);
        Robot C = new Robot(board, 1, 4, Direction.WEST, 0);
        Robot D = new Robot(board, 3, 4, Direction.WEST, 0);

        Robot[] names = {A,B,C,D};
        for (int i=0; i<=3; i++){
            names[i].setColor(Color.BLUE);
        }
<<<<<<< Updated upstream
=======

        int boardList[][] = {{1, 0, 0, 2},{2, 0, 0, 1},{1, 0, 0, 2},{2, 0, 0, 1}};
        
        //Get and validate the user's choice of where to move
        String p1direction;
        String p2direction;
        Robot p1robot;
        Robot p2robot;
        //player one
        // do {
                // System.out.println("Player 1, which piece would you like to move? (a, b, c, or d)");
                // p1robot = Robot.parseRobot(in.nextLine()); doesnt work LOL
        // } while (!p1robot.equals("a") && !p1robot.equals("b") && !p1robot.equals("c") && !p1robot.equals("d"));
        do {
                System.out.println("Player 1, would you like to move north(n), south(s), east(e) or west(w)?");
                p1direction = in.nextLine();
        } while (!p1direction.equals("n") && !p1direction.equals("s") && !p1direction.equals("e") && !p1direction.equals("w"));
        
        if (p1direction == "n") {
            
        }
        
        //player two
        do {
                System.out.println("Player 2, would you like to move north(n), south(s), east(e) or west(w)?");
                p1direction = in.nextLine();

        } while (!p1direction.equals("n") && !p1direction.equals("s") && !p1direction.equals("e") && !p1direction.equals("w"));
>>>>>>> Stashed changes
    }
}
