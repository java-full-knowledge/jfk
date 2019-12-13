package jsonparsing.jsonobject;

public class Colors {

    private Color[] colors;

    public Colors(Color[] colors) {
        this.colors = colors;
    }

    public Color[] getColors() {
        return colors;
    }

    @Override
    public String toString() {
        String s = "";
        for (Color col : colors)
            s += col.toString() + "\n";
        return s;
    }
}
