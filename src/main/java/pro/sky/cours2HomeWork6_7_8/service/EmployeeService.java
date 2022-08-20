package pro.sky.cours2HomeWork6_7_8.service;

import pro.sky.cours2HomeWork6_7_8.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee( String firstName, String lastName );

    Employee deleteEmployee( String firstName, String lastName );

    Employee searchEmployee( String firstName, String lastName );

    List<Employee> findAll();
}

