package skyprospringhomework28.Employee;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final Integer department;
    private final Integer salary;

    public Employee(String firstName, String lastName, Integer department, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                department.equals(employee.department) &&
                salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, department, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник: {" +
                " " + firstName + '\'' +
                ", " + lastName + '\'' +
                ", отдел - " + department + '\'' +
                ", зп= " + salary + '\'' +
                '}';
    }
}
