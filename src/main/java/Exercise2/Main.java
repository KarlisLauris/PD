package Exercise2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();

        Basket<Apple> appleBasket = new Basket<>(apple);
        Basket<Mushroom> mushroomBasket = new Basket<>(mushroom);

        try {
            appleBasket.add(apple);
            appleBasket.add(apple);
            appleBasket.add(apple);
            appleBasket.add(apple);
            appleBasket.add(apple);
            appleBasket.add(apple);
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            mushroomBasket.add(mushroom);
            mushroomBasket.add(mushroom);
            mushroomBasket.add(mushroom);
            mushroomBasket.add(mushroom);
            mushroomBasket.add(mushroom);
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(appleBasket);
        System.out.println(mushroomBasket);
    }
}
