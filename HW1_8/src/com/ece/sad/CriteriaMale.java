package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> maleEmployee = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee.getGender().equalsIgnoreCase("male")) {
                maleEmployee.add(employee);
            }
        }
        return maleEmployee;
    }
}
