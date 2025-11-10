package org.example.test;

import org.example.db.DaoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Выполнение задания 2 модулю JDBC")
public class Task2Test extends BaseTest {

    @Test
    @DisplayName("Проверка удаления департамента")
    public void deleteDepartmentTest() {
        Assertions.assertFalse(DaoRepository.employeeDao.findEmployeesByDepId(1));
    }
}
