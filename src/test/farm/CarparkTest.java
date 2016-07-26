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

    @Test
    public void testRemovingCar() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        Car car2 = new Car("R5 WMB", "Citoren", "C3", 4);
        Car car3 = new Car("GC15 WWE", "Audi", "A1", 4);
        Car car4 = new Car("DK63 WMP", "Volkswagen", "Polo", 4);
        Car car5 = new Car("DX54 CCR", "Nissan", "Micra", 4);
        Car car6 = new Car("YP63 AJG", "Skoda", "Octavia", 4);

        carpark.addCar(car);
        carpark.addCar(car2);
        carpark.addCar(car3);
        carpark.addCar(car4);
        carpark.addCar(car5);
        carpark.addCar(car6);

        carpark.removeCar(car3);
        carpark.removeCar(car4);
        carpark.removeCar(car5);

        assertThat(carpark.getCars().size(), equalTo(3));
    }

    @Test
    public void testRemovingMotorcycle() {

        Motorcycle motorcycle = new Motorcycle("AK60 VHU", "Suzuki", "SP100", 2);
        Motorcycle motorcycle2 = new Motorcycle("R5 WMB", "Suzuki", "SP125", 2);
        Motorcycle motorcycle3 = new Motorcycle("GC15 WWE", "Suzuki", "SP200", 2);
        Motorcycle motorcycle4 = new Motorcycle("YP63 AJG", "Suzuki", "SP250", 2);
        Motorcycle motorcycle5 = new Motorcycle("DK63 WMP", "Suzuki", "SP370", 2);
        Motorcycle motorcycle6 = new Motorcycle("DX54 CCR", "Suzuki", "SP400", 2);

        carpark.addMotorcycle(motorcycle);
        carpark.addMotorcycle(motorcycle2);
        carpark.addMotorcycle(motorcycle3);
        carpark.addMotorcycle(motorcycle4);
        carpark.addMotorcycle(motorcycle5);
        carpark.addMotorcycle(motorcycle6);

        carpark.removeMotorcycle(motorcycle);
        carpark.removeMotorcycle(motorcycle6);

        assertThat(carpark.getMotorcycles().size(), equalTo(4));

    }

    @Test
    public void testRemovingTruck() {

        Truck truck = new Truck("DC15 KTK", "Jeep", "Cherokee", 8);
        Truck truck2 = new Truck("AK60 VHU", "Jeep", "Cherokee", 12);
        Truck truck3 = new Truck("DK53 WMP", "Jeep", "Cherokee", 10);
        Truck truck4 = new Truck("XY65 DRF", "Jeep", "Cherokee", 6);
        Truck truck5 = new Truck("JA16 UHV", "Jeep", "Cherokee", 4);

        carpark.addTruck(truck);
        carpark.addTruck(truck2);
        carpark.addTruck(truck3);
        carpark.addTruck(truck4);
        carpark.addTruck(truck5);

        carpark.removeTruck(truck3);

        assertThat(carpark.getTrucks().size(), equalTo(4));
    }

    @Test
    public void testTotalCars() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        Car car2 = new Car("R5 WMB", "Citoren", "C3", 4);
        Car car3 = new Car("GC15 WWE", "Audi", "A1", 4);

        carpark.addCar(car);
        carpark.addCar(car2);
        carpark.addCar(car3);

        assertThat(carpark.getNumberOfCars(), equalTo(3));
    }

    @Test
    public void testTotalMotorcycles() {

        Motorcycle motorcycle = new Motorcycle("DV59 UFD", "Suzuki", "TS75", 2);
        Motorcycle motorcycle2 = new Motorcycle("WX65 FDC", "Suzuki", "TS90", 2);

        carpark.addMotorcycle(motorcycle);
        carpark.addMotorcycle(motorcycle2);

        assertThat(carpark.getNumberOfMotorcycles(), equalTo(2));
    }

    @Test
    public void testTotalTrucks() {

        Truck truck = new Truck("AK60 VHU", "Jeep", "Cherokee", 8);
        Truck truck2 = new Truck("T12 OYU", "Jeep", "Cherokee", 10);

        carpark.addTruck(truck);
        carpark.addTruck(truck2);

        assertThat(carpark.getNumberOfTrucks(), equalTo(2));
    }

    @Test
    public void testTotalVehicles() {

        assertThat(carpark.getNumberOfVehicles(), equalTo(0));

    }

    @Test
    public void testTotalVehiclesWhenNotEmpty() {

        Car car = new Car("AK60 VHU", "Seat", "Ibiza", 4);
        carpark.addCar(car);

        assertThat(carpark.getNumberOfVehicles(), equalTo(1));
    }
}
