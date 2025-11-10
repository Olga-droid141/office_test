package org.example.db.dao.employee.entity;

import lombok.Getter;
import lombok.Setter;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.core.mapper.reflect.JdbiConstructor;


public class EmployeeEntity {

    @JdbiConstructor
    public EmployeeEntity(@ColumnName("id") Integer id,
                          @ColumnName("name") String name,
                          @ColumnName("departmentid") Integer departmentId) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
    }

    private Integer id;
    private String name;
    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }
}
