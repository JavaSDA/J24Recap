package com.company.exercise;

import com.company.exercise.personCollect.Company;
import com.company.exercise.personCollect.Employee;
import com.company.exercise.personCollect.Person;

public class EmployeeTest {
    public static void main(String[] args) {

        Person person = new Person("George", "Freeman", 4);
        Person person1 = new Person("Fred", "Freeman", 3);
//        com.company.exercise.person.Person per = new com.company.exercise.person.Person("", "", 4);



        Employee georgeEmp = new Employee(person, "", 50000, 3);
        Employee fredEmp = new Employee(person1, "", 40000, 2);

        Company google = new Company("Google");
        google.addEmployee(georgeEmp, fredEmp);
        System.out.println(google);
        System.out.println(google.getAverageSalary());
    }
}
