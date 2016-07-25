package farm;

/**
 * Created by ashleygrayson on 22/07/2016.
 */
public class Motorcycle extends Vehicle {

    private String licencePlate;
    private String make;
    private String model;
    private int noOfWheels;

    Motorcycle(String licencePlate, String make, String model, int noOfWheels) {

        this.licencePlate = licencePlate;
        this.make = make;
        this.model = model;
        this.noOfWheels = noOfWheels;
    }

    public String getLicencePlate() {

        return this.licencePlate;
    }

    public String getMake() {

        return this.make;
    }

    public String getModel() {

        return this.model;
    }

    public int getNoOfWheels() {

        return this.noOfWheels;
    }
}

