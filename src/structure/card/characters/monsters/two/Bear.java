package structure.card.characters.monsters.two;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.magical.defensive.Deflect;
import structure.card.abilities.physical.defensive.Block;
import structure.card.abilities.physical.offensive.Claw;
import structure.card.characters.Monster;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Frog.
 *
 * @author Hanne
 * @version 0.1
 */
public class Bear extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Claw(2),
            new Deflect(2), new Block(2)));

    private static final boolean ISBOSS = false;

    private static final MagicType PRIMARYTYPE = MagicType.NONE;

    private static final String NAME = "Bear";

    private static final int HEALTHPOINTS = 40;


    /**
     * Instantiates a new Frog.
     */
    public Bear() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
