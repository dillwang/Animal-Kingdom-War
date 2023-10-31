/*
 * Name: Diyou Wang
 * PID: A17118730
 * Email: diw011@ucsd.edu
 * References: lecture notes
 * 
 * Contains Feline class that extend Critter class with couple overrides.
 */


public class Feline extends Critter {
    protected int moveCount; //counter for getMove method before random direction
    protected int eatCount; //counter for eating
    protected Direction currDir; //current direction
    private static final String SPECIES_NAME = "Fe";

    public Feline() {
        super(SPECIES_NAME);
    }

    /**
     * This will return the animal's movement
     * 
     * @return Direction (North, West, East, South)
     */
    @Override
    public Direction getMove() {
        if (moveCount == 0) {
            int randomNum = random.nextInt(100);
            if (randomNum < 25) {
                currDir = Direction.NORTH;
                moveCount += 1;
                return Direction.NORTH;
            }
            else if (randomNum>25 && randomNum < 50) {
                currDir = Direction.SOUTH;
                moveCount += 1;
                return Direction.SOUTH;
            }
            else if (randomNum>50 && randomNum < 75) {
                currDir = Direction.EAST;
                moveCount += 1;
                return Direction.EAST;
            }
            else{
                currDir = Direction.WEST;
                moveCount += 1;
                return Direction.WEST;
            }
        }
        else if (moveCount > 0 && moveCount < 5) {
            moveCount += 1;
            return currDir;
        }
        else {
            moveCount = 0;
            currDir = null;
            int randomNum = random.nextInt(100);
            if (randomNum < 25) {
                currDir = Direction.NORTH;
                moveCount += 1;
                return Direction.NORTH;
            }
            else if (randomNum>25 && randomNum < 50) {
                currDir = Direction.SOUTH;
                moveCount += 1;
                return Direction.SOUTH;
            }
            else if (randomNum>50 && randomNum < 75) {
                currDir = Direction.EAST;
                moveCount += 1;
                return Direction.EAST;
            }
            else{
                currDir = Direction.WEST;
                moveCount += 1;
                return Direction.WEST;
            }
        }
    }    

    /**
     * This will return if animal eats or not
     * 
     * @return boolean
     */
    @Override
    public boolean eat() {
        if(eatCount > 1){
            eatCount = 0;
            return true;
        }
        else{
            eatCount += 1;
            return false;
        }
    }

    /**
     * This will return attack animal return type
     * 
     * @return Attack type POUNCE
     */
    @Override
    public Attack getAttack(String opponent){
       return Attack.POUNCE;
    }
}