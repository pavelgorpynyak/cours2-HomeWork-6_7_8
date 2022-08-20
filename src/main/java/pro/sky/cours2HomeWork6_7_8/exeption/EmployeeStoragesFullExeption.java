package pro.sky.cours2HomeWork6_7_8.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeStoragesFullExeption extends RuntimeException {
    public EmployeeStoragesFullExeption( String message ) {
        super(message);
    }

    public EmployeeStoragesFullExeption( String message, Throwable cause ) {
        super(message, cause);
    }

    public EmployeeStoragesFullExeption( Throwable cause ) {
        super(cause);
    }

    public EmployeeStoragesFullExeption( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EmployeeStoragesFullExeption() {
    }
}
