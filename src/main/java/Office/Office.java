package Office;

import Other.Address;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Office {
    @JacksonXmlElementWrapper(localName = "employees")
    @JacksonXmlProperty(localName = "employee")
    public List<Object> employees;
    @JacksonXmlProperty
    public Address address;

    public Office() {}

    public Office(List<Object> employees, Address address) {
        this.employees = employees;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Office{" +
                "employees=" + employees +
                ", address=" + address +
                '}';
    }
}

