package farm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ashleygrayson on 25/07/2016.
 */
public class CarparkTest {

    private Carpark carpark;

    @Before
    public void before() {
        carpark = new Carpark();
    }

    @Test
    public void testNoOfCars() {

        assertThat(carpark.getCars(), equalTo(0));
    }

    @Test
    public void testAddingCar() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        Car car2 = new Car("DC15 KTK", "Audi", "A1", 4);
        carpark.addCar(car);
        carpark.addCar(car2);
        assertThat(carpark.getCars().size(), equalTo(2));
    }

    @Test
    public void testAddingMotorcycle() {

        Motorcycle motorcycle = new Motorcycle("T12 0YU", "Honda", "D500", 2);
        Motorcycle motorcycle2 = new Motorcycle("DC15 KTK", "Suzuki", "PR600", 2);
        carpark.addMotorcycle(motorcycle);
        carpark.addMotorcycle(motorcycle2);
        assertThat(carpark.getMotorcycles().size(), equalTo(2));
    }

    @Test
    public void testAddingTruck() {

        Truck truck = new Truck("T12 0YU", "Honda", "D500", 10);
        Truck truck2 = new Truck("DC15 KTK", "Jeep", "Cherokee", 8);
        carpark.addTruck(truck);
        carpark.addTruck(truck2);
        assertThat(carpark.getTrucks().size(), equalTo(2));
    }
}
