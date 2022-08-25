package pro.sky.cours2HomeWork6_7_8.service;

import pro.sky.cours2HomeWork6_7_8.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    void addEmployee( Employee employee );


    void deleteEmployee( Employee employee );


    String searchEmployee( String id );

    Map<String, Employee> findAll();

    Employee getMinSalary( String department );

    Employee getMaxSalary( String department );

    List<Employee> getEmployeeByDepartment( String department );

    Map<String, List<Employee>> getAllSortedByDepartment();
}

