
//This is the import
import java.awt.Color;

/**
 * This class is Ocelot class that extends the Leopard class. Ocelot class
 * participates in the stimulation.
 */
public class Ocelot extends Leopard {
    private static final String SPECIES_NAME = "Oce";

    /**
     * Default constructor - creates critter with name Tu
     */
    public Ocelot() {
        displayName = SPECIES_NAME;
    }

    
    /**
     * This will gererate random attack for animal.
     * 
     * @return Attack type (pounce or scratch)
     */
    @Override
    protected Attack generateAttack(String opponent) {
        if (opponent.equals("Lion") || 
        opponent.equals("Fe") ||
        opponent.equals("Lpd")) {
            return Attack.SCRATCH;
        }
        else{
            return Attack.POUNCE;
        }
    }

    /**
     * Returns the color of the turtle
     * 
     * @return Color pink
     */
    @Override 
    public Color getColor() {
        return Color.LIGHT_GRAY;
    }
}
