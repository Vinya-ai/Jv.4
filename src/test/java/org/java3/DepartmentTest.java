package org.java3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для класса Department
 */
public class DepartmentTest {

    /**
     * Тест для конструктора Department и геттеров.
     */
    @Test
    public void testDepartmentConstructorAndGetters() {
        // Создаем объект Department
        Department department = new Department(1, "Sales");

        // Проверяем значения, переданные в конструктор
        assertEquals(1, department.getId());
        assertEquals("Sales", department.getName());
    }
}
