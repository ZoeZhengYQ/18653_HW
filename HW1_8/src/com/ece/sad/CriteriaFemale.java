package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> femaleEmployee = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee.getGender().equalsIgnoreCase("female")) {
                femaleEmployee.add(employee);
            }
        }
        return femaleEmployee;
    }
}
