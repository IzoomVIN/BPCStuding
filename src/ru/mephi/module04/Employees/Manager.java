package ru.mephi.module04.Employees;

public class Manager extends Employee {
    private double salary;
    private double percentOfSales;
    private final String position;

    public Manager(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
        this.percentOfSales = 0;
        this.position = "Manager";
    }

    public Manager(String name, String surname, String patronymic, double salary) {
        super(name, surname, patronymic);
        this.salary = salary;
        this.percentOfSales = 0;
        this.position = "Manager";
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPercentOfSales() {
        return percentOfSales;
    }

    public void setPercentOfSales(double percentOfSales) {
        this.percentOfSales = percentOfSales;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.percentOfSales;
    }
}
