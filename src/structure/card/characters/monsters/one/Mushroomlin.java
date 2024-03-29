package structure.card.characters.monsters.one;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.magical.defensive.Deflect;
import structure.card.abilities.physical.offensive.Scratch;
import structure.card.characters.Monster;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Mushroomlin.
 *
 * @author Hanne
 * @version 0.1
 */
public class Mushroomlin extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Deflect(1),
            new Scratch(1)));

    private static final boolean ISBOSS = false;

    private static final MagicType PRIMARYTYPE = MagicType.NONE;

    private static final String NAME = "Mushroomlin";

    private static final int HEALTHPOINTS = 20;


    /**
     * Instantiates a new Mushroomlin.
     */
    public Mushroomlin() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
