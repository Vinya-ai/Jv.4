package org.java4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования функциональности объекта {@link Person}.
 * Тестирует корректность создания объекта Person и проверки его свойств.
 */
public class PersonTest {

    /**
     * Тестирует создание объекта {@link Person} и проверку его свойств.
     * Создаёт объект департамента "I", а затем объект сотрудника с определенными значениями.
     * Проверяет правильность имени, пола, департамента, зарплаты и даты рождения.
     */
    @Test
    public void testFirstPerson() {
        // Создаем объект Department для департамента "I"
        Department department = new Department(1, "I");

        // Создаем объект Person для первого человека
        Person firstPerson = new Person(1, "Aahan", "Male", department, 4800, "15.05.1970");

        // Проверка имени первого человека
        assertEquals("Aahan", firstPerson.getName(), "Имя первого человека должно быть 'Aahan'");

        // Проверка пола первого человека
        assertEquals("Male", firstPerson.getGender(), "Пол первого человека должен быть 'Male'");

        // Проверка департамента первого человека
        assertNotNull(firstPerson.getDepartment(), "Департамент первого человека не должен быть null");
        assertEquals("I", firstPerson.getDepartment().getName(), "Департамент первого человека должен быть 'I'");

        // Проверка зарплаты первого человека
        assertEquals(4800, firstPerson.getSalary(), 0.01, "Зарплата первого человека должна быть 4800");

        // Проверка даты рождения первого человека
        assertEquals("15.05.1970", firstPerson.getBirthDate(), "Дата рождения первого человека должна быть '15.05.1970'");
    }
}
