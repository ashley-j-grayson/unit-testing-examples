package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashleygrayson on 26/07/2016.
 */
public class ShoppingBasket {

    private List<ShoppingItem> shoppingItems = new ArrayList<ShoppingItem>();

    public List<ShoppingItem> getShoppingItem() {

        return this.shoppingItems;
    }

    public void addShoppingItem(ShoppingItem shoppingItem) {

        if (shoppingItems.contains(shoppingItem) == false) {

            shoppingItems.add(shoppingItem);
        }
    }

    public void removeShoppingItem(ShoppingItem shoppingItem) {

        shoppingItems.remove(shoppingItem);
    }

    public int getNoOfItems() {

        int noOfItems = this.shoppingItems.size();
        return noOfItems;
    }

}
