package repetition.transmission;

public class Automate extends Transmission {

    public Automate(Degree degreeoftransmission) {
        super(degreeoftransmission);
    }

    public Automate(int speed) {

        super(regulator(speed));
        this.speed = speed;
    }

    public static Degree regulator(int speed) {
        Degree degreeoftransmission;
        if (speed == 0)
            degreeoftransmission = Degree.nitral;
        else if (speed > 0 && speed <= 20)
            degreeoftransmission = Degree.first;
        else if (speed > 20 && speed <= 40)
            degreeoftransmission = Degree.second;
        else if (speed > 40 && speed <= 70)
            degreeoftransmission = Degree.third;
        else if (speed > 70 && speed <= 100)
            degreeoftransmission = Degree.fourth;
        else degreeoftransmission = Degree.fifth;
        return degreeoftransmission;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
        degreeoftransmission = regulator(speed);
    }

    @Override
    public void geardown() {

        degreeoftransmission = regulator(this.speed);
    }

    @Override
    public void increasegear() {
        degreeoftransmission = regulator(this.speed);
    }

    @Override
    public void reversegear() {
        degreeoftransmission = Degree.funk(-1);
    }


    @Override
    public String toString() {
        return "Automate{" +
                "degreeoftransmission=" + degreeoftransmission +
                ", speed=" + speed +
                '}';
    }
}
