package ru.mephi.module04.Employees;

public abstract class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private String position;
    private long id;

    Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.patronymic = null;
    }

    Employee(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public abstract double getFullSalary();

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
