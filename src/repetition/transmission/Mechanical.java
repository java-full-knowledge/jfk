package repetition.transmission;

import repetition.transmission.exeption.Wrongtransmission;

public class Mechanical extends Transmission {
    public Mechanical(Degree degreeoftransmission) {
        super(degreeoftransmission);
    }

    @Override
    public void geardown() {
        if (degreeoftransmission.getDegree() != -1)
            degreeoftransmission = Degree.funk(degreeoftransmission.getDegree() - 1);
        else
            throw new Wrongtransmission();
    }

    @Override
    public void increasegear() {
        if (degreeoftransmission.getDegree() != 6)
            degreeoftransmission = Degree.funk(degreeoftransmission.getDegree() + 1);
        else
            throw new Wrongtransmission();
    }

    @Override
    public void reversegear() {
        degreeoftransmission = Degree.funk(-1);
    }

    @Override
    public String toString() {
        return "Mechanical{" +
                "degreeoftransmission=" + degreeoftransmission +
                ", speed=" + speed +
                '}';
    }
}
