import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] main) {
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        System.out.println(Arrays.toString(s.values().toArray()));
        while (!s.isEmpty()) {
            System.out.println(s.take());
        }


    }
}
