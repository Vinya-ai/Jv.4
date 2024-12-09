package org.java4;

/**
 * Класс для представления подразделения, в котором работают сотрудники.
 */
public class Department {
    private int id;
    private String name;

    /**
     * Конструктор для создания объекта Department.
     *
     * @param id   уникальный идентификатор подразделения
     * @param name название подразделения
     */
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Возвращает уникальный идентификатор подразделения.
     *
     * @return id подразделения
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает название подразделения.
     *
     * @return название подразделения
     */
    public String getName() {
        return name;
    }
}
