package repetition.transmission;

public class Car {
    private Transmission transmission;

    public Car(Transmission transmission, int speed) {
        this.transmission = transmission;
        this.transmission.setSpeed(speed);
    }

    public Transmission getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "transmission=" + transmission +
                '}';
    }
}
