package farm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ashleygrayson on 22/07/2016.
 */
public class TruckTest {

    private Truck truck;

    @Before
    public void before() { truck = new Truck("GC15 KTK", "Jeep", "Cherokee", 10); }

    @Test
    public void testTruckLicencePlate() {

        Truck truck = new Truck("GC15 KTK", "Jeep", "Cherokee", 10);
        assertThat(truck.getLicencePlate(), equalTo("GC15 KTK"));

    }

    @Test
    public void testTruckMake() {
        Truck truck = new Truck("GC15 KTK", "Jeep", "Cherokee", 10);
        assertThat(truck.getMake(), equalTo("Jeep"));
    }

    @Test
    public void testTruckModel() {

        Truck truck = new Truck("GC15 KTK", "Jeep", "Cherokee", 10);
        assertThat(truck.getModel(), equalTo("Cherokee"));
    }

    @Test
    public void testNoOfWheels() {

        Truck truck = new Truck("GC15 KTK", "Jeep", "Cherokee", 10);
        assertThat(truck.getNoOfWheels(), equalTo(10));
    }

}
