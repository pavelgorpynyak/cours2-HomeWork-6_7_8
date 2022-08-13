package pro.sky.cours2HomeWork6_7_8.service;

import org.springframework.stereotype.Service;
import pro.sky.cours2HomeWork6_7_8.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void printAllEmployeeData( Employee[] employees ) {
        for (int i = 0; i < employees.length; i++) {
            if (i < employees.length) {
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public void employeeNames( Employee[] employees ) {
        for (int i = 0; i < employees.length; i++) {
            if (i < employees.length) {
                System.out.println(employees[i].getFirstName());
            }
        }
    }


    public Employee[] employees = {


            new Employee("Иван", "Иванов" ),
            new Employee("Иван" , "Петров"),
            new Employee("Петр", "Иванов"),
            new Employee("Петр", "Петров"),
            new Employee("Сергей", "Сергеев"),
            new Employee("Сергей", "Андреев"),
            new Employee("Андрей", "Андреев"),
            new Employee("Андрей", "Сергеев"),
            new Employee("Игорь", "Игорев"),
            new Employee("Реслан", "Русланов"),
    };
}
