package shopping;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ashleygrayson on 26/07/2016.
 */
public class ShoppingBasketTest {

    private ShoppingBasket shoppingBasket;

    @Before
    public void Before() {
        shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void testNoOfItems() {

        assertThat(shoppingBasket.getNoOfItems(), equalTo(0));
    }

    @Test
    public void testAddingItem() {

        ShoppingItem shoppingItem = new ShoppingItem("Milk", 2.0);
        shoppingBasket.addShoppingItem((shoppingItem));

        assertThat(shoppingBasket.getNoOfItems(), equalTo(1));
    }

    @Test
    public void testRemovingItem() {

        ShoppingItem shoppingItem = new ShoppingItem("Dairy Milk", 0.70);
        ShoppingItem shoppingItem2 = new ShoppingItem("Yogurt", 0.20);
        ShoppingItem shoppingItem3 = new ShoppingItem("Beef", 4.20);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem2);
        shoppingBasket.addShoppingItem(shoppingItem3);

        shoppingBasket.removeShoppingItem((shoppingItem2));

        assertThat(shoppingBasket.getNoOfItems(), equalTo(2));
    }

    @Test
    public void testShoppingBasketTotal() {

        ShoppingItem shoppingItem = new ShoppingItem("Jeans", 25.5);
        ShoppingItem shoppingItem2 = new ShoppingItem("T-shirt", 10.5);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem2);

        assertThat(shoppingBasket.getShoppingBasketTotal(), equalTo(36.0));
    }

    @Test
    public void testShoppingBasketTotalWithDiscount() {

        ShoppingItem shoppingItem = new ShoppingItem("Jumper", 10.0);
        ShoppingItem shoppingItem1 = new ShoppingItem("Shorts", 10.0);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem1);

        shoppingBasket.setHasDiscount(true);

        assertThat(shoppingBasket.getShoppingBasketTotal(), equalTo(18.0));

    }

    @Test
    public void testShoppingBasketTotalWithoutDiscount() {

        ShoppingItem shoppingItem = new ShoppingItem("Jumper", 10.0);
        ShoppingItem shoppingItem1 = new ShoppingItem("Shorts", 10.0);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem1);

        shoppingBasket.setHasDiscount(false);

        assertThat(shoppingBasket.getShoppingBasketTotal(), equalTo(20.0));
    }

    @Test
    public void testPostageAndPackagingWithNoDiscount() {

        ShoppingItem shoppingItem = new ShoppingItem("T-shirt", 12.0);
        ShoppingItem shoppingItem1 = new ShoppingItem("T-shirt", 12.0);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem1);

        shoppingBasket.setHasDiscount(false);

        assertThat(shoppingBasket.getShoppingBasketTotal(), equalTo(26.0));
    }

    @Test
    public void testPostageAndPackagingWithDiscount() {

        ShoppingItem shoppingItem = new ShoppingItem("Trainers", 12.5);
        ShoppingItem shoppingItem1 = new ShoppingItem("Trainers", 12.5);

        shoppingBasket.addShoppingItem(shoppingItem);
        shoppingBasket.addShoppingItem(shoppingItem1);

        shoppingBasket.setHasDiscount(true);

        assertThat(shoppingBasket.getShoppingBasketTotal(), equalTo(24.5));
    }


}
