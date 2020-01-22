package tank;


public class Position {

    private double X;
    private double Y;
    private Situation situation ;

    public Position(double x, double y, Situation situation) {
        X = x;
        Y = y;
        this.situation = situation;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public Situation GetSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "{X = " + X +
                ", Y = " + Y +
                '}';
    }
}

