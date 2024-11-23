package org.local.dao;

import org.local.model.Employee;
import org.local.util.HibernateSessionFactoryUtil;

import java.math.BigInteger;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public Employee readById(BigInteger id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }
}
