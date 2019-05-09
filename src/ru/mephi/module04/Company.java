package ru.mephi.module04;

import ru.mephi.module04.Employees.Employee;

import java.util.ArrayList;

public class Company {
    private ArrayList<Class<? extends Employee>> employees = new ArrayList<>();
    private String name;
    private String type;
    private long nowId;

    public Company(String name, String type) {
        this.name = name;
        this.type = type;
        this.nowId = 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    /** реализовано добавление и увольнение работников */

    public void addEmployee(Class<? extends Employee> employee){
        this.employees.add(this.addIndexToEmployee(employee));
    }

    private <V> V addIndexToEmployee(V employee){
        ((Employee)employee).setId(this.nowId++);
        return employee;
    }

    public void deleteEmployee(long id){
        for (int i = 0; i < this.employees.size(); i++){
            if (
                    this.equalsOfId(id, this.employees.get(i))
            ){
                this.employees.remove(i);
                break;
            }
        }
    }

    private <V> boolean equalsOfId(long id, V employee){
        return ((Employee)employee).getId() == id;
    }
}
