package util.generator;

import structure.card.abilities.Ability;
import structure.card.abilities.magical.Focus;
import structure.card.abilities.magical.defensive.Reflect;
import structure.card.abilities.magical.offensive.Fire;
import structure.card.abilities.magical.offensive.Ice;
import structure.card.abilities.magical.offensive.Lightning;
import structure.card.abilities.magical.offensive.Water;
import structure.card.abilities.physical.defensive.Parry;
import structure.card.abilities.physical.offensive.Pierce;
import structure.card.abilities.physical.offensive.Slash;
import structure.card.abilities.physical.offensive.Swing;
import structure.card.abilities.physical.offensive.Thrust;
import structure.card.characters.Monster;
import structure.card.characters.monsters.one.Frog;
import structure.card.characters.monsters.one.Ghost;
import structure.card.characters.monsters.one.Gorgon;
import structure.card.characters.monsters.one.Skeleton;
import structure.card.characters.monsters.one.Spider;
import structure.card.characters.monsters.one.Goblin;
import structure.card.characters.monsters.one.Rat;
import structure.card.characters.monsters.one.Mushroomlin;
import structure.card.characters.monsters.two.Snake;
import structure.card.characters.monsters.two.DarkElf;
import structure.card.characters.monsters.two.ShadowBlade;
import structure.card.characters.monsters.two.Hornet;
import structure.card.characters.monsters.two.Tarantula;
import structure.card.characters.monsters.two.Bear;
import structure.card.characters.monsters.two.Mushroomlon;
import structure.card.characters.monsters.two.WildBoar;

import java.util.ArrayList;
import java.util.List;

/**
 * The type List generator.
 *
 * @author Hanne
 * @version 0.1
 */
public final class ListGenerator {

    private ListGenerator() {

    }

    /**
     * Generate floor list.
     *
     * @param level the level
     * @return the list
     */
    public static List<Monster> generateFloor(int level) {
        ArrayList<Monster> monsterList = new ArrayList<>();
        if (level == 1) {
            monsterList = new ArrayList<>(List.of(new Frog(), new Ghost(), new Gorgon(), new Skeleton(),
                    new Spider(), new Goblin(), new Rat(), new Mushroomlin()));
        }
        if (level == 2) {
            monsterList = new ArrayList<>(List.of(new Snake(), new DarkElf(), new ShadowBlade(), new Hornet(),
                    new Tarantula(), new Bear(), new Mushroomlon(), new WildBoar()));
        }
        return monsterList;
    }

    /**
     * Generate abilities list.
     *
     * @param currentFloor the current floor
     * @return the list
     */
    public static List<Ability> generateAbilities(int currentFloor) {
        return new ArrayList<>(List.of(new Slash(currentFloor), new Swing(currentFloor),
                new Thrust(currentFloor), new Pierce(currentFloor), new Parry(currentFloor), new Focus(currentFloor),
                new Reflect(currentFloor), new Water(currentFloor), new Ice(currentFloor), new Fire(currentFloor),
                new Lightning(currentFloor)));
    }
}
