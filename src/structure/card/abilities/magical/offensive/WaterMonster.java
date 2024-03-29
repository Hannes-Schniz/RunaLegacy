package structure.card.abilities.magical.offensive;

import structure.card.abilities.AbilityType;
import structure.card.abilities.MagicType;
import structure.card.abilities.MagicAbility;

/**
 * The type Water monster.
 *
 * @author Hannes
 * @version 0.1
 */
public class WaterMonster extends MagicAbility {

    private static final String DESCRIPTION = "8n + 2 magischer Schaden";

    private static final String NAME = "Water";

    private static final int TWO = 2;

    private static final int EIGHT = 8;

    /**
     * Instantiates a new Water monster.
     *
     * @param cost         the cost
     * @param abilityLevel the ability level
     */
    public WaterMonster(int cost, int abilityLevel) {
        super(NAME, AbilityType.OFFENSIVE, DESCRIPTION, false, cost, MagicType.WATER, abilityLevel);
    }

    @Override
    public int calculate(int focusPoints, MagicType opposingType) {
        return EIGHT * this.getAbilityLevel() + TWO;
    }
}
