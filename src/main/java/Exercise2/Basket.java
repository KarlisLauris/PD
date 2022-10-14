package Exercise2;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;

//Create a Basket<T> class that imitates a basket and stores multiple T items (any kind of items) and the current number of items in the basket.
//
//        Add the addToBasket() method, which adds the element to the basket (increasing the current state by 1) and the removeFromBasket() method, which removes the element from the basket (reducing the current state by 1).
//
//        The basket can store from 0 to 10 items. When a user wants to remove an element at 0 items state or add an element at 10 items state, throw the appropriate runtime exception (BasketFullException or BasketEmptyException, exceptions created by yourself).
//
//        Create two empty classes Apple and Mushroom.
//
//        #### NB! Basket can store only one kind of items - only apples, only mushrooms etc, it cannot store both apples and mushrooms at the same time.
//
public class Basket<T> {
    private int currentNumberOfItems;
    private final int maxNumberOfItems = 10;
    private final T item;
    private T[] items;

    public Basket(T item) {
        this.item = item;
        this.currentNumberOfItems = 0;
        this.items = (T[]) new Object[maxNumberOfItems];
    }

    public void add(T item) {
        if (currentNumberOfItems == maxNumberOfItems) {
            throw new BasketFullException("Basket is full");
        }
        items[currentNumberOfItems] = item;
        currentNumberOfItems++;
    }
    public void remove(){
        if (currentNumberOfItems == 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        items[currentNumberOfItems] = null;
        currentNumberOfItems--;
    }
    @Override
    public String toString() {
        return "Basket{" +
                "currentNumberOfItems=" + currentNumberOfItems +
                ", maxNumberOfItems=" + maxNumberOfItems +
                ", item=" + item +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public int size() {
        return currentNumberOfItems;
    }
}
