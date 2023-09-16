package structure.card.characters.monsters.two;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.magical.Focus;
import structure.card.abilities.magical.offensive.IceMonster;
import structure.card.abilities.physical.offensive.Bite;
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
public class DarkElf extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Bite(2),
            new Focus(2), new IceMonster(2, 2)));

    private static final boolean ISBOSS = false;

    private static final MagicType PRIMARYTYPE = MagicType.NONE;

    private static final String NAME = "Dark Elf";

    private static final int HEALTHPOINTS = 34;


    /**
     * Instantiates a new Frog.
     */
    public DarkElf() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
