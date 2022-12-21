import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 15, 50, 30);

        list.stream().sorted().forEach(System.out::println);
    }
}
