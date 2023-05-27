package skyprospringhomework28.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skyprospringhomework28.Employee.Employee;
import skyprospringhomework28.service.DepartmentServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentServiceImpl employeeService;

    public DepartmentController(DepartmentServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String hello() {
        return " погнали ";
    }

    @GetMapping("/max-salary")
    public Optional<Employee> findMaxSalaryDepartment(@RequestParam("departmentId") Integer department) {
        return employeeService.findMaxSalaryDepartment(department);
    }

    @GetMapping("/min-salary")
    public Optional<Employee> findMinSalaryDepartment(@RequestParam("departmentId") Integer department) {
        return employeeService.findMinSalaryDepartment(department);
    }

    @GetMapping(value = "/all", params = {"departmentId"})
    public List<Employee> printEmployeeDepartment(@RequestParam("departmentId") Integer department) {
        return employeeService.printEmployeeDepartment(department);
    }

    @GetMapping("/all")
    public String printEmployeeDepartment() {
        return employeeService.printEmployeeDepartmentAll();
    }
}
