package com.ece.sad;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> firstCriteriaEmployees = criteria.meetCriteria(employees);
        return otherCriteria.meetCriteria(firstCriteriaEmployees);
    }
}
