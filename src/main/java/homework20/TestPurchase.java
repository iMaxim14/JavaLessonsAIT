package homework20;

import java.util.ArrayList;

public class TestPurchase {
    public static void main(String[] args) {
        ArrayList<Purchase> purchases = new ArrayList<>();
        Purchase purchaseOne = new Purchase("Молоко", 1.5);
        Purchase purchaseTwo = new Purchase("Колбаса", 0.8);
        purchases.add(purchaseOne);
        purchases.add(purchaseTwo);

        Purchase.addPurchase(purchases, "апельсин", 0.9);
        System.out.println(purchases);
    }

}
