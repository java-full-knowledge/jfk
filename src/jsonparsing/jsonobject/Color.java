package jsonparsing.jsonobject;

public class Color {

    private String color;
    private String category;
    private String type;
    private Code code;

    public Color(String color, String category, Code code) {
        this.color = color;
        this.category = category;
        this.code = code;
    }

    public Color(String color, String category, String type, Code code) {
        this.color = color;
        this.category = category;
        this.type = type;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' + "," +
                " code=" + code +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public Code getCode() {
        return code;
    }

}
