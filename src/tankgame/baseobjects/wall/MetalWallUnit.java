package tankgame.baseobjects.wall;

public final class MetalWallUnit extends Wall {
    public MetalWallUnit(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return " M_W ";
    }
}
