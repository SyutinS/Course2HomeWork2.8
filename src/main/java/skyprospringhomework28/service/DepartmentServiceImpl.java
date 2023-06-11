package skyprospringhomework28.service;

import org.springframework.stereotype.Service;
import skyprospringhomework28.Employee.Employee;
import skyprospringhomework28.Employee.EmployeeList;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements EmployeeService {

    @Override
    public Optional<Employee> findMaxSalaryDepartment(Integer department) {
        return EmployeeList.getEmployeeList().stream()
                .filter(d -> d.getDepartment().equals(department))
                .max(Comparator.comparingInt(Employee::getSalary));
    }

    @Override
    public Optional<Employee> findMinSalaryDepartment(Integer department) {
        return EmployeeList.getEmployeeList().stream()
                .filter(d -> d.getDepartment().equals(department))
                .min(Comparator.comparingInt(Employee::getSalary));
    }

    @Override
    public List<Employee> printEmployeeDepartment(Integer department) {
        return EmployeeList.getEmployeeList().stream()
                .filter(d -> d.getDepartment().equals(department))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public String printEmployeeDepartmentAll() {
        Map<Integer, List<Employee>> employeesDep =
        EmployeeList.getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        return " Отдел " + employeesDep;
    }

}
