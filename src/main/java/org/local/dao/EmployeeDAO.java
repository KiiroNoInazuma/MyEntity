package org.local.dao;

import org.local.model.Employee;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface EmployeeDAO {
    Employee readById(BigInteger id);
}
