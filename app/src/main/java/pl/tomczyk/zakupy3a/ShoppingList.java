package pl.tomczyk.zakupy3a;

import java.util.ArrayList;
import java.util.Arrays;


public class ShoppingList {
    private static ShoppingList shoppinglist = new ShoppingList(); // Zmienna statyczna szkola wykorzystująca prywatny konstruktor
    private ShoppingList(){}; // Prywatny konstruktor

   public ArrayList<String> item_list = new ArrayList<>();

    public static ShoppingList getShoppinglist() {
        return shoppinglist;
    }
}












