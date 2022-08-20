package pro.sky.cours2HomeWork6_7_8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee( @RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName ) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee deleteEmployee( @RequestParam("firstName") String firstName,
                                    @RequestParam("lastName") String lastName ) {
        return employeeService.deleteEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee searchEmploee( @RequestParam("firstName") String firstName,
                                   @RequestParam("lastName") String lastName ) {
        return employeeService.searchEmployee(firstName, lastName);
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
