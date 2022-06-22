package Employee;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement
public class Employee {

    @JacksonXmlProperty
    public String name;
    public String familyName;
    public String middleName;
    public int age;
    public int workExperience;
    public int salary;
    public static int id;

    public Employee(String name, String familyName, String middleName, int age, int workExperience, int salary) {
        id++;
        this.name = name;
        this.familyName = familyName;
        this.middleName = middleName;
        this.age = age;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public Employee () {}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                ", salary=" + salary +
                '}';
    }
}