package org.java3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * Класс для отображения списка сотрудников в графическом интерфейсе с использованием Swing.
 */
public class EmployeeViewer extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Конструктор для создания окна с таблицей сотрудников.
     */
    public EmployeeViewer() {
        setTitle("Список сотрудников");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"ID", "Name", "Gender", "Birth Date", "Department ID", "Department Name", "Salary"};

        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        loadEmployeeData();
    }

    /**
     * Загружает данные о сотрудниках из CSV файла и добавляет их в таблицу.
     */
    private void loadEmployeeData() {
        try {
            PersonCSVReader reader = new PersonCSVReader();
            List<Person> people = reader.readPeopleFromCSV("foreign_names.csv");

            for (Person person : people) {
                Object[] rowData = {
                        person.getId(),
                        person.getName(),
                        person.getGender(),
                        person.getBirthDate(),
                        person.getDepartmentId(),   // ID подразделения
                        person.getDepartmentName(), // Название подразделения
                        person.getSalary()
                };
                tableModel.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
