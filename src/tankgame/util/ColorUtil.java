package tankgame.util;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ColorUtil {
    private Color playerColor = Color.CYAN;
    private List<Color> availableColors = new ArrayList<>(5);
    private Random random = new Random();

    public ColorUtil() {
        this.availableColors.add(Color.BLUE);
        this.availableColors.add(Color.RED);
        this.availableColors.add(Color.WHITE);
        this.availableColors.add(Color.GREEN);
        this.availableColors.add(Color.MAGENTA);
    }

    public ColorUtil(Color... colors) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != playerColor)
                this.availableColors.add(colors[i]);
            if (availableColors.size() == 5)
                break;
        }
    }


    public Color playerColor() {
        return this.playerColor;
    }

    public Color getRandomColor() {
        return availableColors.get(this.random.nextInt(this.availableColors.size() - 1));
    }
}
