package src.com.jfk.character;

import src.com.jfk.character.CharacterClass;

public class CharacterMethods {
    public static void display(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        array[0] = 'M';
        System.out.println();
    }

    public static void display(boolean value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        char[] n = {'a', '4', 'a', 'a', 'g', 'k', 'm', 'a', 'g', 'a'};
        CharacterClass characterClass = new CharacterClass(n);
        characterClass.replaceCharacter('4', '1');
        characterClass.display();
        char[] array = characterClass.array();
        array[0] = 'M';
        characterClass.display();
        display(array);
    }
}

















