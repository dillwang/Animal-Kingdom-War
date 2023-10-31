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

public class Turtle extends Critter {
    private static final String SPECIES_NAME = "Tu";
    /**
     * Default constructor - creates critter with name Tu
     */
    public Turtle() {
        super(SPECIES_NAME);
    }

    @Override
    public Direction getMove() {
        return Direction.WEST;
    }

    /**
     * Returns the color of the turtle
     * 
     * @return Color pink
     */
    @Override 
    public Color getColor() {
        return Color.GREEN;
    }

    /**
     * This will allow the animal to eat.
     * 
     * @return boolean if animal eat.
     */
    @Override 
    public boolean eat() {
        Direction[] listDirections= {Direction.WEST, Direction.EAST, Direction.NORTH,
        Direction.SOUTH};
        for (int i = 0; i < listDirections.length; i ++) {
            if (!(info.getNeighbor(listDirections[i]).equals("Tu")||
            info.getNeighbor(listDirections[i]).equals("") ||
            info.getNeighbor(listDirections[i]).equals("."))) {
                return false;
            }
        }
        return true;
    }

    /**
     * This will return attack animal return type
     * 
     * @return Attack type (roar or forfeit)
     */
    @Override
    public Attack getAttack(String opponent) {
        int randomNum = random.nextInt(10);
        if (randomNum > 4){
            return Attack.ROAR;
        }
        else{
            return Attack.FORFEIT;
        }

    }

}
