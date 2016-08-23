package farm;

/**
 * Created by ashleygrayson on 20/07/2016.
 */
public class Person {

    private String name;
    private String hairColour;
    private int age;
    private int height;
    private int weight;
    private int shoeSize;
    private Address homeAddress;
    private Address workAddress;

    Person() {

    }

    Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getHairColour() {

        return this.hairColour;
    }

    public void setHairColour(String hairColour) {

        this.hairColour = hairColour;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getHeight() {

        return this.height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getWeight() {

        return this.weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getShoeSize() {

        return this.shoeSize;
    }

    public void setShoeSize(int shoeSize) {

        this.shoeSize = shoeSize;
    }

    public Address getHomeAddress() {

        return this.homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {

        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {

        return this.workAddress;
    }

    public void setWorkAddress(Address workAddress) {

        this.workAddress = workAddress;
    }
}
