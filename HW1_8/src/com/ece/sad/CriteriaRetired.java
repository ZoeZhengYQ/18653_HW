package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRetired implements Criteria{
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> retiredEmployee = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee.getRetireStatus().equalsIgnoreCase("yes")) {
                retiredEmployee.add(employee);
            }
        }
        return retiredEmployee;
    }
}
