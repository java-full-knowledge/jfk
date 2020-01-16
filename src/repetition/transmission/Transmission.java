package repetition.transmission;

public abstract class  Transmission implements Transmissionable {

    protected Degree degreeoftransmission;
    protected int speed;

    public Transmission(Degree degreeoftransmission) {
        this.degreeoftransmission = degreeoftransmission;
    }

    public Degree getDegreeoftransmission() {
        return degreeoftransmission;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDegreeoftransmission(Degree degreeoftransmission) {
        this.degreeoftransmission = degreeoftransmission;
    }
}
