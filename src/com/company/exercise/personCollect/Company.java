package com.company.exercise.personCollect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private String companyName;
    private List<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public Company(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public void addEmployee(Employee... employees) {
        this.employees.addAll(Arrays.asList(employees));
//        for (Employee emp : employees) {
//            this.employees.add(emp);
//        }
        System.out.println("Added employee successfully");
    }

    public float getAverageSalary() {
        // Initialize the sum variable to 0
        float sum = 0;

        // Loop through and sum the salaries
        for (Employee emp : employees) {
            sum += emp.getSalary();
        }

        // return the average
        return sum / employees.size();
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
