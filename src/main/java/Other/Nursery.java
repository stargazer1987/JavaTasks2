package Other;

import Animals.Animal;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Nursery {
    public Nursery() {
    }

    @Override
    public String toString() {
        return "Nursery{" +
                "animals=" + animals +
                ", address=" + address +
                ", name='" + name + '\'' +
                '}';
    }

    public Nursery(List<Object> animals, Address address, String name) {
        this.animals = animals;
        this.address = address;
        this.name = name;
    }
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "animal")
    public List<Object> animals;
    public Address address;
    public String name;
}
