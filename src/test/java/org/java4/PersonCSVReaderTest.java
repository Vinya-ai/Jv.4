package org.java4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Класс для тестирования функциональности чтения данных из CSV файла.
 */
public class PersonCSVReaderTest {

    /**
     * Тестирует метод {@link PersonCSVReader#readPeopleFromCSV(String)}.
     * Этот тест проверяет, что данные из CSV файла корректно считываются
     * и соответствуют ожидаемым значениям для первого человека в списке.
     *
     * @throws Exception если возникает ошибка при чтении файла или преобразовании данных
     */
    @Test
    public void testReadPeopleFromCSV() throws Exception {

        // Путь к CSV файлу
        String csvFilePath = "foreign_names.csv";  // Убедитесь, что указали правильный путь

        // Создаем экземпляр PersonCSVReader
        PersonCSVReader reader = new PersonCSVReader();

        // Чтение данных из CSV
        List<Person> people = reader.readPeopleFromCSV(csvFilePath);

        // Проверяем, что список людей не пуст
        assertFalse(people.isEmpty(), "Список людей не должен быть пустым");

        // Проверяем первый объект Person
        Person firstPerson = people.get(0);

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
