package org.local.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.local.model.Employee;
import org.local.util.HibernateSessionFactoryUtil;

import java.math.BigInteger;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    private final SessionFactory sessionFactory;

    public EmployeeDAOImpl() {
        this.sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();
    }

    @Override
    public void save(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee readById(BigInteger id) {
        Employee employee;
        try (Session session = sessionFactory.openSession()) {
            employee = session.get(Employee.class, id);
        }
        return employee;
    }

    @Override
    public List<Employee> allEmployee() {
        List<Employee> employees;
        try (Session session = sessionFactory.openSession()) {
            employees = session.createQuery("from Employee", Employee.class).list();
        }
        return employees;
    }

    @Override
    public void delete(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(employee);
            transaction.commit();
        }
    }
}