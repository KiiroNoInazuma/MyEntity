package org.local.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.local.model.Employee;

public class HibernateSessionFactoryUtil {

    public static SessionFactory getSessionFactory() {
        Configuration conf = new Configuration();
        conf.configure();
        conf.addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
        StandardServiceRegistry build = standardServiceRegistryBuilder.applySettings(conf.getProperties()).build();
        return conf.buildSessionFactory(build);
    }
}
