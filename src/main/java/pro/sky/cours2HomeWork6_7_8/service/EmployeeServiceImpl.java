package pro.sky.cours2HomeWork6_7_8.service;

import org.springframework.stereotype.Service;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeNotFoundExeption;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, Employee> employees = new HashMap<>(Map.of(
            "1", new Employee("1", "Александр", "Сергеев"),
            "2", new Employee("2", "Иван", "Иванов")
    ));

    @Override
    public void addEmployee( Employee employee ) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee( Employee employee ) {
        if (employee.equals(employee)) {
            throw new EmployeeNotFoundExeption();
        } else {
            employees.remove(employee);
        }
    }


    @Override
    public String searchEmployee( String id ) {
        Employee employee = employees.get(id);
        if (employee == null) {
            throw new EmployeeNotFoundExeption();
        }
            final String personInfo = " "+
                    employee.getId() + " "
                    +employee.getFirstName() + " "
                    +employee.getLastName();
    return personInfo;
}

    @Override
    public Map<String, Employee> findAll() {
        return employees;
    }

}
