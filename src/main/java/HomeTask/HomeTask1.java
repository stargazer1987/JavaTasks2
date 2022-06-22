package HomeTask;

import Employee.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeTask1 {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Johnny", "Bravo", "Robert", 40, 10, 200000);
        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/worker.xml");
        mapper.writeValue(fileWriter, employee);
        FileReader fileReader = new FileReader("src/worker.xml");
        employee = mapper.readValue(fileReader, Employee.class);
        System.out.println(employee.toString());
    }
}
