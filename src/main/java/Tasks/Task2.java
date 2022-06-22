package Tasks;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Other.Address;
import Other.Nursery;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        List<Object> animals = new ArrayList<>();
        Cat cat = new Cat("Petya", 17, "test");
        Dog dog = new Dog("Barsik", 15, true);
        animals.add(cat);
        animals.add(dog);
        Address address = new Address("Russia","Novosibirsk", "South street", 40, 3, 41);
        Nursery nursery = new Nursery(animals, address, "The best nursery");
        FileWriter fileWriter = new FileWriter("src/nursery.xml");
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.writeValue(fileWriter, nursery);
        FileReader fileReader = new FileReader("src/nursery.xml");
        nursery = objectMapper.readValue(fileReader, Nursery.class);
        System.out.println(nursery.toString());
    }
}
