package pro.sky.cours2HomeWork6_7_8.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeAlreadyAddedExeption;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeNotFoundExeption;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public void addEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            throw new EmployeeAlreadyAddedExeption("Сотрудник уже есть в базе");
        } else {
           employees.add(emp);
        }
    }

    @Override
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public void deleteEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            employees.remove(emp);
        } else {
            throw new EmployeeNotFoundExeption("Сотрудник не найден в базе");
        }
    }

    @Override
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public Employee searchEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            return emp;
        } else {
            throw new EmployeeNotFoundExeption("Сотрудник не найден в базе");
        }
    }
}
