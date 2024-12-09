package org.java3;

/**
 * Класс для представления информации о сотруднике.
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private double salary;
    private String birthDate;

    /**
     * Конструктор для создания объекта Person.
     *
     * @param id        уникальный идентификатор сотрудника
     * @param name      имя сотрудника
     * @param gender    пол сотрудника
     * @param department объект подразделения, в котором работает сотрудник
     * @param salary    зарплата сотрудника
     * @param birthDate дата рождения сотрудника
     */
    public Person(int id, String name, String gender, Department department, double salary, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Возвращает уникальный идентификатор сотрудника.
     *
     * @return id сотрудника
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает имя сотрудника.
     *
     * @return имя сотрудника
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает пол сотрудника.
     *
     * @return пол сотрудника
     */
    public String getGender() {
        return gender;
    }

    /**
     * Возвращает объект подразделения сотрудника.
     *
     * @return объект Department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Возвращает зарплату сотрудника.
     *
     * @return зарплата сотрудника
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Возвращает дату рождения сотрудника.
     *
     * @return дата рождения сотрудника
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Возвращает идентификатор подразделения сотрудника.
     *
     * @return id подразделения
     */
    public int getDepartmentId() {
        return department.getId();
    }

    /**
     * Возвращает название подразделения сотрудника.
     *
     * @return название подразделения
     */
    public String getDepartmentName() {
        return department.getName();
    }
}
