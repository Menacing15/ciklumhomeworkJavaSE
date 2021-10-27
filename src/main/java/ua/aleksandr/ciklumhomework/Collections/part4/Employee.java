package ua.aleksandr.ciklumhomework.Collections.part4;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }
}
