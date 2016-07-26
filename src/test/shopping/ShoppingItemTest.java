package shopping;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ashleygrayson on 26/07/2016.
 */
public class ShoppingItemTest {

    private ShoppingItem shoppingItem;

    @Before
    public void Before() { shoppingItem = new ShoppingItem("Bread", 2.50);}

    @Test
    public void testName() {

        shoppingItem.setName("Bread");
        String name = shoppingItem.getName();

        assertThat(shoppingItem.getName(), equalTo("Bread"));

    }

    @Test
    public void testPrice() {

        shoppingItem.setPrice(3.50);
        double price = shoppingItem.getPrice();

        assertThat(shoppingItem.getPrice(), equalTo(3.50));
    }

    @Test
    public void testConstructor() {

        ShoppingItem shoppingItem = new ShoppingItem("Ham", 1.90);
        assertThat(shoppingItem.getName(), equalTo("Ham"));
    }

    @Test
    public void testConstructorPrice() {

        ShoppingItem shoppingItem = new ShoppingItem("Turkey Brest", 2.25);
        assertThat(shoppingItem.getPrice(), equalTo(2.25));
    }
}
