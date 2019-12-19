package tcheck.exeption;

public class InvalidDepartamentExeption extends  Exception{

    @Override
    public String getMessage() {
        return "Invalid Departament name!!!";
    }

}
