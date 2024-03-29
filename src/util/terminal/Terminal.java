package util.terminal;

import structure.card.abilities.Ability;
import structure.card.abilities.AbilityType;
import structure.card.abilities.magical.defensive.Reflect;
import structure.card.characters.Character;
import structure.card.characters.Monster;
import structure.card.characters.Runa;
import util.parser.EndGameException;
import util.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Terminal.
 *
 * @author Hannes Schniz
 * @version 0.1
 */
public final class Terminal {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static final int ZERO = 0;

    private static final int ONE = 1;

    private Terminal() {

    }

    /**
     * Select target int.
     *
     * @param name        the name
     * @param max         the max
     * @param hasToSelect the has to select
     * @return the int
     * @throws EndGameException the end game exception
     */
    public static int selectTarget(String name, int max, boolean hasToSelect) throws EndGameException {
        printSelect(name, max); //prints the select message
        int parsed;
        try {
            parsed = Parser.getSelected(READER.readLine(), max); //parses the input
        } catch (IOException ex) {
            return selectTarget("number", max, hasToSelect);
        }
        if (parsed != -ONE) { //if the input was correct returns the input -1
            return parsed - ONE;
        }
        else if (!hasToSelect) { //if the input wasn't correct but the player doesn't need to select returns -1
            return -1;
        }
        return selectTarget("number", max, hasToSelect); //recurrs to make sure the player makes an input
    }

    /**
     * Select multi target list.
     *
     * @param max    the max
     * @param amount the amount
     * @param exact  the exact
     * @param name   the name
     * @return the list
     * @throws EndGameException the end game exception
     */
    public static List<Integer> selectMultiTarget(int max, int amount, boolean exact, String name)
            throws EndGameException {
        System.out.println("Enter " + name + " [1--" + max + "] separated by comma:");
        List<Integer> parsed = new ArrayList<>();
        try {
            parsed = Parser.parseMulti(READER.readLine(), max); //parses the input
        } catch (IOException ex) {
            selectMultiTarget(max, amount, exact, name);
        }
        if (parsed != null && parsed.size() == amount) { //if the player made a correct input returns the parsed input
            return parsed;
        }
        else if (parsed != null && parsed.size() < amount && !exact) { //if the input doesn't need to be exact returns
            return parsed;
        }
        else {
            return selectMultiTarget(max, amount, exact, name); //recurrs to make sure that the player makes an input
        }
    }

    /**
     * Print hello.
     */
    public static void printHello() {
        System.out.println("Welcome to Runa's Strive");
        System.out.println("Select Runa's character class");
        System.out.println("1) Warrior");
        System.out.println("2) Mage");
        System.out.println("3) Paladin");
    }

    /**
     * Print ability string.
     *
     * @param input the input
     * @return the string
     */
    public static String printAbility(Ability input) {
        return  input.getName() + "(" + input.getAbilityLevel() + ")";
    }

    /**
     * Print line.
     */
    public static void printLine() {
        System.out.println("----------------------------------------");
    }

    /**
     * Print runa string.
     *
     * @param runa the runa
     * @param full the full
     * @return the string
     */
    public static String printRuna(Runa runa, boolean full) {
        if (full) {
            return ("Runa (" + runa.getHealthPoints() + "/" + Runa.getMaxhealth() + " HP, " + runa.getFocusPoints()
                    + "/" + runa.getDice().getValue() + " FP)");
        }
        return ("Runa (" + runa.getHealthPoints() + "/50 HP)");
    }

    /**
     * Print stage.
     *
     * @param currentRoom  the current room
     * @param currentFloor the current floor
     */
    public static void printStage(int currentRoom, int currentFloor) {
        System.out.println("Runa enters Stage " + currentRoom + " of Level " + currentFloor);
    }

    /**
     * Print monster.
     *
     * @param monster the monster
     */
    public static void printMonster(Monster monster) {
        System.out.println(monster.getName() + " (" + monster.getHealthPoints() + " HP, " + monster.getFocusPoints()
                + " FP): attempts " + printAbility(monster.getNextMove()) + " next");
    }

    /**
     * Print level.
     *
     * @param runa        the runa
     * @param monsterList the monster list
     */
    public static void printLevel(Runa runa, List<Monster> monsterList) {
        printLine();
        System.out.println(printRuna(runa, true));
        System.out.println("vs.");
        for (Monster monster: monsterList) {
            printMonster(monster);
        }
        printLine();
    }

    /**
     * Print use.
     *
     * @param user    the user
     * @param ability the ability
     */
    public static void printUse(Character user, Ability ability) {
        System.out.println(user.getName() + " uses " + printAbility(ability));
    }

    /**
     * Print focus.
     *
     * @param name        the name
     * @param focusChange the focus change
     */
    public static void printFocus(String name, int focusChange) {
        if (focusChange > ZERO) {
            System.out.println(name + " gains " + focusChange + " focus");
        }
    }

    private static void printSelect(String type, int max) {
        System.out.println("Enter " + type + " [1--" + max + "]:");
    }

    /**
     * Print damage.
     *
     * @param target  the target
     * @param damage  the damage
     * @param ability the ability
     */
    public static void printDamage(Character target, int damage, Ability ability) {
        if (damage == ZERO) {
            return;
        }
        if (ability.getType().equals(AbilityType.OFFENSIVE) || ability.getClass().equals(Reflect.class)) {
            System.out.println(target.getName() + " takes " + damage + " "
                    + ability.getUsageType().getValue() + ". damage");

        }
    }

    /**
     * Print death.
     *
     * @param input the input
     */
    public static void printDeath(Character input) {
        if (input != null) {
            System.out.println(input.getName() + " dies");
        }
    }

    /**
     * Print targets.
     *
     * @param monsterList the monster list
     */
    public static void printTargets(List<Monster> monsterList) {
        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println((i + ONE) + ") " + monsterList.get(i).getName());
        }
    }

    /**
     * Print abilities.
     *
     * @param input the input
     */
    public static void printAbilities(Runa input) {
        List<Ability> runasAbilities = input.getAbilities();
        for (int i = 0; i < runasAbilities.size(); i++) {
            System.out.println((i + ONE) + ") " + printAbility(runasAbilities.get(i)));

        }
    }

    /**
     * Print.
     *
     * @param toPrint the to print
     */
    public static void print(String toPrint) {
        if (toPrint == null || toPrint.equals("")) {
            return;
        }
        System.out.println(toPrint);
    }

}
