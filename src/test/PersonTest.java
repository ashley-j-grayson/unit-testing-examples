import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class PersonTest {

    private Person person;

    @Before
    public void before() {
        person = new Person();
    }

    @Test
    public void testName() {
        person.setName("Ashley");
        String name = person.getName();

        assertThat(name, equalTo("Ashley"));
    }

    @Test
    public void testConstructor() {
        person = new Person("Rick");

        assertThat(person.getName(), equalTo("Rick"));
    }

    @Test
    public void testHairColour() {
        person.setHairColour("Brown");
        String hairColour = person.getHairColour();

        assertThat(hairColour, equalTo("Brown"));
    }

    @Test
    public void testAge() {
        person.setAge(21);
        int age = person.getAge();

        assertThat(age, equalTo(21));
    }

    @Test
    public void testHeight() {
        person.setHeight(180);
        int height = person.getHeight();

        assertThat(height, equalTo(180));
    }

    @Test
    public void testWeight() {
        person.setWeight(190);
        int weight = person.getWeight();
        assertThat(weight, equalTo(190));
    }

    @Test
    public void testShoeSize() {
        //Given
        person.setShoeSize(11);

        //When
        int shoeSize = person.getShoeSize();

        //Then
        assertThat(shoeSize, equalTo(11));
    }

    @Test
    public void testHomeAddress() {
        //Given
        Address homeAddress = new Address();
        homeAddress.setAddressLine1(27);
        homeAddress.setAddressLine2("Longfield Drive, Edenthorpe");

        //When
        person.setHomeAddress(homeAddress);

        //Then
        assertThat(person.getHomeAddress().getAddressLine1(), equalTo(27));
        assertThat(person.getHomeAddress(), equalTo(homeAddress));
    }




}