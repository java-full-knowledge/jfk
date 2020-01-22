package tank;


import java.util.Random;

public class Tank implements Armoredvehicle {

    private CoordinateSystem map;
    private Position position;
    private Direction shootingDirection;

    public Tank(CoordinateSystem map) {
        this.constructor(map);
        shootingDirection = Direction.East;
        this.map = map;
    }

    public Tank(Direction shootingDirection, CoordinateSystem map) {
        this.constructor(map);
        this.shootingDirection = shootingDirection;
        this.map = map;
    }

    public void constructor(CoordinateSystem map) {
        boolean t = false;
        int i = 0, j = 0;
        while (t != true) {
            i = new Random().nextInt(map.getLength() - 1);
            j = new Random().nextInt(map.getLength() - 1);
            if (map.getCoordinate()[i][j] == null || map.getCoordinate()[i][j].GetSituation().equals(Situation.empty))
                t = true;
        }
        this.position = new Position(i, j, Situation.tank);
        map.getCoordinate()[i][j] = new Position(i, j, Situation.tank);

    }

    public Direction getShootingDirection() {
        return shootingDirection;
    }

    public void setShootingDirection(Direction shootingDirection) {
        this.shootingDirection = shootingDirection;
    }

    @Override
    public boolean moveNorth() {
        int x = (int) (this.position.getX() - 1);
        int y = (int) (this.position.getY());
        if (x >= 0 && map.getCoordinate()[x][y] == null) {
            map.getCoordinate()[x][y] = new Position(x, y, Situation.tank);
            map.getCoordinate()[x + 1][y].setSituation(Situation.empty);
            this.position = map.getCoordinate()[x][y];
            return true;
        }
        if (x >= 0 && map.getCoordinate()[x][y] != null) {
            if (map.getCoordinate()[x][y].GetSituation().equals(Situation.empty)) {
                map.getCoordinate()[x][y].setSituation(Situation.tank);
                map.getCoordinate()[x + 1][y].setSituation(Situation.empty);
                this.position = new Position(x, y, Situation.tank);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean moveSouth() {

        int x = (int) (this.position.getX() + 1);
        int y = (int) (this.position.getY());
        if (x < map.getCoordinate().length && map.getCoordinate()[x][y] == null) {
            map.getCoordinate()[x][y] = new Position(x, y, Situation.tank);
            map.getCoordinate()[x - 1][y].setSituation(Situation.empty);
            this.position = new Position(x, y, Situation.tank);
            return true;
        }
        if (x < map.getCoordinate().length && map.getCoordinate()[x][y] != null) {
            if (map.getCoordinate()[x][y].GetSituation().equals(Situation.empty)) {
                map.getCoordinate()[x][y].setSituation(Situation.tank);
                map.getCoordinate()[x - 1][y].setSituation(Situation.empty);
                this.position = map.getCoordinate()[x][y];
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean moveEast() {
        int x = (int) (this.position.getX());
        int y = (int) (this.position.getY() + 1);
        if (y < map.getCoordinate().length && map.getCoordinate()[x][y] == null) {
            map.getCoordinate()[x][y] = new Position(x, y, Situation.tank);
            map.getCoordinate()[x][y - 1].setSituation(Situation.empty);
            this.position = map.getCoordinate()[x][y];
            return true;
        }
        if (y < map.getCoordinate().length && map.getCoordinate()[x][y] != null) {
            if (map.getCoordinate()[x][y].GetSituation().equals(Situation.empty)) {
                map.getCoordinate()[x][y].setSituation(Situation.tank);
                map.getCoordinate()[x][y - 1].setSituation(Situation.empty);
                this.position = new Position(x, y, Situation.tank);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean moveWest() {
        int x = (int) (this.position.getX());
        int y = (int) (this.position.getY() - 1);
        if (y >= 0 && map.getCoordinate()[x][y] == null) {
            map.getCoordinate()[x][y] = new Position(x, y, Situation.tank);
            map.getCoordinate()[x][y + 1].setSituation(Situation.empty);
            this.position = new Position(x, y, Situation.tank);
            return true;
        }
        if (y >= 0 && map.getCoordinate()[x][y] != null) {
            if (map.getCoordinate()[x][y].GetSituation().equals(Situation.empty)) {
                map.getCoordinate()[x][y].setSituation(Situation.tank);
                map.getCoordinate()[x][y - 1].setSituation(Situation.empty);
                this.position = map.getCoordinate()[x][y];
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean shoot() {
        switch (this.shootingDirection.getDirection()) {
            case "North": {
                for (int i = (int) position.getX() - 1; i >= 0; i--) {
                    if (map.getCoordinate()[i][(int) position.getY()] != null && map.getCoordinate()[i][(int) position.getY()].GetSituation().equals(Situation.barrier))
                        return false;
                    if (map.getCoordinate()[i][(int) position.getY()] != null && map.getCoordinate()[i][(int) position.getY()].GetSituation().equals(Situation.tank))
                        return true;
                }
                return false;
            }
            case "South": {
                for (int i = (int) position.getX() + 1; i < map.getCoordinate().length; i++) {
                    if (map.getCoordinate()[i][(int) position.getY()] != null && map.getCoordinate()[i][(int) position.getY()].GetSituation().equals(Situation.barrier))
                        return false;
                    if (map.getCoordinate()[i][(int) position.getY()] != null && map.getCoordinate()[i][(int) position.getY()].GetSituation().equals(Situation.tank))
                        return true;
                }
                return false;
            }
            case "East": {
                for (int i = (int) position.getY() + 1; i < map.getCoordinate().length; i++) {
                    if (map.getCoordinate()[(int) position.getX()][i] != null && map.getCoordinate()[(int) position.getX()][i].GetSituation().equals(Situation.barrier))
                        return false;
                    if (map.getCoordinate()[(int) position.getX()][i] != null && map.getCoordinate()[i][(int) position.getY()].GetSituation().equals(Situation.tank))
                        return true;
                }
                return false;

            }
            case "West": {
                for (int i = (int) position.getY() - 1; i >= 0; i--) {
                    if (map.getCoordinate()[(int) position.getX()][i] != null && map.getCoordinate()[(int) position.getX()][i].GetSituation().equals(Situation.barrier))
                        return false;
                    if (map.getCoordinate()[(int) position.getX()][i] != null && map.getCoordinate()[(int) position.getX()][i].GetSituation().equals(Situation.tank))
                        return true;
                }
                return false;
            }

        }
        return false;
    }
}
