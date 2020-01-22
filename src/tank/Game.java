package tank;

public class Game {
    public static void main(String[] args) {
        CoordinateSystem map=new CoordinateSystem(10);
        Armoredvehicle tank1=new Tank(Direction.North,map);
        Armoredvehicle tank2=new Tank(Direction.West,map);
        System.out.println(map);
        System.out.println(tank1.shoot());
        System.out.println(tank2.shoot());
        tank1.moveNorth();
        tank1.moveEast();
        tank2.moveSouth();
        System.out.println(map);

    }
}
