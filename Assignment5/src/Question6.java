import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Question6 {
    public static void main(String[] args) {
        IntStream.range(1,10).filter(value -> value>5).
                findFirst()
                .stream()
                .mapMulti((number, Consumer) -> IntStream.rangeClosed(1,10)
                        .forEach(value -> Consumer.accept(number * value)))
                                .forEach(System.out::println);



    }
}
