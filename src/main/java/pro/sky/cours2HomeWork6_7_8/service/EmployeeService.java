package pro.sky.cours2HomeWork6_7_8.service;

import pro.sky.cours2HomeWork6_7_8.Employee;

public interface EmployeeService {

    void addEmployee( String firstName, String lastName );

    void deleteEmployee( String firstName, String lastName );

    Employee searchEmployee( String firstName, String lastName );
}
