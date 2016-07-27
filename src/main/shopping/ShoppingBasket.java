package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashleygrayson on 26/07/2016.
 */
public class ShoppingBasket {

    private List<ShoppingItem> shoppingItems = new ArrayList<ShoppingItem>();
    private boolean hasDiscount;

    public List<ShoppingItem> getShoppingItems() {

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

    public double getShoppingBasketTotal() {

        double shoppingBasketTotal = 0;

        for (int i = 0; i < this.shoppingItems.size(); i++) {


             ShoppingItem shoppingItem = this.shoppingItems.get(i);
             shoppingBasketTotal = shoppingBasketTotal + shoppingItem.getPrice();
        }

        if (hasDiscount) {

            return shoppingBasketTotal * 0.9;
        }

        return shoppingBasketTotal;

    }

    public void setHasDiscount(boolean hasDiscount) {

        this.hasDiscount = hasDiscount;
    }


}
