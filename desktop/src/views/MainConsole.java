package views;

import java.util.ArrayList;

import models.Employee;

public class MainConsole {

    public MainConsole() {
    
    }
    
    public void printEmployees(ArrayList<Employee> emps) {
        for(Employee emp: emps) {
            System.out.printf (
                "|%15s|%15s|%15s|\n",
                emp.getName(),
                emp.getCity(),
                emp.getSalary()
            );
        }
    }
}
