package com.ece.sad;

import java.util.List;

public interface Criteria {
    List<Employee> meetCriteria(List<Employee> employees);
}
