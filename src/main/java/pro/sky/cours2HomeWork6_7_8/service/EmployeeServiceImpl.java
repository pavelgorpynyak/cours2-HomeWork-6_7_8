package pro.sky.cours2HomeWork6_7_8.service;

import org.springframework.stereotype.Service;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeAlreadyAddedExeption;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeNotFoundExeption;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            throw new EmployeeAlreadyAddedExeption();
        } else {
           employees.add(emp);
        }
        return emp;
    }

    @Override
    public Employee deleteEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            employees.remove(emp);
        } else {
            throw new EmployeeNotFoundExeption();
        }
        return emp;
    }

    @Override
    public Employee searchEmployee( String firstName, String lastName ) {
        Employee emp = new Employee(firstName, lastName);
        if (employees.contains(emp)) {
            return emp;
        } else {
            throw new EmployeeNotFoundExeption();
        }
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

}
