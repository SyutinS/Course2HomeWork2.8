package skyprospringhomework28.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("Имя1", "Фамилия1", 1, 30000);
        Employee employee2 = new Employee("Имя2", "Фамилия2", 1, 35000);
        Employee employee3 = new Employee("Имя3", "Фамилия3", 2, 40000);
        Employee employee4 = new Employee("Имя4", "Фамилия4", 2, 45000);
        Employee employee5 = new Employee("Имя5", "Фамилия5", 3, 50000);
        Employee employee6 = new Employee("Имя6", "Фамилия6", 3, 55000);
        Employee employee7 = new Employee("Имя7", "Фамилия7", 4, 60000);
        Employee employee8 = new Employee("Имя8", "Фамилия8", 4, 65000);
        Employee employee9 = new Employee("Имя9", "Фамилия9", 5, 70000);
        Employee employee10 = new Employee("Имя10", "Фамилия10", 5, 75000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }
}
