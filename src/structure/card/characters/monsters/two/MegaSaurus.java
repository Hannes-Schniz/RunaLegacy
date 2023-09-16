package structure.card.characters.monsters.two;

import structure.card.abilities.Ability;
import structure.card.abilities.MagicType;
import structure.card.abilities.magical.Focus;
import structure.card.abilities.magical.offensive.FireMonster;
import structure.card.abilities.magical.offensive.LightningMonster;
import structure.card.abilities.physical.defensive.Block;
import structure.card.abilities.physical.offensive.Bite;
import structure.card.characters.Monster;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Spider king.
 *
 * @author Hanne
 * @version 0.1
 */
public class MegaSaurus extends Monster {

    private static final Queue<Ability> ABILITYSTACK = new LinkedList<>(List.of(new Bite(1),
            new Block(2), new Focus(2),
            new FireMonster(1, 1), new LightningMonster(1, 1)));

    private static final boolean ISBOSS = true;

    private static final MagicType PRIMARYTYPE = MagicType.LIGHTNING;

    private static final String NAME = "Mega Saurus";

    private static final int HEALTHPOINTS = 100;


    /**
     * Instantiates a new Spider king.
     */
    public MegaSaurus() {
        super(NAME, HEALTHPOINTS, 0, ABILITYSTACK, PRIMARYTYPE, ISBOSS);
    }
}
