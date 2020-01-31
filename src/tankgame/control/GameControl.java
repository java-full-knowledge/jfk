package tankgame.control;

import tankgame.baseobjects.tank.Tank;
import tankgame.map.Point;
import tankgame.mission.Mission;
import tankgame.movingobject.MovingObject;

public class GameControl implements MovingObject {
    private Mission mission;
    private Tank tank;
    private Point point;

    public GameControl(Mission mission, Tank tank) {
        this.mission = mission;
        this.tank = tank;
        this.point = tank.coordinate();
    }

    public Mission getMission() {
        return mission;
    }

    @Override
    public void up() {
        point.setY(point.Y+1);
        if (mission.getEnviroment().getCoordinatedObject(point) == null) {
            mission.getEnviroment().setCoordinatedObject(tank.coordinate(), tank);
            Point point1 = new Point(point.X, point.Y - 1);
            mission.getEnviroment().setCoordinatedObject(point1, null);
            return;
        }
        point.setY(point.Y-1);
    }

    @Override
    public void down() {
        point.setY(point.Y-1);
        if (mission.getEnviroment().getCoordinatedObject(point) == null) {
            mission.getEnviroment().setCoordinatedObject(tank.coordinate(), tank);
            Point point1 = new Point(point.X, point.Y + 1);
            mission.getEnviroment().setCoordinatedObject(point1, null);
            return;
        }
        point.setY(point.Y+1);
    }

    @Override
    public void right() {
        point.setX(point.X+1);
        if (mission.getEnviroment().getCoordinatedObject(point) == null) {
            mission.getEnviroment().setCoordinatedObject(tank.coordinate(), tank);
            Point point1 = new Point(point.X - 1, point.Y);
            mission.getEnviroment().setCoordinatedObject(point1, null);
            return;
        }
        point.setX(point.X-1);
    }

    @Override
    public void left() {
        point.setX(point.X-1);
        if (mission.getEnviroment().getCoordinatedObject(point) == null) {
            mission.getEnviroment().setCoordinatedObject(tank.coordinate(), tank);
            Point point1 = new Point(point.X + 1, point.Y);
            mission.getEnviroment().setCoordinatedObject(point1, null);
            return;
        }
        point.setX(point.X+1);
    }
}
