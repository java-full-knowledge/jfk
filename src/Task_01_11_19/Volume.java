package Task_01_11_19;

import ExerciseClasses.Rectangle;

public class Volume {
    private int height;
    private Rectangle rectangle;

    Volume(int height, Rectangle rectangle) {
        this.height = height;
        this.rectangle = rectangle;
    }

    public double vol() {
        return rectangle.getArea() * height * (1 / 3);
    }

    @Override
    public String toString() {
        return "Volume:[" + rectangle.toString() + "height" + height;
    }
}
