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



        int resul = calculate(a, b, new BiFunction<Integer, Integer, Integer>(){
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });
        System.out.println(resul);

    }

    private static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);

    }
}
