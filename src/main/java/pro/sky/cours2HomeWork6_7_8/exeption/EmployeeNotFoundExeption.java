package pro.sky.cours2HomeWork6_7_8.exeption;

public class EmployeeNotFoundExeption extends RuntimeException{
    public EmployeeNotFoundExeption( String message ) {
        super(message);
    }
}
