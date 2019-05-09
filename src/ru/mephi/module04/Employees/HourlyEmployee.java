package ru.mephi.module04.Employees;

public class HourlyEmployee extends Employee {
    private int countOfHour;
    private int costOfHour;
    private final String position;

    public HourlyEmployee(String name, String surname, int costOfHour) {
        super(name, surname);
        this.costOfHour = costOfHour;
        this.countOfHour = 0;
        this.position = "Hourly employee";
    }

    public HourlyEmployee(String name, String surname, String patronymic, int costOfHour) {
        super(name, surname, patronymic);
        this.costOfHour = costOfHour;
        this.countOfHour = 0;
        this.position = "Hourly employee";
    }

    public int getCountOfHour() {
        return countOfHour;
    }

    public void setCountOfHour(int countOfHour) {
        this.countOfHour = countOfHour;
    }

    public int getCostOfHour() {
        return costOfHour;
    }

    public void setCostOfHour(int costOfHour) {
        this.costOfHour = costOfHour;
    }

    @Override
    public double getFullSalary() {
        return costOfHour*countOfHour;
    }
}
