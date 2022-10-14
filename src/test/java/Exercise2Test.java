import org.junit.jupiter.api.*;


import Exercise2.*;

public class Exercise2Test {
    @Test
    public void Test1(){
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket<>(apple);
        for (int i = 0; i < 10; i++) {
            basket.add(apple);
        }
        Assertions.assertEquals(10, basket.size());
    }
    @Test
    public void Test2(){
        Mushroom Mushroom = new Mushroom();
        Basket<Mushroom> basket = new Basket<>(Mushroom);
        for (int i = 0; i < 10; i++) {
            basket.add(Mushroom);
        }

        Assertions.assertEquals(10,basket.size());
    }
}
