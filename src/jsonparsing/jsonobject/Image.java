package jsonparsing.jsonobject;

public class Image {

    private String url;
    private int width;
    private int height;

    public Image(String url, int width, int height) {
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Image{ " +
                "url = '" + url + '\'' +
                ", width = " + width +
                ", height = " + height +
                '}';
    }
}