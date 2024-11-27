package org.local.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.local.model.City;
import org.local.model.Employee;

public class HibernateSessionFactoryUtil {

    public static SessionFactory getSessionFactory() {
        String password = System.getProperty("password");
        Configuration conf = new Configuration();
        conf.configure();
        conf.setProperty("connection.password", password);
        conf.addAnnotatedClass(Employee.class);
        conf.addAnnotatedClass(City.class);
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
        StandardServiceRegistry build = standardServiceRegistryBuilder.applySettings(conf.getProperties()).build();
        return conf.buildSessionFactory(build);
    }
}
