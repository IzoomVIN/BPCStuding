package ru.mephi.module04;

import ru.mephi.module04.Employees.Executive;
import ru.mephi.module04.Employees.HourlyEmployee;
import ru.mephi.module04.Employees.Manager;
import ru.mephi.module04.Employees.SalariedEmployee;

public class test {
    public static void main(String[] args){
        Company co= new Company("aaa", "OAO");

        co.addEmployee(new SalariedEmployee("I", "V", "A", 122.25));
        co.addEmployee(new HourlyEmployee("Q", "W", "E", 123.25));
        co.addEmployee(new Manager("I", "V", "A", 124.25));
        co.addEmployee(new Executive("I", "V", "A", 125.25));
        co.showTableOfEmployees();

        co.deleteEmployee(1);
        co.showTableOfEmployees();

        co.changePosition(2, "Manager", 144);
        co.showTableOfEmployees();

        co.addEmployee(new SalariedEmployee("I", "V", "A", 123.25));
        co.addEmployee(new HourlyEmployee("Q", "W", "E", 123.25));
        co.addEmployee(new Manager("I", "V", "A", 123.25));
        co.addEmployee(new Executive("I", "V", "A", 123.25));
        co.addEmployee(new SalariedEmployee("I", "V", "A", 140.25));
        co.addEmployee(new HourlyEmployee("Q", "W", "E", 150.25));
        co.addEmployee(new Manager("I", "V", "A", 160.25));
        co.addEmployee(new Executive("I", "V", "A", 170.25));
        co.showTableOfTypes();

    }
}
