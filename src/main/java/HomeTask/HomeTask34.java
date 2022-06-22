package HomeTask;

import Employee.Employee;
import Office.Office;
import Other.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeTask34 {
    public static void main(String[] args) throws IOException {

        final int MIN_SALARY = 20000;
        final int MAX_SALARY = 120000;
        final int MIN_AGE = 17;
        final int MAX_AGE = 50;
        final int MIN_EXPERIENCE = 1;
        final int MAX_EXPERIENCE = 40;

        int officesNumber = 100;
        int employeesNumber = 10;

        List<Object> officesList = new ArrayList<>();
        Random random = new Random();

        String[] names = {"Johnny", "Sergio", "Kevin", "Barbara", "Tina"};
        String[] familyNames = {"Bravo", "Leone", "Tramp", "Brenton", "Jenkins"};
        String[] middleNames = {"Robert", "Leonadro", "Peter", "Luiza", "Marion"};
        String[] countries = {"Canada", "Italy", "England", "Brazil", "Switzerland"};
        String[] cities = {"Toronto", "Milan", "London", "Sao Paolo", "Zurich"};
        String[] streets = {"Yonge", "Via Montenapoleone", "Piccadilly", "Avenida Paulista", "Bahnhofstrasse"};

        for (int i = 0; i < officesNumber; i++) {
            List<Object> employeesList = new ArrayList<>();
            for (int j = 0; j < employeesNumber; j++) {
                int age = random.nextInt(MAX_AGE) + MIN_AGE;
                int workExperience = random.nextInt(MAX_EXPERIENCE) + MIN_EXPERIENCE;
                int salary = random.nextInt(MAX_SALARY) + MIN_SALARY;

                String name = names[random.nextInt(names.length)];
                String familyName = familyNames[random.nextInt(familyNames.length)];
                String middleName = middleNames[random.nextInt(familyNames.length)];

                Employee employee = new Employee(name,familyName,middleName,age,workExperience,salary);
                employeesList.add(employee);
            }

            int numberOfHouse = (int) (Math.random() * 100);
            int numberOfFloor = (int) (Math.random() * 30);
            int numberOfFlat = (int) (Math.random() * 400);

            String country = countries[random.nextInt(countries.length)];
            String city = cities[random.nextInt(cities.length)];
            String street = streets[random.nextInt(streets.length)];

            Address address = new Address(country,city,street,numberOfHouse,numberOfFloor,numberOfFlat);
            Office office = new Office(employeesList,address);
            officesList.add(office);
        }

        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/Offices.xml");
        mapper.writeValue(fileWriter, officesList);
        FileReader fileReader = new FileReader("src/Offices.xml");
        officesList = mapper.readValue(fileReader, List.class);
        System.out.println(officesList.toString());

    }
}
