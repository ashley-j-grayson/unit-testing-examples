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

        shoppingItems.add(shoppingItem);
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
        double postageAndPackagingTotal = 0;
        double postagePerItem = 1;

        for (int i = 0; i < this.shoppingItems.size(); i++) {


            ShoppingItem shoppingItem = this.shoppingItems.get(i);
            shoppingBasketTotal = shoppingBasketTotal + shoppingItem.getPrice();
            postageAndPackagingTotal = postageAndPackagingTotal + postagePerItem;

        }

        if (hasDiscount) {

            return (shoppingBasketTotal * 0.9) + postageAndPackagingTotal;
        }

        return shoppingBasketTotal + postageAndPackagingTotal;

    }

    public void setHasDiscount(boolean hasDiscount) {

        this.hasDiscount = hasDiscount;
    }


}
