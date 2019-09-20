package Stream;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王建锟");
        list.add("王杰");
        list.add("王明镇");
        list.add("王力宏");
        list.add("王俊凯");

        list.stream()
                .filter(str -> str.contains("王"))
                .filter(str -> str.length() == 2)
                .forEach(name -> System.out.println(name));
    }
}
