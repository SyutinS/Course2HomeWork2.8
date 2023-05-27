package skyprospringhomework28.service;

import skyprospringhomework28.Employee.Employee;

import java.util.List;
import java.util.Optional;

interface EmployeeService {

    Optional<Employee> findMaxSalaryDepartment(Integer department);

    Optional<Employee> findMinSalaryDepartment(Integer department);

    List<Employee> printEmployeeDepartment(Integer department);

    String printEmployeeDepartmentAll();

}
