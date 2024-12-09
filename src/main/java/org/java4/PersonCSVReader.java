package org.java4;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParserBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для чтения данных из CSV файла и создания списка объектов Person.
 */
public class PersonCSVReader {

    /**
     * Читает данные о сотрудниках из CSV файла и возвращает список объектов Person.
     *
     * @param csvFilePath Путь к CSV файлу
     * @return Список объектов Person
     * @throws Exception Если произошла ошибка при чтении файла или преобразовании данных
     */
    public List<Person> readPeopleFromCSV(String csvFilePath) throws Exception {
        List<Person> people = new ArrayList<>();
        Map<String, Department> departments = new HashMap<>();
        int departmentIdCounter = 1;

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath);
             InputStreamReader isr = new InputStreamReader(in)) {

            CSVReader reader = new CSVReaderBuilder(isr)
                    .withCSVParser(new CSVParserBuilder().withSeparator(';').build())
                    .build();

            String[] nextLine;
            reader.readNext(); // Пропуск заголовка
            int personId = 1;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 6) {
                    String name = nextLine[1];
                    String gender = nextLine[2];
                    String birthDate = nextLine[3];
                    String divisionName = nextLine[4];
                    double salary = Double.parseDouble(nextLine[5]);

                    Department department = departments.get(divisionName);
                    if (department == null) {
                        department = new Department(departmentIdCounter++, divisionName);
                        departments.put(divisionName, department);
                    }

                    Person person = new Person(personId++, name, gender, department, salary, birthDate);
                    people.add(person);
                }
            }
        }

        return people;
    }
}
