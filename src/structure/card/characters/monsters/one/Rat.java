package structure.card.characters.monsters.one;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.physical.defensive.Block;
import structure.card.abilities.physical.offensive.Claw;
import structure.card.characters.Monster;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Rat.
 *
 * @author Hanne
 * @version 0.1
 */
public class Rat extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Block(1),
            new Claw( 1)));

    private static final boolean ISBOSS = false;

    private static final MagicType PRIMARYTYPE = MagicType.NONE;

    private static final String NAME = "Rat";

    private static final int HEALTHPOINTS = 14;


    /**
     * Instantiates a new Rat.
     */
    public Rat() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
