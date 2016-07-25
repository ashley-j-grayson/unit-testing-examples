package farm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashleygrayson on 25/07/2016.
 */
public class Carpark {

    private List<Car> cars = new ArrayList<Car>();
    private List<Motorcycle> motorcycles = new ArrayList<Motorcycle>();
    private List<Truck> trucks = new ArrayList<Truck>();

    public List<Car> getCars() {

        return this.cars;
    }

    public List<Motorcycle> getMotorcycles() {

        return this.motorcycles;
    }

    public List<Truck> getTrucks() {

        return this.trucks;
    }

    public void addCar(Car car) {

        if (cars.contains(car) == false) {

            cars.add(car);
        }
    }

    public void addMotorcycle(Motorcycle motorcycle) {

        if (motorcycles.contains(motorcycle) == false) {

            motorcycles.add(motorcycle);
        }
    }

    public void addTruck(Truck truck) {

        if (trucks.contains(truck) == false) {

            trucks.add(truck);
        }
    }

    public void removeCar(Car car) {

        cars.remove(car);
    }

    public void removeMotorcycle(Motorcycle motorcycle) {

        motorcycles.remove(motorcycle);
    }

    public void removeTruck(Truck truck) {

        trucks.remove(truck);
    }

}
