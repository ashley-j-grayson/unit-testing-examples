package farm;

import farm.Horse;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class HorseTest {

    private Horse horse;

    @Before
    public void before() {
        horse = new Horse();
    }

    @Test
    public void testColour() {
        horse.setColour("Brown");
        String colour = horse.getColour();

        assertThat(colour, equalTo("Brown"));
    }

    @Test
    public void testConstructor() {
        horse = new Horse("Black");

        assertThat(horse.getColour(), equalTo("Black"));
    }

    @Test
    public void testHeight() {
        horse.setHeight(85);
        int height = horse.getHeight();

        assertThat(height, equalTo(85));
    }


}