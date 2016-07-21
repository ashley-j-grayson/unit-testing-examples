/**
 * Created by ashleygrayson on 20/07/2016.
 */
public class Address {

    private int addressLine1;
    private String addressLine2;
    private String townCity;
    private String country;
    private String postCode;


    Address() {

    }

    Address(int addressLine1) {

        this.addressLine1 = addressLine1;
    }

    public int getAddressLine1() {

        return this.addressLine1;
    }

    public void setAddressLine1(int addressLine1) {

        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {

        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {

        this.addressLine2 = addressLine2;
    }

    public String getTownCity() {

        return this.townCity;
    }

    public void setTownCity(String townCity) {

        this.townCity = townCity;
    }

    public String getCountry() {

        return this.country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getPostCode() {

        return this.postCode;
    }

    public void setPostCode(String postCode) {

        this.postCode = postCode;
    }


}
