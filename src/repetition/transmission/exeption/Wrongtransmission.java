package repetition.transmission.exeption;

public class Wrongtransmission extends RuntimeException {
    @Override
    public String getMessage() {
        return "Input wrong transmission!!!";
    }
}
