package Animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Cat")
public class Cat extends Animal {

    public String kind;
    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", withTail=" + withTail +
                '}';
    }

    public Cat(String name, int age, String kind) {
        super(name,age);
        this.kind = kind;
    }
}
