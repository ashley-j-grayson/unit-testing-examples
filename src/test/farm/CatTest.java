package farm;

import farm.Cat;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class CatTest {

    private Cat cat;

    @Before
    public void before() {
        cat = new Cat();
    }

    @Test
    public void testName() {
        cat.setName("Kylie");
        String name = cat.getName();

        assertThat(name, equalTo("Kylie"));
    }

    @Test
    public void testConstructor() {
        cat = new Cat("Jess");

        assertThat(cat.getName(), equalTo("Jess"));
    }

    @Test
    public void testWeight() {
        cat.setWeight(65);
        int weight = cat.getWeight();

        assertThat(weight, equalTo(65));
    }


}