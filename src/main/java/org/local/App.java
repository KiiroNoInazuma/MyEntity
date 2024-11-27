package org.local;

import org.local.dao.EmployeeDAO;
import org.local.dao.EmployeeDAOImpl;
import org.local.model.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = employeeDAO.readById(2);
        System.out.println(employee);
        employeeDAO.delete(employee);
    }
}
