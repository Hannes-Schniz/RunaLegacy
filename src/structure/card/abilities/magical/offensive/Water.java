package structure.card.abilities.magical.offensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.MagicType;
import structure.card.abilities.MagicAbility;

/**
 * The type Water.
 *
 * @author Hannes
 * @version 0.1
 */
public class Water extends MagicAbility {

    private static final String DESCRIPTION = "(2n + 4) ∗ f magischer Schaden "
            + "+ 2n magischer Schaden, falls Ziel ein Blitz-Monster";

    private static final String NAME = "Water";

    private static final int COST = 1;

    private static final int TWO = 2;

    private static final int FOUR = 4;

    /**
     * Instantiates a new Water.
     *
     * @param abilityLevel the ability level
     */
    public Water(int abilityLevel) {
        super(NAME, AbilityType.OFFENSIVE, DESCRIPTION, false, COST, MagicType.WATER, abilityLevel);
    }

    @Override
    public int calculate(int focusPoints, MagicType opposingType) {
        if (opposingType.equals(MagicType.LIGHTNING)) {
            return (TWO * this.getAbilityLevel() + FOUR) * focusPoints + TWO * this.getAbilityLevel();
        }
        return (TWO * this.getAbilityLevel() + FOUR) * focusPoints;
    }
}
