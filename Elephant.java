/*
 * Name: Diyou Wang
 * PID: A17118730
 * Email: diw011@ucsd.edu
 * References: lecture notes
 * 
 * Contains Feline class that extend Critter class with couple overrides.
 */

//This is the import 
import java.awt.Color;
import java.util.Random;
public class Elephant extends Critter {
    protected static int goalX;
    protected static int goalY;
    private static final String SPECIES_NAME = "El";
    
    public Elephant() {
        super(SPECIES_NAME);
    }

    @Override
    public Direction getMove() {
        if ((goalX == 0 && goalY == 0) || (goalX == info.getX()
        && goalY == info.getY())){
            goalX = random.nextInt(info.getWidth());
            goalY = random.nextInt(info.getHeight());
        }
            if(Math.abs(goalX-info.getX()) > Math.abs(goalY-info.getY())) {
                if (goalX-info.getX() < 0) {
                    return Direction.WEST;
                }
                else {
                    return Direction.EAST;
                }
            }
            else{
                if (goalY-info.getHeight() < 0) {
                    return Direction.SOUTH;
                }
                else{
                    return Direction.NORTH;
                }
            }
        }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public void mate() {
        incrementLevel(2);
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public void reset() {
        goalX = 0;
        goalY = 0;
    }
}
