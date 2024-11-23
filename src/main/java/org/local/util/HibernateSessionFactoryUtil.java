package org.local.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.local.model.Employee;

public class HibernateSessionFactoryUtil {

    public static SessionFactory getSessionFactory() {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.yaml");
        conf.addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
        return conf.buildSessionFactory(
                standardServiceRegistryBuilder.applySettings(conf.getProperties()).build()
        );
    }
}
