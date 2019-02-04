package com.ece.sad;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> firstCriteriaEmployees = criteria.meetCriteria(employees);
        List<Employee> otherCriteriaEmployees = otherCriteria.meetCriteria(employees);

        for (Employee employee : otherCriteriaEmployees) {
            if (!firstCriteriaEmployees.contains(employee)) {
                firstCriteriaEmployees.add(employee);
            }
        }
        return firstCriteriaEmployees;
    }
}
