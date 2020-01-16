package repetition.transmission.exeption;

public class DegreeExeption extends RuntimeException {
    @Override
    public String getMessage() {
        return "Is invalid degree!!!";
    }
}
