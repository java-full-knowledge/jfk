package tankgame.game;

import tankgame.control.GameControl;
import tankgame.map.Environment;
import tankgame.mission.Mission;
import tankgame.mission.Mission_1;
import tankgame.player.Player;

public class Game {
    private GameControl gameControl;

    public Game() {
        Environment environment = new Environment(10);
        Mission mission = new Mission_1(environment);
        Player player = new Player("Arman");
        mission.start(player);
        gameControl = new GameControl(mission, player.getTank());
    }

    @Override
    public String toString() {
        return gameControl.getMission().getEnviroment().toString();
    }

    public GameControl getGameControl() {
        return gameControl;
    }
}
