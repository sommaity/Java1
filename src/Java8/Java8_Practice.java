package Java8;

import java.util.ArrayList;
import java.util.List;

public class Java8_Practice {
    static void main() {
        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);

        number.stream().filter(x->x%2==0).forEach(System.out::println);
    }


}
