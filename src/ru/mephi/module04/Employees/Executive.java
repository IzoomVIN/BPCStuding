package ru.mephi.module04.Employees;

public class Executive extends Employee {
    private double salary;
    private double profitPercentageOfTheYear;
    private final String position;

    public Executive(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
        this.profitPercentageOfTheYear = 0;
        this.position = "Executive";
    }

    public Executive(String name, String surname, String patronymic, double salary) {
        super(name, surname, patronymic);
        this.salary = salary;
        this.profitPercentageOfTheYear = 0;
        this.position = "Executive";
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

    public double getProfitPercentageOfTheYear() {
        return profitPercentageOfTheYear;
    }

    public void setProfitPercentageOfTheYear(double profitPercentageOfTheYear) {
        this.profitPercentageOfTheYear = profitPercentageOfTheYear;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.profitPercentageOfTheYear;
    }
}
