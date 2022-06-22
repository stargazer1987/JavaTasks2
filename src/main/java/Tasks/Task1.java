package Tasks;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) throws IOException {
        HashMap<String, FileWriter> writers = new HashMap<>();
        HashMap<String, FileReader> readers = new HashMap<>();
        String prefixPath = "src/";
        String[] fileName = {"animal", "cat", "dog"};
        String[] pathArray = new String[fileName.length];
        String extensionOfFile = ".xml";
        StringBuffer buffer = new StringBuffer();
        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter;
        FileReader fileReader;
        for(int i = 0; i < 3; i++) {
            buffer.append(prefixPath);
            buffer.append(fileName[i]);
            buffer.append(extensionOfFile);
            pathArray[i] = buffer.toString();
            buffer.delete(0, buffer.length());
        }
        for (int i = 0; i < pathArray.length; i++) {
            fileWriter = new FileWriter(pathArray[i]);
            writers.put(fileName[i], fileWriter);
        }
        for (int i = 0; i < pathArray.length; i++) {
            fileReader = new FileReader(pathArray[i]);
            readers.put(fileName[i], fileReader);
        }
        Animal animal = new Animal("Vasya", 15);
        mapper.writeValue(writers.get("animal"), animal);
        animal = mapper.readValue(readers.get("animal"), Animal.class);
        System.out.println(animal.toString());
        Cat cat = new Cat("Petya", 17, "test");
        mapper.writeValue(writers.get("cat"), cat);
        cat = mapper.readValue(readers.get("cat"), Cat.class);
        System.out.println(cat.toString());
        Dog dog = new Dog("Barsik", 15, true);
        mapper.writeValue(writers.get("dog"), dog);
        dog = mapper.readValue(readers.get("dog"), Dog.class);
        System.out.println(dog.toString());
    }
}
