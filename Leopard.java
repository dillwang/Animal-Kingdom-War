/*
 * Name: Diyou Wang
 * PID: A17118730
 * Email: diw011@ucsd.edu
 * References: lecture notes
 * 
 * Contains Feline class that extend Critter class with couple overrides.
 */

// This is the import
import java.awt.Color;

public class Leopard extends Feline {
    protected static int confidence = 0;
    private static final String SPECIES_NAME = "Lpd";
    
    /**
     * Default constructor - creates Feline with name Lion
     */
    public Leopard() {
        displayName = SPECIES_NAME;
    }

    
    /**
     * This will determine how the animal will move
     * 
     * @return Direction (East, North, South, West)
     */
    @Override
    public Direction getMove() {
        if (info.getNeighbor(Direction.NORTH).equals(".")
        || info.getNeighbor(Direction.NORTH).equals("Patrick")){
            return Direction.NORTH;
        }
        else if (info.getNeighbor(Direction.SOUTH).equals(".")
        || info.getNeighbor(Direction.SOUTH).equals("Patrick")){
            return Direction.SOUTH;
        }
        else if (info.getNeighbor(Direction.EAST).equals(".")
        || info.getNeighbor(Direction.EAST).equals("Patrick")){
            return Direction.EAST;
        }
        else if (info.getNeighbor(Direction.WEST).equals(".")
        || info.getNeighbor(Direction.WEST).equals("Patrick")){
            return Direction.WEST;
        }
        else{
            int randomNum = random.nextInt(100);
            if (randomNum < 25) {
                return Direction.NORTH;
            }
            else if (randomNum>25 && randomNum < 50) {
                return Direction.SOUTH;
            }
            else if (randomNum>50 && randomNum < 75) {
                return Direction.EAST;
            }
            else{
                return Direction.WEST;
            }
        }

    }

    
    /**
     * This will determine when animal wins
     * 
     */
    @Override
    public void win() {
        if (confidence < 10) {
            confidence += 1;
        }
    }

    
    /**
     * This will determine if animal loses
     * 
     */
    @Override
    public void lose() {
        if (confidence > 0) {
            confidence -= 1;
        }
    }

    /**
     * This will get the attack of the animal
     * 
     * @return Attack type (pounce)
     */
    @Override
    public Attack getAttack(String opponent) {
        if (opponent.equals("Tu") || confidence > 5) {
            return Attack.POUNCE;
        }
        else{
            return generateAttack(opponent);
        }
    
    }

    /**
     * This will generate attacks for the animal
     * 
     * @return Attack (forfeit, pounce, roar, scratch)
     */
    protected Attack generateAttack(String opponent) {
        int randomNum = random.nextInt(9);
        if (opponent.equals("Patrick")) {
            return Attack.FORFEIT;
        }
        else if (randomNum < 3) {
            return Attack.POUNCE;
        }
        else if (randomNum > 3 && randomNum < 6) {
            return Attack.ROAR;
        }
        else{
            return Attack.SCRATCH;
        }
    }

    /**
     * This will determine if animal eats
     * 
     * @return boolean if animal eats
     */
    @Override
    public boolean eat() {
        int randomNum = random.nextInt(100);
            if (randomNum < confidence * 10) {
                return true;
            }
            else{
                return false;
            }
    }

    
    /**
     * This will return the color of the animal
     * 
     * @return Color (red)
     */
    @Override 
    public Color getColor() {
        return Color.RED;
    }

    
    /**
     * What happens when sitimulation reset
     * 
     */
    @Override
    public void reset() {
        confidence = 0;
    }
}
