package tank;


import java.util.Random;

public class CoordinateSystem {

    private Position[][] coordinate;

    public CoordinateSystem(int length) {
        this.coordinate = new Position[length][];
        for (int i = 0; i < coordinate.length; i++)
            coordinate[i] = new Position[length];
        this.mason(length);
    }

    private void mason(int len) {
        Random ran = new Random();
        int n = len * 3 / 4, x, y;
        while (n >= 0) {
            x = ran.nextInt(len - 1);
            y = ran.nextInt(len - 1);
            coordinate[x][y] = new Position(x, y, Situation.barrier);
            if (y + 1 < len)
                coordinate[x][y + 1] = new Position(x, y + 1, Situation.barrier);
            if (y - 1 > 0)
                coordinate[x][y - 1] = new Position(x, y - 1, Situation.barrier);
            n--;
        }
    }

    public Position[][] getCoordinate() {
        return coordinate;
    }

    public int getLength() {
        return coordinate.length;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < coordinate.length; i++) {
            for (int j = 0; j < coordinate[i].length; j++) {
                if (coordinate[i][j] != null && coordinate[i][j].GetSituation().equals(Situation.barrier)) {
                    temp += "B  ";
                    continue;
                }
                if (coordinate[i][j] != null && coordinate[i][j].GetSituation().equals(Situation.tank)) {
                    temp += "T  ";
                    continue;
                }
                temp += "_  ";
            }
            temp += "\n";
        }
        return temp;
    }
}

