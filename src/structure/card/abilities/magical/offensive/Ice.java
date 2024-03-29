package structure.card.abilities.magical.offensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.MagicType;
import structure.card.abilities.MagicAbility;

/**
 * The type Ice.
 *
 * @author Hannes
 * @version 0.1
 */
public class Ice extends MagicAbility {

    private static final String DESCRIPTION = "(2n + 4) ∗ f + 2 magischer Schaden "
            + "+ 2n magischer Schaden, falls Ziel ein Wasser-Monster";

    private static final String NAME = "Ice";

    private static final int COST = 1;

    private static final int TWO = 2;

    private static final int FOUR = 4;

    /**
     * Instantiates a new Ice.
     *
     * @param abilityLevel the ability level
     */
    public Ice(int abilityLevel) {
        super(NAME, AbilityType.OFFENSIVE, DESCRIPTION, false, COST, MagicType.ICE, abilityLevel);
    }

    @Override
    public int calculate(int focusPoints, MagicType opposingType) {
        if (opposingType.equals(MagicType.LIGHTNING)) {
            return (TWO * this.getAbilityLevel() + FOUR) * focusPoints + TWO + TWO * this.getAbilityLevel();
        }
        return (TWO * this.getAbilityLevel() + FOUR) * focusPoints + TWO;
    }
}
