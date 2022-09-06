package pro.sky.cours2HomeWork6_7_8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String addEmployee( @RequestParam("id") String id,
                               @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName,
                               @RequestParam("department") String department,
                               @RequestParam("salary") int salary ) {
        Employee employee = new Employee(
                id,
                firstName,
                lastName,
                department,
                salary);
        employeeService.addEmployee(employee);
        return "Сотрудник добавден";
    }

    @GetMapping("/remove")
    public String deliteEmployee( @RequestParam("id") String id,
                                  @RequestParam("firstName") String firstName,
                                  @RequestParam("lastName") String lastName,
                                  @RequestParam("department") String department,
                                  @RequestParam("salary") int salary ) {
        Employee employee = new Employee(
                id,
                firstName,
                lastName,
                department,
                salary);
        employeeService.deleteEmployee(employee);
        return "Сотрудник удален";
    }

    @GetMapping("/find")
    public String searchEmployee( @RequestParam("id") String id ) {
        return employeeService.searchEmployee(id);
    }


    @GetMapping
    public Map<String, Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/departments/min-salary")
    public Employee minSalary( @RequestParam("department") String department ) {
        return employeeService.getMinSalary(department);
    }

    @GetMapping("/departments/max-salary")
    public Employee maxSalary( @RequestParam("department") String department ) {
        return employeeService.getMaxSalary(department);
    }

     @GetMapping(value = "departments/all", params = "department")
    public List<Employee> allEmployeeOnDepartment( @RequestParam("department") String department ) {
        return employeeService.getEmployeeByDepartment(department);
    }

    @GetMapping("/departments/all")
    public Map<String, List<Employee>> getAllSortedByDepartment() {
        return employeeService.getAllSortedByDepartment();
    }

}


