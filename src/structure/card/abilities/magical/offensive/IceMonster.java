package structure.card.abilities.magical.offensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.MagicType;
import structure.card.abilities.MagicAbility;

/**
 * The type Ice monster.
 *
 * @author Hannes
 * @version 0.1
 */
public class IceMonster extends MagicAbility {

    private static final String DESCRIPTION = "10n + 2 magischer Schaden";

    private static final String NAME = "Ice";

    private static final int TWO = 2;

    private static final int TEN = 10;

    /**
     * Instantiates a new Ice monster.
     *
     * @param cost         the cost
     * @param abilityLevel the ability level
     */
    public IceMonster(int cost, int abilityLevel) {
        super(NAME, AbilityType.OFFENSIVE, DESCRIPTION, false, cost, MagicType.ICE, abilityLevel);
    }

    @Override
    public int calculate(int focusPoints, MagicType opposingType) {
        return TEN * this.getAbilityLevel() + TWO;
    }
}
