package org.local.dao;

import org.local.model.Employee;

import java.math.BigInteger;
import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    Employee readById(BigInteger id);
    List<Employee> allEmployee();

    void delete(Employee employee);
}
