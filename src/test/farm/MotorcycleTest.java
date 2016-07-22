package farm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ashleygrayson on 22/07/2016.
 */
public class MotorcycleTest {

    private Motorcycle motorcycle;

    @Before
    public void before() { motorcycle = new Motorcycle("DK53 VMP", "Suzuki", "TS50 Gaucho", 2); }

    @Test
    public void testCarLicencePlate() {

        Motorcycle motorcycle = new Motorcycle("DK53 VMP", "Suzuki", "TS50 Gaucho", 2);
        assertThat(motorcycle.getLicencePlate(), equalTo("DK53 VMP"));

    }

    @Test
    public void testCarMake() {
        Motorcycle motorcycle = new Motorcycle("DK53 VMP", "Suzuki", "TS50 Gaucho", 2);
        assertThat(motorcycle.getMake(), equalTo("Suzuki"));
    }

    @Test
    public void testCarModel() {

        Motorcycle motorcycle = new Motorcycle("DK53 VMP", "Suzuki", "TS50 Gaucho", 2);
        assertThat(motorcycle.getModel(), equalTo("TS50 Gaucho"));
    }

    @Test
    public void testNoOfWheels() {

        Motorcycle motorcycle = new Motorcycle("DK53 VMP", "Suzuki", "TS50 Gaucho", 2);
        assertThat(motorcycle.getNoOfWheels(), equalTo(2));
    }

}
