package farm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ashleygrayson on 22/07/2016.
 */
public class CarTest {

    private Car car;

    @Before
    public void before() { car = new Car("AK60 VHU", "Seat", "Ibiza", 4); }

    @Test
    public void testCarLicencePlate() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        assertThat(car.getLicencePlate(), equalTo("AK60 VHU"));

    }

    @Test
    public void testCarMake() {
        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        assertThat(car.getMake(), equalTo("Seat"));
    }

    @Test
    public void testCarModel() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        assertThat(car.getModel(), equalTo("Ibiza"));
    }

    @Test
    public void testNoOfWheels() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        assertThat(car.getNoOfWheels(), equalTo(4));
    }

}
