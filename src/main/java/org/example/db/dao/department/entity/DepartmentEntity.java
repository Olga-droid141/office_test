package org.example.db.dao.department.entity;

import lombok.Getter;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

@Getter
public class DepartmentEntity {

    @ColumnName("ID")
    private Integer id;

    @ColumnName("NAME")
    private String name;
}
