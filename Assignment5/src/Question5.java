import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Question5 {
    public static void main(String[] args) {
        //IfPresentOrElse
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>5)
                .findFirst().ifPresentOrElse(
                        (e)-> System.out.println("The value is::"+e),
                        ()->System.out.println("Value does not exists")
                );


        //Or

        Optional<Integer> optionalInteger = Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(e->e>50)
                .findFirst()
                .or(()-> Optional.of(-1));

        System.out.println(optionalInteger.get());

        //OrElseThrow
        IntStream
                .rangeClosed(1,10)
                .filter(e->e>50)
                .findFirst().orElseThrow();





    }
}
