package src.com.jfk.geometric;

public class Volume {

    private int h;
    private Rectangle bottomRectangle;

    //Lazy initialized fields
    private Rectangle top;

    public Volume(int h, Rectangle bottomRectangle) {
        this.h = h;
        this.bottomRectangle = new Rectangle(bottomRectangle.length(), bottomRectangle.width());
    }

    public Volume(int h, int bottomRecLength, int bottomRecWidth) {
        this.h = h;
        this.bottomRectangle = new Rectangle(bottomRecLength, bottomRecWidth);
    }

    public Rectangle topRectangle() {
        if (top == null) {
            System.out.println("Is null initializing");
            top = new Rectangle(this.bottomRectangle.length(), this.bottomRectangle.width());
            return top;
        }
        System.out.println("Already initializing doing return");
        return top;
    }
}
