package com.company.exercise;

import com.company.exercise.person.Employee;
import com.company.exercise.person.Person;

public class EmployeeTest {
    public static void main(String[] args) {

        Person person = new Person("George", "Freeman", 4);



        Employee employee2 = new Employee(person, "", "" );
        Employee employee = new Employee("harr", "", 4, "", "");
    }
}
