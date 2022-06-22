package Animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Dog")
public class Dog extends Animal {
    public boolean isTrained;
    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isTrained=" + isTrained +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", withTail=" + withTail +
                '}';
    }

    public Dog(String name, int age, boolean isTrained) {
        super(name,age);
        this.isTrained = isTrained;
    }
}
