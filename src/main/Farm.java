import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashleygrayson on 21/07/2016.
 */
public class Farm {

    private Address farmAddress;
    private List<Dog> dogs = new ArrayList<Dog>();

    Farm() {

    }

    Farm(Address farmAddress) {
        this.farmAddress = farmAddress;
    }

    public Address getFarmAddress() {

        return this.farmAddress;
    }

    public void setFarmAddress(Address farmAddress) {

       this.farmAddress = farmAddress;
    }

    public List<Dog> getDogs() {

        return this.dogs;
    }

    public void addDog(Dog dog) {

        if (dogs.contains(dog) == false) {

            dogs.add(dog);
        }
    }

    public void removeDog(Dog dog) {

        dogs.remove(dog);
    }


}
