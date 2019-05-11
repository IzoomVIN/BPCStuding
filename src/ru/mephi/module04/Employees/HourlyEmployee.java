package ru.mephi.module04.Employees;

public class HourlyEmployee extends Employee {
    private double countOfHour;
    private double costOfHour;
    private final String position;

    public HourlyEmployee(String name, String surname, int costOfHour) {
        super(name, surname);
        this.costOfHour = costOfHour;
        this.countOfHour = 1;
        this.position = "Hourly employee";
    }

    public HourlyEmployee(String name, String surname, String patronymic, double costOfHour) {
        super(name, surname, patronymic);
        this.costOfHour = costOfHour;
        this.countOfHour = 1;
        this.position = "Hourly employee";
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getCountOfHour() {
        return countOfHour;
    }

    public void setCountOfHour(double countOfHour) {
        this.countOfHour = countOfHour;
    }

    public double getCostOfHour() {
        return costOfHour;
    }

    public void setCostOfHour(double costOfHour) {
        this.costOfHour = costOfHour;
    }

    @Override
    public double getFullSalary() {
        return costOfHour*countOfHour;
    }
}
