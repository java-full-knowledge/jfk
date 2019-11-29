package Interface_25_11_19;

public class Main_Test {

    public static void main(String[] args) {
        Movable movable = new MovableCirle(2, 3, 1, 1, 4);
        System.out.println(movable);
        movable.moveDown();
        System.out.println(movable);
        movable = new MovableRectangle(2, 4, 2, 4, 1, 1);
        System.out.println(movable);
    }

}
