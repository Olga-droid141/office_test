package org.example.db;

import lombok.experimental.UtilityClass;
import org.example.db.dao.employee.EmployeeDao;

@UtilityClass
public class DaoRepository {

    public EmployeeDao employeeDao = new EmployeeDao();
}