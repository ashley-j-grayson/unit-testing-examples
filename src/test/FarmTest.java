import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ashleygrayson on 21/07/2016.
 */
public class FarmTest {

    private Farm farm;

    @Before
    public void before() {
        farm = new Farm();
    }

    @Test
    public void testFarmAddress() {
        Address farmAddress = new Address();
        farmAddress.setAddressLine1(27);
        farmAddress.setAddressLine2("Longfield Drive");
        farm.setFarmAddress(farmAddress);
        assertThat(farmAddress.getAddressLine1(), equalTo(27));
        assertThat(farm.getFarmAddress(), equalTo(farmAddress));
    }

    @Test
    public void testNoOfDogs() {

        assertThat(farm.getDogs().size(), equalTo(0));
    }

    @Test
    public void testNumberOfDogsWhenNotEmpty() {
        Dog dog = new Dog();
        dog.setName("Fido");

        farm.addDog(dog);

        assertThat(farm.getDogs().size(), equalTo(1));
    }

    @Test
    public void testAddingDogs() {

        Dog dog = new Dog();
        dog.setName("Molly");

        Dog dog2 = new Dog();
        dog2.setName("Benson");

        Dog dog3 = new Dog();
        dog3.setName("Buster");

        farm.addDog(dog);
        farm.addDog(dog2);
        farm.addDog(dog3);

        assertThat(farm.getDogs().size(), equalTo(3));

        assertThat(farm.getDogs().get(0).getName(), equalTo("Molly"));
        assertThat(farm.getDogs().get(1).getName(), equalTo("Benson"));
        assertThat(farm.getDogs().get(2).getName(), equalTo("Buster"));

    }

    @Test
    public void testCanOnlyAddDogOnce() {

        Dog dog = new Dog();
        dog.setName("Molly");

        farm.addDog(dog);
        farm.addDog(dog);

        assertThat(farm.getDogs().size(), equalTo(1));
    }

    @Test
    public void testRemoveDog() {

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        farm.addDog(dog);
        farm.addDog(dog2);
        farm.addDog(dog3);

        farm.removeDog(dog2);

        assertThat(farm.getDogs().size(), equalTo(2));

    }

    @Test
    public void testRemoveAnotherDog() {

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        farm.addDog(dog);
        farm.addDog(dog3);

        farm.removeDog(dog2);
        farm.removeDog(dog3);

        assertThat(farm.getDogs().size(), equalTo(1));

    }

}


