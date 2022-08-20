package pro.sky.cours2HomeWork6_7_8.service;

import pro.sky.cours2HomeWork6_7_8.Employee;

import java.util.Map;

public interface EmployeeService {

    void addEmployee( Employee employee );


    void deleteEmployee( Employee employee );


    String searchEmployee( String id );

    Map<String, Employee> findAll();
}

