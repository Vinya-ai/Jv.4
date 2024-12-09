package org.java3;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для класса EmployeeViewer (графический интерфейс).
 */
public class EmployeeViewerTest {

    /**
     * Тестируем, что при запуске EmployeeViewer данные корректно отображаются в таблице.
     */
    @Test
    public void testTableData() throws Exception {
        // Создаем объект EmployeeViewer
        EmployeeViewer viewer = new EmployeeViewer();

        // Используем Reflection для доступа к приватному методу loadEmployeeData
        Method loadEmployeeDataMethod = EmployeeViewer.class.getDeclaredMethod("loadEmployeeData");
        loadEmployeeDataMethod.setAccessible(true);
        loadEmployeeDataMethod.invoke(viewer);  // Вызов приватного метода

        // Используем Reflection для доступа к приватному полю table
        Field tableField = EmployeeViewer.class.getDeclaredField("table");
        tableField.setAccessible(true);
        JTable table = (JTable) tableField.get(viewer);  // Получаем значение поля table

        // Проверяем, что в таблице есть хотя бы одна строка данных
        assertTrue(table.getRowCount() > 0);
    }
}
