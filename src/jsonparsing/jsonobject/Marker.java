package jsonparsing.jsonobject;

import java.util.Arrays;

public class Marker {

    private String name;
    private double[] position;

    public Marker(String name, double[] position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double[] getPosition() {
        return position;
    }


    @Override
    public String toString() {
        return "Marker{" +
                "name='" + name + '\'' +
                ", position=" + Arrays.toString(position) +
                '}';
    }
}
