package ru.mephi.module04;

import ru.mephi.module04.Employees.*;

import java.util.ArrayList;

public class Company {
    private ArrayList[] employees = new ArrayList[4];
    private String name;
    private String type;
    private long nowId;

    public Company(String name, String type) {
        this.name = name;
        this.type = type;
        this.nowId = 1;
        employees[0] = new ArrayList<HourlyEmployee>();
        employees[1] = new ArrayList<SalariedEmployee>();
        employees[2] = new ArrayList<Manager>();
        employees[3] = new ArrayList<Executive>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void showTableOfEmployees(){
        StringBuilder table = new StringBuilder(String.format("%3s\t%10s\t%10s\t%10s\t%12s\t%12s",
                "ID", "Name", "Surname", "Patronymic", "Month salary", "Year salary"));
        table.append("\n");

        for (ArrayList al : employees) {
            for (Object emp : al) {
                table.append(String.format("%3d\t%10s\t%10s\t%10s\t%12f\t%12f",
                        ((Employee) emp).getId(),
                        ((Employee) emp).getName(),
                        ((Employee) emp).getSurname(),
                        ((Employee) emp).getPatronymic(),
                        ((Employee) emp).getFullSalary(),
                        ((Employee) emp).getFullSalary() * 12));
                table.append("\n");
            }
        }

        System.out.print(table);
    }

    public void showTableOfTypes(){
        StringBuilder table = new StringBuilder(String.format("%20s\t%12s\t%20s\t%20s",
                "Name of types","Count of emp", "Mid of Month salary", "Mid of Year salary"));
        table.append("\n");

        for (ArrayList al : employees) {
            double midOfMonth = 0;
            double midOfYear = 0;
            String pos = null;
            for (Object emp : al) {
                pos = ((Employee) emp).getPosition();
                midOfMonth += ((Employee) emp).getFullSalary();
                midOfYear += ((Employee) emp).getFullSalary() * 12;

            }

            midOfMonth = midOfMonth/al.size();
            midOfYear = midOfYear/al.size();

            table.append(String.format("%20s\t%12d\t%20f\t%20f",
                    pos, al.size(), midOfMonth, midOfYear));
            table.append("\n");
        }

        System.out.print(table);
    }

    public void changePosition(long employeeID, String newPosition, double salary){
        for (ArrayList al: employees) {
            for (Object emp : al) {
                if (((Employee)emp).getId() == employeeID) {
                    al.remove(emp);
                    change(emp, newPosition, salary);
                    return;
                }
            }
        }
    }

    public <T extends Employee> void addEmployee(T employee){
        employee.setId(this.nowId++);
        switch (employee.getPosition()){
            case "Hourly employee":
                this.employees[0].add(employee);
                break;
            case "Salaried employee":
                this.employees[1].add(employee);
                break;
            case "Manager":
                this.employees[2].add(employee);
                break;
            case "Executive":
                this.employees[3].add(employee);
                break;
        }
    }

    public void deleteEmployee(long id) {
        for (int i = 0; i < this.employees.length; i++) {
            for (Object emp : employees[i]) {
                if (((Employee)emp).getId() == id) {
                    this.employees[i].remove(emp);
                    return;
                }
            }
        }
    }

    private <V> void change (V emp, String position, double salary){
        switch (position){
            case "Hourly employee":
                HourlyEmployee employeeHE = new HourlyEmployee(
                        ((Employee)emp).getName(),
                        ((Employee)emp).getSurname(),
                        ((Employee)emp).getPatronymic(),
                        salary
                );
                employeeHE.setId(((Employee)emp).getId());

                this.employees[0].add(employeeHE);
                break;
            case "Salaried employee":
                SalariedEmployee employeeSE = new SalariedEmployee(
                        ((Employee)emp).getName(),
                        ((Employee)emp).getSurname(),
                        ((Employee)emp).getPatronymic(),
                        salary
                );
                employeeSE.setId(((Employee)emp).getId());

                this.employees[1].add(employeeSE);
                break;
            case "Manager":
                Manager employeeM = new Manager(
                        ((Employee)emp).getName(),
                        ((Employee)emp).getSurname(),
                        ((Employee)emp).getPatronymic(),
                        salary
                );
                employeeM.setId(((Employee)emp).getId());

                this.employees[2].add(employeeM);
                break;
            case "Executive":
                Executive employee = new Executive(
                        ((Employee)emp).getName(),
                        ((Employee)emp).getSurname(),
                        ((Employee)emp).getPatronymic(),
                        salary
                );
                employee.setId(((Employee)emp).getId());

                this.employees[3].add(employee);
                break;
        }
    }
}
