package pro.sky.cours2HomeWork6_7_8.service;

import org.springframework.stereotype.Service;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeNotFoundExeption;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    Map<String, Employee> employees = new HashMap<>(Map.of(
            "1", new Employee("1", "Александр", "Сергеев",
                    "1", 100_000),
            "2", new Employee("2", "Иван", "Иванов",
                    "2", 90_000),
            "3", new Employee("3", "Сергей", "Сергеев",
                    "3", 110_000),
            "4", new Employee("4", "Андрей", "Андреев",
                    "3", 115_000),
            "5", new Employee("5", "Даниил", "Данилов",
                    "1", 120_000),
            "6", new Employee("6", "Эдуард", "Эдуардов",
                    "2", 100_000)
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
        final String personInfo = " " +
                employee.getId() + " "
                + employee.getFirstName() + " "
                + employee.getLastName() + " "
                + employee.getDepartment() + " "
                + employee.getSalary();
        return personInfo;
    }

    @Override
    public Map<String, Employee> findAll() {
        return employees;
    }

    @Override
    public Employee getMinSalary( String department ) {

        return employees.values().stream()
                .filter(e -> e.getDepartment().equals(department))
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public Employee getMaxSalary( String department ) {

        return employees.values().stream()
                .filter(e -> e.getDepartment().equals(department))
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundExeption::new);
    }

    @Override
    public List<Employee> getEmployeeByDepartment( String department ) {
        return employees.values().stream()
                .filter(e -> e.getDepartment().equals(department))
                .toList();
    }

    @Override
    public Map<String, List<Employee>> getAllSortedByDepartment() {
        return employees.values().stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getLastName)
                )
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

}
