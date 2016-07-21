import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class RabbitTest {

    private Rabbit rabbit;

    @Before
    public void before() {
        rabbit = new Rabbit();
    }

    @Test
    public void testName() {
        rabbit.setBreed("Florida White");
        String breed = rabbit.getBreed();

        assertThat(breed, equalTo("Florida White"));
    }

    @Test
    public void testConstructor() {
        rabbit = new Rabbit("Satin");

        assertThat(rabbit.getBreed(), equalTo("Satin"));
    }

    @Test
    public void testWeight() {
        rabbit.setWeight(15);
        int weight = rabbit.getWeight();

        assertThat(weight, equalTo(15));
    }


}