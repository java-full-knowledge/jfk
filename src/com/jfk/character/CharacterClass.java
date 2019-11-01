package src.com.jfk.character;

public class CharacterClass {

    public char[] value;

    public CharacterClass(char[] array) {
        value = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            value[i] = array[i];
        }
    }

    public char[] array() {
        return value;
    }

    public void replaceCharacter(char character, char replacement) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == character) {
                value[i] = replacement;
            }
        }
    }

    public void display() {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + ", ");
        }
        System.out.println();
    }

}
