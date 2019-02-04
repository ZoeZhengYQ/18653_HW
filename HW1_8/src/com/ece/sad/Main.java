package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tom", "male", "yes"));
        employees.add(new Employee("Jack", "male", "no"));
        employees.add(new Employee("Mike", "male", "no"));
        employees.add(new Employee("Bob", "male", "yes"));
        employees.add(new Employee("Jane", "female", "no"));
        employees.add(new Employee("Diana", "female", "yes"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria retired = new CriteriaRetired();
        Criteria retiredFemale = new AndCriteria(female, retired);
        Criteria retiredOrMale = new OrCriteria(male, retired);

        System.out.println("All employees:");
        printList(employees);

        System.out.println("\nMale: ");
        printList(male.meetCriteria(employees));

        System.out.println("\nFemale: ");
        printList(female.meetCriteria(employees));

        System.out.println("\nRetired female: ");
        printList(retiredFemale.meetCriteria(employees));

        System.out.println("\nRetired or male: ");
        printList(retiredOrMale.meetCriteria(employees));

    }

    public static void printList(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Gender: " + employee.getGender() + ", Retired: " + employee.getRetireStatus());
        }
    }
}
