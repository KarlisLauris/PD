import Exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3Test {
    @Test
    public void Test1(){
        Joiner<String> joiner= new Joiner<>("-");
        String result = joiner.join("1","2","3","4");
        Assertions.assertEquals("1-2-3-4", result);
    }
    @Test
    public void Test2(){
        Joiner<Integer> joiner= new Joiner<>("+");
        String result = joiner.join(1,2,3,4);
        Assertions.assertEquals("1+2+3+4", result);
    }
    @Test
    public void Test3(){
        Joiner<Double> joiner= new Joiner<>("*");
        String result = joiner.join(1.1,2.2,3.3,4.4);
        Assertions.assertEquals("1.1*2.2*3.3*4.4", result);
    }
}
