package org.example.db.dao.employee.entity;

import lombok.Getter;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

@Getter
public class EmployeeEntity {

    @ColumnName("ID")
    private Integer id;

    @ColumnName("NAME")
    private String name;

    @ColumnName("DepartmentID")
    private Integer departmentId;
}
