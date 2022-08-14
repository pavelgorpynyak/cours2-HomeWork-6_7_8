package pro.sky.cours2HomeWork6_7_8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cours2HomeWork6_7_8.Employee;
import pro.sky.cours2HomeWork6_7_8.exeption.EmployeeNotFoundExeption;
import pro.sky.cours2HomeWork6_7_8.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController( EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String addEmployee( @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName ) {
        employeeService.addEmployee(firstName, lastName);
        return "Сотрудник добавден";
    }

    @GetMapping("/remove")
    public String deleteEmployee( @RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName ) {
        if (firstName.contains(firstName) && lastName.contains(lastName)) {
            employeeService.deleteEmployee(firstName, lastName);
        }else {
            throw new EmployeeNotFoundExeption("Сотрудника нет в базе");
        }
        return "Сотрудник удален";
    }

    @GetMapping("/find")
    public Employee searchEmployee( @RequestParam("firstName") String firstName,
                                    @RequestParam("lastName") String lastName ) {
        return employeeService.searchEmployee(firstName, lastName);
    }
}
