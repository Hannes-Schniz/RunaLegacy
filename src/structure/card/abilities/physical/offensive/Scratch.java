package structure.card.abilities.physical.offensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.PhysicalAbility;

/**
 * The type Scratch.
 *
 * @author Hannes
 * @version 0.1
 */
public class Scratch extends PhysicalAbility {

    private static final String DESCRIPTION = "5n physischer Schaden, Bricht Runas Focus";

    private static final String NAME = "Scratch";

    private static final int FIVE = 5;

    /**
     * Instantiates a new Scratch.
     *
     * @param abilityLevel the ability level
     */
    public Scratch(int abilityLevel) {
        super(NAME, AbilityType.OFFENSIVE, DESCRIPTION, true, abilityLevel);
    }

    @Override
    public int calculate(int dice) {
        return FIVE * this.getAbilityLevel();
    }

}
