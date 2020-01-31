package tankgame.main;

import tankgame.game.Game;

public class Test {
    public static void main(String[] args) {
        System.out.println(2);
        Game tank = new Game();
        System.out.println(tank);
        tank.getGameControl().down();
        System.out.println(tank);

    }
}
