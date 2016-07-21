import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class AddressTest {

    private Address address;

    @Before
    public void before() {
        address = new Address();
    }

    @Test
    public void testAddressLine1() {
        address.setAddressLine1(27);
        int addressLine1 = address.getAddressLine1();

        assertThat(addressLine1, equalTo(27));
    }

    @Test
    public void testConstructor() {
        address = new Address(24);

        assertThat(address.getAddressLine1(), equalTo(24));
    }

    @Test
    public void testAddressLine2() {
        address.setAddressLine2("Longfield Drive, Edenthorpe");
        String addressLine2 = address.getAddressLine2();

        assertThat(addressLine2, equalTo("Longfield Drive, Edenthorpe"));
    }

    @Test
    public void testTownCity() {
        address.setTownCity("Doncaster");
        String townCity = address.getTownCity();

        assertThat(townCity, equalTo("Doncaster"));
    }

    @Test
    public void testCountry() {
        address.setCountry("United Kingdom");
        String country = address.getCountry();

        assertThat(country, equalTo("United Kingdom"));
    }

    @Test
    public void testPostCode() {
        address.setPostCode("DN3 2RG");
        String postCode = address.getPostCode();

        assertThat(postCode, equalTo("DN3 2RG"));
    }
    


}