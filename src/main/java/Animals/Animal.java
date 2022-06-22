package Animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Animal")

public class Animal {
    public Animal() {
    }
    @JacksonXmlProperty(isAttribute = true)
    public String type;
    public String name;
    public int age;
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", withTail=" + withTail +
                '}';
    }

    public boolean withTail;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.type = this.getClass().getSimpleName();
    }
}
