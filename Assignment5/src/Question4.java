import java.util.stream.IntStream;

public class Question4 {
    public static void main(String[] args) {

//        Stream Iterator

        IntStream
                .iterate(0,i->i<=20,i->i+2)
                .forEach(System.out::print);
    }
}
