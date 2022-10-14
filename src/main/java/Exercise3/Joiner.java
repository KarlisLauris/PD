package Exercise3;

public class Joiner<T> {
    //Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method that allows you to specify any number of T-type objects. This method will return a string joining all passed elements by calling their toString() method and separating them with a separator.
    //
    //        Write a test for the class.
    //
    //        e.g. for Integers and separator "-" it should return: 1-2-3-4 ...

    private final String separator;

    @SafeVarargs
    public Joiner(String separator, T... items) {
        this.separator = separator;
    }



    @SafeVarargs
    public final String join(T... elements) {
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(element).append(separator);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(1, 2, 3, 4));
    }

}
