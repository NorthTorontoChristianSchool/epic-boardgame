import becker.robots.*;
import java.awt.Color;
public class BetterRobot extends Robot
{
    //Constructor
    public BetterRobot(City c, int s, int a, Direction d, int n)
    {
        super(c, s, a, d, n);
    }   

    //public methods
    //robots moves - robot originally facing north
    public void faceNorth(){
        Direction dFacing = getDirection();
        if (dFacing.equals(Direction.EAST)){
            super.turnLeft();
        }
        if (dFacing.equals(Direction.SOUTH)){
            for (int i = 0; i < 2; i++) { //face north again
                super.turnLeft();
            }
        }
        if (dFacing.equals(Direction.EAST)){
            for (int i = 0; i < 3; i++) { //face north again
                super.turnLeft();
            }
        }
    }

    public boolean moveNorth()
    {
        if (super.frontIsClear()){
            super.move(); //move
            return true;
        }
        else{
            return false;
        }
    }

    public boolean moveEast()
    {
        for (int i = 0; i < 3; i++) {
            super.turnLeft(); //face East by turning right
        }
        if (super.frontIsClear()){
            super.move(); //move
            //super.turnLeft(); //face north again
            faceNorth();
            return true;
        }
        else{
            //System.out.println("There is already a piece in that spot. Please move to an empty spot.");
            faceNorth();
            return false;
        }

    } 

    public boolean moveSouth()
    {
        for (int i = 0; i < 2; i++) { //face south
            super.turnLeft();
        }
        if (super.frontIsClear()){
            super.move(); //move
            faceNorth();
            return true;
        }
        else{
            faceNorth();
            return false;
        }

    }   

    public boolean moveWest()
    {
        super.turnLeft(); //face west
        if (super.frontIsClear()){
            super.move(); //move
            faceNorth();
            return true;
        }
        else{
            faceNorth();
            return false;
        }
    }

    public void victoryDance()
    {
        super.setSpeed(5);
        Color[] colourList = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK,};
        for (int i = 0; i < 12; i++) { 
            super.turnLeft();
            super.setColor(colourList[i]);
        }
    }
}    
 