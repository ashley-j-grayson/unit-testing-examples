package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashleygrayson on 26/07/2016.
 */
public class ShoppingItem  {

    private String name;
    private double price;

    ShoppingItem(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return this.price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

}
