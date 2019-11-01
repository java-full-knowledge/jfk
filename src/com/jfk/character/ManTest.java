package src.com.jfk.character;

public class ManTest {

    public static void main(String args[]) {
        Man ManOne = new Man("Ashxarabek");
        Man ManTwo = new Man("Parandzem");
        Man ManTree = new Man("Antaram");
        ManOne.ManAge(26);
        ManOne.ManDesignation("Senior Software Engineer");
        ManOne.ManSalary(1000);
        ManOne.printMan();

        ManTwo.ManAge(21);
        ManTwo.ManDesignation("Software Engineer");
        ManTwo.ManSalary(500);
        ManTwo.printMan();

        ManTree.ManAge(55);
        ManTree.ManDesignation("Junior Software Engineer");
        ManTree.ManSalary(300);
        ManTree.printMan();
    }
}