package jsonparsing.jsonobject;

import java.util.Arrays;

public class Code {

    private int[] rgba;
    private String hex;

    public Code(int[] rgba, String hex) {
        this.rgba = rgba;
        this.hex = hex;
    }

    public int[] getRgba() {
        return rgba;
    }

    public String getHex() {
        return hex;
    }

    @Override
    public String toString() {
        return "Code{" +
                "rgba=" + Arrays.toString(rgba) +
                ", hex='" + hex + '\'' + '}';
    }
}
