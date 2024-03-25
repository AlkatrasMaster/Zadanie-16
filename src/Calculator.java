import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;




//        var isEven = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer %2 == 0;
//            }
//        };

//        System.out.println(isEven.test(8));

//        var consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("<b>" + s + "</b>");
//            }
//        };
//
//        consumer.accept("Skillbox");

//        var supplier = new Supplier<String>() {
//            @Override
//            public String get() {
//                return "JDK 8 is cool!";
//            }
//        };



        int resul = calculate(a, b, (x, y) -> x + y);
        System.out.println(resul);

        Supplier<String> supplier = String :: new;
        System.out.println(supplier.get());

//        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
//        integers.forEach(System.out :: println);
//
//        //Consumer<String> consumer = str -> System.out.println(str);
//        Consumer<String> consumer = Calculator :: print;

    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);

    }
}
