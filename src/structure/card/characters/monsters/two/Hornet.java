package structure.card.characters.monsters.two;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.magical.Focus;
import structure.card.abilities.magical.offensive.FireMonster;
import structure.card.abilities.physical.offensive.Scratch;
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
public class Hornet extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Scratch(2),
            new Focus(2), new FireMonster(1, 1), new FireMonster(2, 2)));

    private static final boolean ISBOSS = false;

    private static final MagicType PRIMARYTYPE = MagicType.FIRE;

    private static final String NAME = "Hornet";

    private static final int HEALTHPOINTS = 32;


    /**
     * Instantiates a new Frog.
     */
    public Hornet() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
