package tankgame.mission;

import tankgame.map.Environment;
import tankgame.player.Player;

public interface Mission {
    Environment getEnviroment();

    void start(Player player);
}
