package org.local;

import org.local.dao.EmployeeDAOImpl;

import java.math.BigInteger;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        System.out.println(employeeDAO.readById(BigInteger.valueOf(3)));
    }
}
