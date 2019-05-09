package ru.mephi.module04.Employees;

public class SalariedEmployee extends Employee {
    private double salary;
    private final String position;

    public SalariedEmployee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
        this.position = "Salaried employee";
    }

    public SalariedEmployee(String name, String surname, String patronymic, double salary) {
        super(name, surname, patronymic);
        this.salary = salary;
        this.position = "Salaried employee";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getFullSalary() {
        return this.salary;
    }
}
