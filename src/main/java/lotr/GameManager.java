package lotr;

import lotr.characters.Character;

public class GameManager {
    public void fight(Character character1, Character character2) {
        String ch1Name = getCharacterName(character1);
        String ch2Name = getCharacterName(character2);

        System.out.println("A fight between " + ch1Name + " and " + ch2Name + " is about to begin!");
        while (character1.isAlive() && character2.isAlive()) {
            character1.kick(character2);
            System.out.println(ch1Name + " kicked " + ch2Name + "!");

            System.out.println(character1.toString() + " ----- " + character2.toString());

            character2.kick(character1);
            System.out.println(ch1Name + " kicked " + ch2Name + "!");

            System.out.println(character1.toString() + " ----- " + character2.toString());
        }

        System.out.println("The winner is " + (character1.isAlive() ? ch1Name : ch2Name) + "!");
        System.out.println("The fight is over!");
    }

    private static String getCharacterName(Character character) {
        return character.getClass().getSimpleName();
    }

    public static void main(String[] args) throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character character1 = characterFactory.getRandomInstance();
        Character character2 = characterFactory.getRandomInstance();

        gameManager.fight(character1, character2);
    }
}