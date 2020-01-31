package tankgame.mission;

import tankgame.baseobjects.tankbase.EnemyTankBase;
import tankgame.baseobjects.tankbase.ScheduledEnemyTankCreator;
import tankgame.baseobjects.wall.MetalWallUnit;
import tankgame.baseobjects.wall.StoneWallUtil;
import tankgame.map.Environment;
import tankgame.player.Player;

public class Mission_1 implements Mission{
    private Environment environment;
    private EnemyTankBase enemyTankBase;
    private ScheduledEnemyTankCreator scheduled;


    public Mission_1(Environment environment) {
        this.environment = environment;
        enemyTankBase = new EnemyTankBase();
       // scheduled=new ScheduledEnemyTankCreator(5,TimeUnit.MINUTES);
    }
    public void  start(Player player){

        environment.setCoordinatedObject(player.getTank());
        environment.setCoordinatedObject(enemyTankBase.create());
        environment.setCoordinatedObject(new MetalWallUnit(2,1));
        environment.setCoordinatedObject(new MetalWallUnit(3,1));
        environment.setCoordinatedObject(new MetalWallUnit(4,1));
        environment.setCoordinatedObject(new StoneWallUtil(5,4));
        environment.setCoordinatedObject(new StoneWallUtil(6,4));
        environment.setCoordinatedObject(new StoneWallUtil(0,6));
        environment.setCoordinatedObject(new StoneWallUtil(1,6));
        environment.setCoordinatedObject(new StoneWallUtil(5,8));
        environment.setCoordinatedObject(new StoneWallUtil(5,9));
        environment.setCoordinatedObject(new StoneWallUtil(9,0));
        environment.setCoordinatedObject(new StoneWallUtil(8,0));
        environment.setCoordinatedObject(new StoneWallUtil(9,1));
        environment.setCoordinatedObject(new StoneWallUtil(8,1));

    }

    @Override
    public Environment getEnviroment() {
        return this.environment;
    }
}
