package tcheck.exeption;

public class InvalidIdExeption extends Exception {

    @Override
    public String getMessage() {
        return "Invalid Id";
    }
}
