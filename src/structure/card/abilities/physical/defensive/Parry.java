package structure.card.abilities.physical.defensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.PhysicalAbility;

/**
 * The type Parry.
 *
 * @author Hannes
 * @version 0.1
 */
public class Parry extends PhysicalAbility {

    private static final String DESCRIPTION = "Reduziere den physischen Schaden des nächsten Angriffs um 7";

    private static final String NAME = "Parry";

    private static final int ZERO = 0;

    private static final int SEVEN = 7;

    /**
     * Instantiates a new Parry.
     *
     * @param abilityLevel the ability level
     */
    public Parry(int abilityLevel) {
        super(NAME, AbilityType.DEFENSIVE, DESCRIPTION, false, abilityLevel);
    }

    @Override
    public int calculate(int damage) {
        if (damage >= SEVEN * getAbilityLevel()) {
            return damage - SEVEN * getAbilityLevel();
        }
        return ZERO;
    }

}
