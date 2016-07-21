package farm;

import farm.Dog;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class DogTest {

    private Dog dog;

    @Before
    public void before() {
        dog = new Dog();
    }

    @Test
    public void testName() {
        dog.setName("Buster");
        String name = dog.getName();

        assertThat(name, equalTo("Buster"));
    }

    @Test
    public void testConstructor() {
        dog = new Dog("Misty");

        assertThat(dog.getName(), equalTo("Misty"));
    }

    @Test
    public void testAge() {
        dog.setAge(7);
        int age = dog.getAge();

        assertThat(age, equalTo(7));
    }


}