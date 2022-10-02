import java.util.Arrays;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> unModifiableList = List.copyOf(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(unModifiableList);

        unModifiableList.add(10);
    }
}
