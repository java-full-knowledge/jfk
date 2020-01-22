package tank;

public enum Direction {

    North("North"),South("South"),East("East"),West("West");
    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
