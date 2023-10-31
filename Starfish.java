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

/**
 * This class is starfish class that extends the critter class. star fish
 * participates in the stimulation.
 */
public class Starfish extends Critter {
    private static final String SPECIES_NAME = "Patrick";

    /**
     * Default constructor - creates critter with name Patrick
     */
    public Starfish() {
        super(SPECIES_NAME);
    }
    /**
     * Return the direction of the movement
     * 
     * @return Direction center
     */
    @Override
    public Direction getMove() {
        return Direction.CENTER;
    }

    /**
     * Returns the color of the Starfish
     * 
     * @return Color pink
     */
    @Override 
    public Color getColor() {
        return Color.PINK;
    }
}