package org.example.db.dao.employee;

import jdk.jfr.Registered;
import org.example.db._base._BaseMainDao;
import org.example.db.dao.employee.entity.EmployeeEntity;
import org.jdbi.v3.core.result.ResultIterable;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EmployeeDao extends _BaseMainDao {

    public EmployeeDao() {
        super();
    }

    public boolean findEmployeesByDepId(Integer departmentID) {
        final String query = """
                SELECT * FROM Employee WHERE DepartmentID = ?
                """;
        return jdbi.withHandle(handle ->
            handle.createQuery(query)
                    .bind(0,departmentID)
                    .mapTo(EmployeeEntity.class)
                    .findFirst()
                    .isPresent()
        );
    }
}
