package pro.sky.cours2HomeWork6_7_8.exeption;

public class EmployeeAlreadyAddedExeption extends RuntimeException {
    public EmployeeAlreadyAddedExeption( String message ) {
        super(message);
    }
}
