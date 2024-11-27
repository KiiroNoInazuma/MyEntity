package org.local.dao;

import org.local.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    Employee readById(Integer id);
    List<Employee> allEmployee();

    void delete(Employee employee);
}
